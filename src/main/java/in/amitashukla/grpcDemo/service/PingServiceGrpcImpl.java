package in.amitashukla.grpcDemo.service;

import in.amitashukla.grpc.PingRequest;
import in.amitashukla.grpc.PingResponse;
import in.amitashukla.grpc.PingServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class PingServiceGrpcImpl extends PingServiceGrpc.PingServiceImplBase {
	@Override
	public void ping(PingRequest request, StreamObserver<PingResponse> responseObserver) {
		PingResponse response = PingResponse.newBuilder()
				.setMessage("pong")
				.build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}