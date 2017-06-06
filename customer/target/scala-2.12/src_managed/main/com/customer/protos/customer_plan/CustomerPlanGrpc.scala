package com.customer.protos.customer_plan

object CustomerPlanGrpc {
  val METHOD_ASSOCIATE_CUSTOMER_TO_PLAN: _root_.io.grpc.MethodDescriptor[com.customer.protos.customer_plan.Request, com.customer.protos.customer_plan.Reply] =
    _root_.io.grpc.MethodDescriptor.create(
      _root_.io.grpc.MethodDescriptor.MethodType.UNARY,
      _root_.io.grpc.MethodDescriptor.generateFullMethodName("com.customer.protos.CustomerPlan", "associateCustomerToPlan"),
      new com.trueaccord.scalapb.grpc.Marshaller(com.customer.protos.customer_plan.Request),
      new com.trueaccord.scalapb.grpc.Marshaller(com.customer.protos.customer_plan.Reply))
  
  trait CustomerPlan extends _root_.com.trueaccord.scalapb.grpc.AbstractService {
    override def serviceCompanion = CustomerPlan
    def associateCustomerToPlan(request: com.customer.protos.customer_plan.Request): scala.concurrent.Future[com.customer.protos.customer_plan.Reply]
  }
  
  object CustomerPlan extends _root_.com.trueaccord.scalapb.grpc.ServiceCompanion[CustomerPlan] {
    implicit def serviceCompanion: _root_.com.trueaccord.scalapb.grpc.ServiceCompanion[CustomerPlan] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = com.customer.protos.customer_plan.CustomerPlanProto.javaDescriptor.getServices().get(0)
  }
  
  trait CustomerPlanBlockingClient {
    def serviceCompanion = CustomerPlan
    def associateCustomerToPlan(request: com.customer.protos.customer_plan.Request): com.customer.protos.customer_plan.Reply
  }
  
  class CustomerPlanBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[CustomerPlanBlockingStub](channel, options) with CustomerPlanBlockingClient {
    override def associateCustomerToPlan(request: com.customer.protos.customer_plan.Request): com.customer.protos.customer_plan.Reply = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_ASSOCIATE_CUSTOMER_TO_PLAN, options), request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): CustomerPlanBlockingStub = new CustomerPlanBlockingStub(channel, options)
  }
  
  class CustomerPlanStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[CustomerPlanStub](channel, options) with CustomerPlan {
    override def associateCustomerToPlan(request: com.customer.protos.customer_plan.Request): scala.concurrent.Future[com.customer.protos.customer_plan.Reply] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_ASSOCIATE_CUSTOMER_TO_PLAN, options), request))
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): CustomerPlanStub = new CustomerPlanStub(channel, options)
  }
  
  def bindService(serviceImpl: CustomerPlan, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder("com.customer.protos.CustomerPlan")
    .addMethod(
      METHOD_ASSOCIATE_CUSTOMER_TO_PLAN,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[com.customer.protos.customer_plan.Request, com.customer.protos.customer_plan.Reply] {
        override def invoke(request: com.customer.protos.customer_plan.Request, observer: _root_.io.grpc.stub.StreamObserver[com.customer.protos.customer_plan.Reply]): Unit =
          serviceImpl.associateCustomerToPlan(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): CustomerPlanBlockingStub = new CustomerPlanBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): CustomerPlanStub = new CustomerPlanStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = com.customer.protos.customer_plan.CustomerPlanProto.javaDescriptor.getServices().get(0)
  
}