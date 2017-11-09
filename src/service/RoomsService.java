package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;



import entity.Rooms;
import manager.ManagerHelper;


@Path("/rooms")
public class RoomsService {

	@GET
	@Path("getRoomsByid")
	public Rooms getRoomsByid(@QueryParam("id") int id) {
		return ManagerHelper.getRoomsManager().get(id);
	}
	
	

}
