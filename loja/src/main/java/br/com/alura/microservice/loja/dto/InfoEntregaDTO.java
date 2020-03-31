package br.com.alura.microservice.loja.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class InfoEntregaDTO {
	
private Long pedidoId;
	
	private LocalDate dataParaEntrega;
	
	private String enderecoOrigem;
	
	private String enderecoDestino;

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public LocalDate getDataParaEntrega() {
		return dataParaEntrega;
	}

	public void setDataParaEntrega(LocalDate dataParaEntrega) {
		this.dataParaEntrega = dataParaEntrega;
	}

	public String getEnderecoOrigem() {
		return enderecoOrigem;
	}

	public void setEnderecoOrigem(String enderecoOrigem) {
		this.enderecoOrigem = enderecoOrigem;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

	@Override
	public String toString() {
		return "InfoEntregaDTO [pedidoId=" + pedidoId + ", dataParaEntrega=" + dataParaEntrega + ", enderecoOrigem="
				+ enderecoOrigem + ", enderecoDestino=" + enderecoDestino + "]";
	}
	
	
	
	

}
