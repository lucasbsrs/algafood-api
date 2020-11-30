package com.algaworks.algafood.di.notificacao;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {

    private String hostServidor;
    private Integer portaServidor;
}
