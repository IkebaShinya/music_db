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

import models.Song;
import utils.DBUtil;

/**
 * Servlet implementation class ResultServlet
 */
@WebServlet("/result")
public class ResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str =  (String)request.getParameter("select");

        String[] select = str.split("&");

        EntityManager em = DBUtil.createEntityManager();
        request.setAttribute("str0", select[0]);
        request.setAttribute("str1", select[1]);
        request.setAttribute("str2", select[2]);

        //ソングモデルを全件もったリストを作る
        List<Song> song = em.createNamedQuery("songSelect",Song.class).getResultList();

        if(select[2].equals("アーティスト")){
            //そんでキーで検索。
            for(Song s : song){
                if(s.getArtist_num() == Integer.parseInt(select[0])){
                    request.setAttribute("song", s);
                }
                /*if(s.getArtist_num() == 1){
                    request.setAttribute("song", s);
                }*/
            }
            //動的にsqlを頑張る
            //Song s = em.createQuery("SELECT s FROM Song AS s", Song.class).getSingleResult();
            request.setAttribute("name", select[1]);
        }else if(select[2].equals("シリーズ")){
            //そんでキーで検索。
            for(Song s : song){
                if(s.getSeries_num() == Integer.parseInt(select[0])){
                    request.setAttribute("song", s);
                }
                /*if(s.getArtist_num() == 1){
                    request.setAttribute("song", s);
                }*/
            }
            request.setAttribute("name", select[1]);
        }else if(select[2].equals("曲調")){
            //そんでキーで検索。
            for(Song s : song){
                if(s.getTune_num() == Integer.parseInt(select[0])){
                    request.setAttribute("song", s);
                }
                /*if(s.getArtist_num() == 1){
                    request.setAttribute("song", s);
                }*/
            }
            request.setAttribute("name", select[1]);
        }
        em.close();

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/music/result.jsp");
        rd.forward(request, response);
    }

}
