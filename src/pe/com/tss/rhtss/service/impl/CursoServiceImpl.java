package pe.com.tss.rhtss.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.tss.rhtss.dao.CursoDao;
import pe.com.tss.rhtss.service.CursoService;

@Service("cursoService")
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoDao cursoDao;
	
	public void listarCurso(Map<String, Object> outParameters) {

		cursoDao.listarCurso(outParameters);

	}

}
