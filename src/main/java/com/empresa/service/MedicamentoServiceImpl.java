package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {
	
	
	@Autowired
	private MedicamentoRepository repository;
	
	@Override
	public List<Medicamento> listaMedicamento() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Medicamento> listaMedicamentoPorId(int idMedicamento) {
		// TODO Auto-generated method stub
		return repository.findById(idMedicamento);
	}

	@Override
	public List<Medicamento> listaMedicamentoPorNombreLike(String nombre) {
		// TODO Auto-generated method stub
		return repository.findByNombreLike(nombre);
	}

	

}
