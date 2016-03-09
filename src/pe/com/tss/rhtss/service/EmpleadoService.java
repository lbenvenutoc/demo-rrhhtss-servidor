package pe.com.tss.rhtss.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import pe.com.tss.rhtss.model.Curso;
import pe.com.tss.rhtss.model.Empleado;

public interface EmpleadoService {

	public void listarEmpleado(Map<String, Object> outParameters);

	public void buscarEmpleado_1(Empleado empleado, Map<String, Object> outParameters);

	public void insertarEmpleado(Empleado empleado, Map<String, Object> outParameters);

	public void actualizarEmpleado(Empleado empleado, Map<String, Object> outParameters);

	public void obtenerEmpleado(Integer idEmployee, Map<String, Object> outParameters);

	public List<Empleado> buscarEmpleado(Empleado empleado);

	public void obtenerCursoPorEmpleado(Integer idEmployee, Map<String, Object> outParameters);

	public void actualizarCursoPorEmpleado(Curso curso, Map<String, Object> outParameters);

	public void insertarCursoPorEmpleado(Curso curso, Map<String, Object> outParameters);

}
