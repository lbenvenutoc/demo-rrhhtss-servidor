package pe.com.tss.rhtss.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import pe.com.tss.rhtss.model.Curso;
import pe.com.tss.rhtss.model.Empleado;

public interface EmpleadoDao {

	public void listarEmpleado(@Param("outParameters") Map<String, Object> outParameters);

	public void buscarEmpleado_1(@Param("empleado") Empleado empleado,
			@Param("outParameters") Map<String, Object> outParameters);
	
	public List<Empleado>  buscarEmpleado(@Param("empleado") Empleado empleado);

	public void insertarEmpleado(@Param("empleado") Empleado empleado,
			@Param("outParameters") Map<String, Object> outParameters);

	public void actualizarEmpleado(@Param("empleado") Empleado empleado,
			@Param("outParameters") Map<String, Object> outParameters);

	public void obtenerEmpleado(@Param("idEmployee") Integer idEmployee,
			@Param("outParameters") Map<String, Object> outParameters);
	
	public void obtenerCursoPorEmpleado(@Param("idEmployee") Integer idEmployee,
			@Param("outParameters") Map<String, Object> outParameters);
	
	public void actualizarCursoPorEmpleado(@Param("curso") Curso curso,
			@Param("outParameters") Map<String, Object> outParameters);
	
	public void insertarCursoPorEmpleado(@Param("curso") Curso curso,
			@Param("outParameters") Map<String, Object> outParameters);
	

}
