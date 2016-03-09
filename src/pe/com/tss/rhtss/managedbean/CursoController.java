package pe.com.tss.rhtss.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.com.tss.rhtss.model.Curso;
import pe.com.tss.rhtss.service.CursoService;

/**
 * 
 * @author LUIS BENVENUTO
 */
@Controller
public class CursoController implements Serializable {
	

	private static Logger logger = Logger.getLogger(CursoController.class);

	@Autowired
	private CursoService cursoService;
	
	
	@RequestMapping(value = "/listarCurso", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<Curso> listarCurso() {
		List<Curso> lstCurso = new ArrayList<Curso>();
		HashMap<String, Object> outParametersCurso = new HashMap<String, Object>();
		cursoService.listarCurso(outParametersCurso);
		lstCurso = (List<Curso>) outParametersCurso.get("lstCur");
		System.out.println(lstCurso);

		return lstCurso;
	}
	
	
	/*
	 * @RequestMapping(value = "/curso/{id}/mostrarCurso", method =
	 * RequestMethod.GET, headers = "Accept=application/xml, application/json")
	 * public @ResponseBody Curso mostrarActualizarCurso(@PathVariable("id") int
	 * id) {
	 * 
	 * Map params = new HashMap(); params.put("idcurso", id);
	 * params.put("codigoresp", -1); params.put("mensajeresp", ""); Curso curso
	 * = servicioCurso.obtenerCurso(params);
	 * 
	 * return curso;
	 * 
	 * }
	 * 
	 * 
	 * @RequestMapping(value = "/curso/insertar", method = RequestMethod.POST,
	 * headers = "Accept=application/xml, application/json")
	 * public @ResponseBody RespuestaBase insertarCurso(@RequestBody Curso
	 * curso) {
	 * 
	 * Map params = new HashMap(); RespuestaBase respuesta = new
	 * RespuestaBase();
	 * 
	 * params.put("nombrecurso", curso.getNombreCurso());
	 * params.put("codigoresp", -1); params.put("mensajeresp", ""); respuesta =
	 * servicioCurso.grabarCurso(params);
	 * 
	 * return respuesta;
	 * 
	 * }
	 * 
	 * // show update form
	 * 
	 * @RequestMapping(value = "/curso/actualizar", method = RequestMethod.POST,
	 * headers = "Accept=application/xml, application/json")
	 * public @ResponseBody RespuestaBase actualizarCurso(@RequestBody Curso
	 * curso) {
	 * 
	 * Map params = new HashMap(); params.put("nombrecurso",
	 * curso.getNombreCurso()); params.put("idcurso", curso.getCodigoCurso());
	 * params.put("codigoresp", -1); params.put("mensajeresp", "");
	 * RespuestaBase respuesta = new RespuestaBase(); respuesta =
	 * servicioCurso.actualizarCurso(params);
	 * 
	 * return respuesta;
	 * 
	 * }
	 * 
	 * // show update form
	 * 
	 * @RequestMapping(value = "/curso/eliminar/{id}", method =
	 * RequestMethod.POST, headers = "Accept=application/xml, application/json")
	 * public @ResponseBody RespuestaBase eliminarCurso(@PathVariable("id") int
	 * id) {
	 * 
	 * Map params = new HashMap(); params.put("idcurso", id);
	 * params.put("codigoresp", -1); params.put("mensajeresp", "");
	 * 
	 * RespuestaBase respuesta = new RespuestaBase(); respuesta =
	 * servicioCurso.eliminarCurso(params);
	 * 
	 * return respuesta;
	 * 
	 * }
	 * 
	 * @RequestMapping(value = "/listarCurso1", method = RequestMethod.GET,
	 * headers = "Accept=application/json") public @ResponseBody List<Curso>
	 * listarCurso1() {
	 * 
	 * List<Curso> lstCurso = new ArrayList<Curso>(); lstCurso =
	 * servicioCurso.listarCurso1(); logger.info("CANTIDAD CURSOS " +
	 * lstCurso.size()); logger.info("curso " +
	 * lstCurso.get(0).getNombreCurso()); return lstCurso; }
	 */

}
