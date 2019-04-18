/**
 *  Ring Contact Sensor v1
 *
 *  Copyright 2019 Javier Jimenez
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 */
metadata {
	definition (name: "Ring Contact Sensor", namespace: "javierj", author: "Javier Jimenez", cstHandler: true) {
		capability "Contact Sensor"
        capability "Sensor"
	}

	tiles() {
        standardTile("contact", "device.contact", decoration: "flat", width: 2, height: 2) {
        	state("closed", label:'${name}', icon:"st.contact.contact.closed", backgroundColor:"#00A0DC")
			state("open", label:'${name}', icon:"st.contact.contact.open", backgroundColor:"#e86d13")     
        }
	}
}
