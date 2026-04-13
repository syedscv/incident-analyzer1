# 🚀 AI-Powered Incident Analyzer (PoC)

## 📌 Overview

This project is a Spring Boot-based microservice that analyzes application logs and provides:

* Error identification
* Root cause analysis
* Severity classification
* Suggested fixes

It simulates an **AI-powered incident analysis system**, designed to be extended with LLMs and RAG (Retrieval-Augmented Generation) for intelligent troubleshooting.

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot 3.x
* REST APIs
* Swagger (OpenAPI)
* Lombok
* JUnit
* Docker
* Kubernetes

---

## 🔥 Features

* Analyze logs via REST API
* Detect common errors:

  * NullPointerException
  * TimeoutException
  * DatabaseConnectionException
  * OutOfMemoryError
* Provide:

  * Root cause
  * Suggested fix
  * Severity level
  * AI confidence score
* Swagger UI for API testing
* Unit test coverage
* Dockerized for container deployment
* Kubernetes-ready

---

## 📡 API Endpoints

### 🔹 1. Analyze Incident

**POST** `/incident/analyze`

#### Request:

```json
{
  "log": "NullPointerException occurred"
}
```

#### Response:

```json
{
  "error": "NullPointerException",
  "severity": "HIGH",
  "rootCause": "Object not initialized",
  "similarIncidents": ["INC1001", "INC1002"],
  "suggestedFix": "Add null checks or initialize object",
  "aiConfidence": "92%"
}
```

---

### 🔹 2. Health Check

**GET** `/incident/health`

#### Response:

```
Incident Analyzer is running
```

---

## 📖 Swagger UI

Access Swagger UI for testing APIs:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🧪 Running the Application

### ▶️ Using Maven

```bash
./mvnw spring-boot:run
```

---

### 🧪 Running Tests

```bash
./mvnw test
```

---

## 🐳 Docker

### 🔨 Build Image

```bash
docker build -t incident-analyzer .
```

### ▶️ Run Container

```bash
docker run -p 8080:8080 incident-analyzer
```

---

## ☸️ Kubernetes Deployment

### Apply Deployment

```bash
kubectl apply -f deployment.yaml
```

### Apply Service

```bash
kubectl apply -f service.yaml
```

---

## 🧠 Architecture (High-Level)

```
Client → REST API → Incident Analyzer Service → (Future: AI/RAG Service)
```

---

## 🤖 Future Enhancements (AI Integration)

This PoC is designed to evolve into a full AI-powered system:

* Integrate LLM APIs (OpenAI / internal models)

* Convert logs into embeddings

* Store in Vector DB (FAISS / Pinecone)

* Implement RAG pipeline:

  ```
  Log → Embedding → Vector Search → LLM → Response
  ```

* Automated incident resolution suggestions

* Real-time log ingestion

---

## 🎯 Use Case

This system can be used by service-based companies (e.g., Capgemini) to:

* Reduce debugging time
* Improve SLA adherence
* Automate incident triaging
* Enhance developer productivity

---

## 🏁 Conclusion

This project demonstrates how AI can enhance incident management systems by automating log analysis and providing intelligent insights.

While currently rule-based, the architecture is designed to seamlessly integrate with modern AI technologies like LLMs and RAG.

---

## 👨‍💻 Author

Developed as part of a rapid PoC to demonstrate backend engineering, cloud readiness, and AI integration capability.
