
package pe.com.tss.rhtss.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CursoDao {
	public void listarCurso(@Param("outParameters") Map<String, Object> outParameters);

}
