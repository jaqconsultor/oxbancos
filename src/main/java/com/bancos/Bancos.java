package com.bancos;
 
import javax.persistence.*;

import org.openxava.annotations.*;

import com.extensiones.*;

import lombok.*;

@Entity @Getter @Setter
@View(name="Simple", // Esta vista solo se usará cuando se especifique “Simple”
members="id, descripcion" // Muestra únicamente numero y nombre en la misma línea
)
public class Bancos extends Incrementable4 {
	
	@Column(length = 6)
	@DefaultValueCalculator(ConsecutivoBancos.class) 
	@ReadOnly 	
	@SearchKey
	int numero;
	
	String nombre;
	
	String piso;
	
	String apartamento;
	
	String telefono;
	
	String correo;
	
		
}





