package com.dlopez.rest.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.dlopez.business.naat.NAATCreditLinePartitionInfo;
import com.dlopez.business.naat.NAATInParameter;
import com.dlopez.business.naat.NAATOutParameter;
import com.dlopez.business.test.PruebaBusiness;
import com.dlopez.utils.ApiUtils;

@ApplicationPath("/")
@Path("prueba")
public class ApiRest extends Application {

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response pruebaRest() {
		StringBuilder s = new StringBuilder();
		s.append("{");
		s.append("\"message\":\"hola Mundo.\"");
		s.append("}");

		return Response.ok(s.toString()).build();
	}

	@GET
	@Path("/prueba-2")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response pruebaDos() {
		PruebaBusiness out = new PruebaBusiness(1, "Diego López");
		return Response.ok(ApiUtils.objectToJsonString(out)).build();
	}

	@GET
	@Path("/prueba-3")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response pruebaTres() {
		List<PruebaBusiness> out = new ArrayList<>();

		for (int i = 1; i <= 15; i++) {
			out.add(new PruebaBusiness(i, "Prueba " + i));
		}

		return Response.ok(ApiUtils.objectToJsonString(out)).build();
	}

	@GET
	@Path("/prueba-4")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<PruebaBusiness> pruebaCuatro() {
		List<PruebaBusiness> out = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			out.add(new PruebaBusiness(i, "Prueba " + i));
		}

		return out;
	}

	@POST
	@Path("/naatservicetest")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response naatServicesTest(NAATInParameter inParameter) {
		NAATOutParameter out = new NAATOutParameter();

		if (inParameter == null) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("Data Required");
			return ApiUtils.resposeBadRequest(out);
		}
		if (inParameter.getApplicationId() == null) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("applicationId Required");
			return ApiUtils.resposeBadRequest(out);
		}
		if (inParameter.getCardId() == null) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("cardId Required");
			return ApiUtils.resposeBadRequest(out);
		}
		if (inParameter.getMainCardId() == null) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("mainCardId Required");
			return ApiUtils.resposeBadRequest(out);
		}
		if (inParameter.getCardType() == null) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("cardType Required");
			return ApiUtils.resposeBadRequest(out);
		}
		if (!"MAIN".equals(inParameter.getCardType())) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("cardType member of 'MAIN'");
			return ApiUtils.resposeBadRequest(out);
		}
		if (inParameter.getCustomerId() == null) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("customerId Required");
			return ApiUtils.resposeBadRequest(out);
		}
		if (inParameter.getCreditLinePartitions() == null || inParameter.getCreditLinePartitions().isEmpty()) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("creditLinePartitions Required");
			return ApiUtils.resposeBadRequest(out);
		}

		NAATCreditLinePartitionInfo creditLinePartition = inParameter.getCreditLinePartitions().get(0)
				.getCreditLinePartition();
		if (creditLinePartition == null) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("creditLinePartition Required");
			return ApiUtils.resposeBadRequest(out);
		}
		if (creditLinePartition.getCreditLinePartitionTypeId() == null) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("creditLinePartitionTypeId Required");
			return ApiUtils.resposeBadRequest(out);
		}
		if (creditLinePartition.getCreditLimit() == null) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("creditLimit Required");
			return ApiUtils.resposeBadRequest(out);
		}
		if (creditLinePartition.getCurrencyId() == null) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("currencyId Required");
			return ApiUtils.resposeBadRequest(out);
		}
		if (creditLinePartition.getDescCrLinePartitionType() == null) {
			out.setCode("APIKIT:BAD_REQUEST");
			out.setMessage("currencyId Required");
			return ApiUtils.resposeBadRequest(out);
		}

		out.setCode("OK");
		out.setMessage("Se ejecuto correctamente");
		out.setResultInd("T");
		return Response.ok(ApiUtils.objectToJsonString(out)).build();
	}
}
