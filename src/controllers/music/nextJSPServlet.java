package controllers.music;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Artist;
import models.Series;
import models.Tune;
import utils.DBUtil;

/**
 * Servlet implementation class nextJSPServlet
 */
@WebServlet("/next")
public class nextJSPServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public nextJSPServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String select = (String)request.getParameter("select");

        EntityManager em = DBUtil.createEntityManager();

        if(select.equals("アーティスト")){
            List<Artist> table = em.createNamedQuery("artSelect",Artist.class).getResultList();

            request.setAttribute("table", table);
            request.setAttribute("name", select);

        }else if(select.equals("シリーズ")){
            List<Series> table = em.createNamedQuery("seriesSelect",Series.class).getResultList();

            request.setAttribute("table", table);
            request.setAttribute("name", select);
        }else if(select.equals("曲調")){
            List<Tune> table = em.createNamedQuery("tuneSelect",Tune.class).getResultList();

            request.setAttribute("table", table);
            request.setAttribute("name", select);
        }
        em.close();

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/music/serach.jsp");
        rd.forward(request, response);
    }
}
