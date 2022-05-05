package com.nttdata.incloud.dto;

import com.nttdata.incloud.model.ConsumoMovimiento;
import com.nttdata.incloud.model.Persona;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AhorroDTO {


	public Persona persona;

	public ConsumoMovimiento consumoMovimiento;


}
