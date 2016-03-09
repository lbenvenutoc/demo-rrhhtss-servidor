package pe.com.tss.rhtss.managedbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriComponentsBuilder;

import pe.com.tss.rhtss.model.Curso;
import pe.com.tss.rhtss.model.Empleado;
import pe.com.tss.rhtss.service.EmpleadoService;

@Controller
public class EmpleadoController {

	private static Logger logger = Logger.getLogger(CursoController.class);

	@Autowired
	private EmpleadoService empleadoService;

	@RequestMapping(value = "/listarEmpleado", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Empleado>> listarEmpleado() {
		List<Empleado> lstEmpleado = new ArrayList<Empleado>();
		HashMap<String, Object> outParametersEmpleado = new HashMap<String, Object>();
		empleadoService.listarEmpleado(outParametersEmpleado);
		lstEmpleado = (List<Empleado>) outParametersEmpleado.get("lstEmp");

		if (lstEmpleado.isEmpty()) {
			return new ResponseEntity<List<Empleado>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Empleado>>(lstEmpleado, HttpStatus.OK);
	}

	@RequestMapping(value = "/buscarEmpleado/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<Empleado>> buscarEmpleado(@RequestBody Empleado empleado) {
		List<Empleado> lstEmpleado = new ArrayList<Empleado>();
		// HashMap<String, Object> outParametersEmpleado = new HashMap<String,
		// Object>();
		System.out.println("empleado.getFirstLastName " + empleado.getFirstLastName());
		// empleadoService.buscarEmpleado(empleado, outParametersEmpleado);
		// lstEmpleado = (List<Empleado>) outParametersEmpleado.get("lstEmp");
		lstEmpleado = empleadoService.buscarEmpleado(empleado);
		if (lstEmpleado.isEmpty()) {
			return new ResponseEntity<List<Empleado>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Empleado>>(lstEmpleado, HttpStatus.OK);
	}
	/*
	@RequestMapping(value = "/insertarEmpleado/", method = RequestMethod.POST)
	public void insertarEmpleado(@RequestBody Empleado empleado) {
		HashMap<String, Object> outParametersEmpleado = new HashMap<String, Object>();
		System.out.println("ENTRA " + empleado.getFirstLastName());
		empleadoService.insertarEmpleado(empleado, outParametersEmpleado);
	}
	*/
	@RequestMapping(value = "/insertarEmpleado/", method = RequestMethod.POST)
	public ResponseEntity<Empleado>  insertarEmpleado(@RequestBody Empleado empleado) {
		HashMap<String, Object> outParametersEmpleado = new HashMap<String, Object>();		
		System.out.println("ENTRA " + empleado.getFirstLastName());
		empleadoService.insertarEmpleado(empleado, outParametersEmpleado);
		Integer codEmp=0;
		codEmp = (Integer)outParametersEmpleado.get("idEmployee");
		empleado.setIdEmployee(codEmp);
		if (empleado.getIdEmployee()==null) {
			return new ResponseEntity<Empleado>(HttpStatus.NO_CONTENT);
		}		
		return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/actualizarEmpleado/", method = RequestMethod.PUT)
	public void actualizarEmpleado(@RequestBody Empleado empleado) {
		HashMap<String, Object> outParametersEmpleado = new HashMap<String, Object>();
		System.out.println("ENTRA " + empleado.getFirstLastName());
		empleadoService.actualizarEmpleado(empleado, outParametersEmpleado);
	}

	@RequestMapping(value = "/obtenerEmpleado/{idEmployee}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Empleado> obtenerEmpleado(@PathVariable("idEmployee") Integer idEmployee) {
		List<Empleado> lstEmpleado = new ArrayList<Empleado>();
		Empleado objEmpleado = null;
		HashMap<String, Object> outParametersEmpleado = new HashMap<String, Object>();
		empleadoService.obtenerEmpleado(idEmployee, outParametersEmpleado);
		lstEmpleado = (List<Empleado>) outParametersEmpleado.get("lstEmp");
		if (lstEmpleado.isEmpty()) {
			return new ResponseEntity<Empleado>(HttpStatus.NO_CONTENT);
		}
		objEmpleado = lstEmpleado.get(0);
		return new ResponseEntity<Empleado>(objEmpleado, HttpStatus.OK);
	}

	@RequestMapping(value = "/obtenerCursoPorEmpleado/{idEmployee}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Curso>> obtenerCursoPorEmpleado(@PathVariable("idEmployee") Integer idEmployee) {
		List<Curso> lstCurso = new ArrayList<Curso>();
		HashMap<String, Object> outParametersEmpleado = new HashMap<String, Object>();
		empleadoService.obtenerCursoPorEmpleado(idEmployee, outParametersEmpleado);
		lstCurso = (List<Curso>) outParametersEmpleado.get("lstCur");

		if (lstCurso.isEmpty()) {
			return new ResponseEntity<List<Curso>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Curso>>(lstCurso, HttpStatus.OK);
	}

	@RequestMapping(value = "/actualizarCursoPorEmpleado/", method = RequestMethod.PUT)
	public void actualizarCursoPorEmpleado(@RequestBody Curso curso) {
		HashMap<String, Object> outParametersEmpleado = new HashMap<String, Object>();
		System.out.println("ENTRA " + curso.getvNomCur());
		empleadoService.actualizarCursoPorEmpleado(curso, outParametersEmpleado);
	}
	
	@RequestMapping(value = "/insertarCursoPorEmpleado/", method = RequestMethod.POST)
	public void insertarCursoPorEmpleado(@RequestBody Curso curso) {
		HashMap<String, Object> outParametersEmpleado = new HashMap<String, Object>();
		//System.out.println("ENTRA " + curso.getFirstLastName());
		empleadoService.insertarCursoPorEmpleado(curso, outParametersEmpleado);
	}

}
