package io.github.kevinoshea.skeletonreactspring;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.message.GZipEncoder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.TracingConfig;
import org.glassfish.jersey.server.filter.EncodingFilter;
import org.springframework.stereotype.Component;

import io.github.kevinoshea.skeletonreactspring.resources.UserResource;

@Component
@ApplicationPath("/rest")
public class JerseyApplication extends ResourceConfig {

	public JerseyApplication() {

		register(UserResource.class);

		EncodingFilter.enableFor(this, GZipEncoder.class);

		register(MultiPartFeature.class);

		property(ServerProperties.TRACING, TracingConfig.ON_DEMAND.name());
	}
}
