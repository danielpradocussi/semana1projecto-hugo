package com.nttdata.incloud.dto;

import com.nttdata.incloud.model.Empresa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivosRequestDTO {

	@Getter
	@Setter
	public String nombre;
	
	@Getter
	@Setter
	public Empresa empresa;

}
