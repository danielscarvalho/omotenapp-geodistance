package om.geo.api;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import om.geo.Geo;
import om.geo.GeoPoint;

/**
 * Servlet implementation class GeoService
 */
@WebServlet("/geoservice")
public class GeoService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeoService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * Teste USP to UFRJ: http://localhost:8080/OM-GEO/geoservice?latitude1=-23.559444444444&\
longitude1=-46.723888888889&latitude2=-22.8625&longitude2=-43.2239
	 * Teste Taj+Mahal to Christ+the+Redeemer : http://localhost:8080/OM-GEO/geoservice?latitude1=27.1751448&\
longitude1=78.0399535&latitude2=-22.951916&longitude2=-43.2126759
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GeoPoint p1 = new GeoPoint(
							request.getParameter("latitude1"),
							request.getParameter("longitude1"));
		
		GeoPoint p2 = new GeoPoint(
							request.getParameter("latitude2"),
							request.getParameter("longitude2"));

		Geo g = new Geo();
		Double distance = g.getGeoDistance(p1, p2);
		
		response.getWriter().append(String.valueOf(distance));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
