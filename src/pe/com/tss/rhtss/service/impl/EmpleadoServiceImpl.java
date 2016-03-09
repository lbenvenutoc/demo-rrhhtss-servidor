package pe.com.tss.rhtss.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.tss.rhtss.dao.EmpleadoDao;
import pe.com.tss.rhtss.model.Curso;
import pe.com.tss.rhtss.model.Empleado;
import pe.com.tss.rhtss.service.EmpleadoService;

@Service("empleadoService")
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao empleadoDao;

	@Override
	public void listarEmpleado(Map<String, Object> outParameters) {
		empleadoDao.listarEmpleado(outParameters);
	}

	@Override
	public void insertarEmpleado(Empleado empleado, Map<String, Object> outParameters) {
		empleadoDao.insertarEmpleado(empleado, outParameters);
	}

	@Override
	public void obtenerEmpleado(Integer idEmployee, Map<String, Object> outParameters) {
		empleadoDao.obtenerEmpleado(idEmployee, outParameters);

	}

	@Override
	public void actualizarEmpleado(Empleado empleado, Map<String, Object> outParameters) {
		empleadoDao.actualizarEmpleado(empleado, outParameters);

	}

	@Override
	public void buscarEmpleado_1(Empleado empleado, Map<String, Object> outParameters) {
		empleadoDao.buscarEmpleado_1(empleado, outParameters);

	}

	@Override
	public List<Empleado> buscarEmpleado(Empleado empleado) {
		return empleadoDao.buscarEmpleado(empleado);

	}

	@Override
	public void obtenerCursoPorEmpleado(Integer idEmployee, Map<String, Object> outParameters) {
		empleadoDao.obtenerCursoPorEmpleado(idEmployee, outParameters);
	}

	@Override
	public void actualizarCursoPorEmpleado(Curso curso, Map<String, Object> outParameters) {
		empleadoDao.actualizarCursoPorEmpleado(curso, outParameters);

	}

	@Override
	public void insertarCursoPorEmpleado(Curso curso, Map<String, Object> outParameters) {
		empleadoDao.insertarCursoPorEmpleado(curso, outParameters);

	}

}
