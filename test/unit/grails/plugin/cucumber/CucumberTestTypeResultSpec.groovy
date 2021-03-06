/*
 * Copyright 2011 Martin Hauner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package grails.plugin.cucumber

import spock.lang.Specification


class CucumberTestTypeResultSpec extends Specification {

    def "number of passed tests without failures" () {
        when:
        def passed = 10
        def result = new CucumberTestTypeResult (passed, 0, 0)

        then:
        result.passCount == passed
    }

    def "number of passed tests with failures" () {
        when:
        def passed = 10
        def failures = 3
        def result = new CucumberTestTypeResult (passed, failures, 0)

        then:
        result.passCount == 7
    }

}
