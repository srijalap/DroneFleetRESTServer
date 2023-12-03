# Drone Transportation Service

The Drone Delivery Service is a RESTful API for managing drones in a food delivery service. Below are the functionalities provided by the service.

## Functionalities
### 1.Info Service
#### Endpoint: `/dronora/info`
Returns a "Hello World" type of information.

**Example Request:**

```bash
curl http://localhost:8080/dronora/info
Hello World%                                  
```

### 2. Get Drone Status

#### Endpoint: `/dronora/drones`

Retrieve the status of all drones in the fleet.

**Example Request:**

```bash
curl http://localhost:8080/dronora/drones
[{"id":"123","name":"Vim-v2","capacity":320}]% 
```