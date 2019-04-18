/**
 *  Ring Motion Sensor v1
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
	definition (name: "Ring Motion Sensor", namespace: "javierj", author: "Javier Jimenez", cstHandler: true) {
		capability "Motion Sensor"
        capability "Sensor"
	}

	tiles() {
		standardTile("motion", "device.motion", decoration: "flat", width: 2, height: 2) {
            state("inactive", label: '${name}', icon: "st.motion.motion.inactive", backgroundColor: "#00A0DC")
       		state("active", label: '${name}',icon: "st.motion.motion.active", backgroundColor: "#e86d13")
        }
	}
}
