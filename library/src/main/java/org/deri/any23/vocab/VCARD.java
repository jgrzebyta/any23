/*
 * Copyright 2008-2010 Digital Enterprise Research Institute (DERI)
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

package org.deri.any23.vocab;

import org.openrdf.model.URI;

import java.util.HashMap;
import java.util.Map;

/**
 * Vocabulary definitions from vcard.owl
 *
 * @author Auto-generated by schemagen
 */
public class VCARD extends Vocabulary {

    /**
     * The namespace of the vocabulary as a string.
     */
    public static final String NS = "http://www.w3.org/2006/vcard/ns#";

    /**
     * The namespace of the vocabulary as a URI.
     */
    public static final URI NAMESPACE = createURI(NS);

    /**
     * An additional part of a person's name.
     */
    public static final URI additional_name = createProperty("additional-name");

    /**
     * A postal or street address of a person.
     */
    public static final URI adr = createProperty("adr");

    /**
     * A person that acts as one's agent.
     */
    public static final URI agent = createProperty("agent");

    /**
     * The birthday of a person.
     */
    public static final URI bday = createProperty("bday");

    /**
     * A category of a vCard.
     */
    public static final URI category = createProperty("category");

    /**
     * A class (e.g., public, private, etc.) of a vCard.
     */
    public static final URI class_ = createProperty("class");

    /**
     * The country of a postal address.
     */
    public static final URI country_name = createProperty("country-name");

    /**
     * An email address.
     */
    public static final URI email = createProperty("email");

    /**
     * The extended address of a postal address.
     */
    public static final URI extended_address = createProperty("extended-address");

    /**
     * A family name part of a person's name.
     */
    public static final URI family_name = createProperty("family-name");

    /**
     * A fax number of a person.
     */
    public static final URI fax = createProperty("fax");

    /**
     * A formatted name of a person.
     */
    public static final URI fn = createProperty("fn");

    /**
     * A geographic location associated with a person.
     */
    public static final URI geo = createProperty("geo");

    /**
     * A given name part of a person's name.
     */
    public static final URI given_name = createProperty("given-name");

    /**
     * A home address of a person.
     */
    public static final URI homeAdr = createProperty("homeAdr");

    /**
     * A home phone number of a person.
     */
    public static final URI homeTel = createProperty("homeTel");

    /**
     * An honorific prefix part of a person's name.
     */
    public static final URI honorific_prefix = createProperty("honorific-prefix");

    /**
     * An honorific suffix part of a person's name.
     */
    public static final URI honorific_suffix = createProperty("honorific-suffix");

    /**
     * A key (e.g, PKI key) of a person.
     */
    public static final URI key = createProperty("key");

    /**
     * The formatted version of a postal address (a string with embedded line breaks,
     * punctuation, etc.).
     */
    public static final URI label = createProperty("label");

    /**
     * The latitude of a geographic location.
     */
    public static final URI latitude = createProperty("latitude");

    /**
     * The locality (e.g., city) of a postal address.
     */
    public static final URI locality = createProperty("locality");

    /**
     * A logo associated with a person or their organization.
     */
    public static final URI logo = createProperty("logo");

    /**
     * The longitude of a geographic location.
     */
    public static final URI longitude = createProperty("longitude");

    /**
     * A mailer associated with a vCard.
     */
    public static final URI mailer = createProperty("mailer");

    /**
     * A mobile email address of a person.
     */
    public static final URI mobileEmail = createProperty("mobileEmail");

    /**
     * A mobile phone number of a person.
     */
    public static final URI mobileTel = createProperty("mobileTel");

    /**
     * The components of the name of a person.
     */
    public static final URI n = createProperty("n");

    /**
     * The nickname of a person.
     */
    public static final URI nickname = createProperty("nickname");

    /**
     * Notes about a person on a vCard.
     */
    public static final URI note = createProperty("note");

    /**
     * An organization associated with a person.
     */
    public static final URI org = createProperty("org");

    /**
     * The name of an organization.
     */
    public static final URI organization_name = createProperty("organization-name");

    /**
     * The name of a unit within an organization.
     */
    public static final URI organization_unit = createProperty("organization-unit");

    /**
     * An email address unaffiliated with any particular organization or employer;
     * a personal email address.
     */
    public static final URI personalEmail = createProperty("personalEmail");

    /**
     * A photograph of a person.
     */
    public static final URI photo = createProperty("photo");

    /**
     * The post office box of a postal address.
     */
    public static final URI post_office_box = createProperty("post-office-box");

    /**
     * The postal code (e.g., U.S. ZIP code) of a postal address.
     */
    public static final URI postal_code = createProperty("postal-code");

    /**
     * The region (e.g., state or province) of a postal address.
     */
    public static final URI region = createProperty("region");

    /**
     * The timestamp of a revision of a vCard.
     */
    public static final URI rev = createProperty("rev");

    /**
     * A role a person plays within an organization.
     */
    public static final URI role = createProperty("role");

    /**
     * A version of a person's name suitable for collation.
     */
    public static final URI sort_string = createProperty("sort-string");

    /**
     * A sound (e.g., a greeting or pronounciation) of a person.
     */
    public static final URI sound = createProperty("sound");

    /**
     * The street address of a postal address.
     */
    public static final URI street_address = createProperty("street-address");

    /**
     * A telephone number of a person.
     */
    public static final URI tel = createProperty("tel");

    /**
     * A person's title.
     */
    public static final URI title = createProperty("title");

    /**
     * A timezone associated with a person.
     */
    public static final URI tz = createProperty("tz");

    /**
     * A UID of a person's vCard.
     */
    public static final URI uid = createProperty("uid");

    /**
     * An (explicitly) unlabeled address of a person.
     */
    public static final URI unlabeledAdr = createProperty("unlabeledAdr");

    /**
     * An (explicitly) unlabeled email address of a person.
     */
    public static final URI unlabeledEmail = createProperty("unlabeledEmail");

    /**
     * An (explicitly) unlabeled phone number of a person.
     */
    public static final URI unlabeledTel = createProperty("unlabeledTel");

    /**
     * A URL associated with a person.
     */
    public static final URI url = createProperty("url");

    /**
     * A work address of a person.
     */
    public static final URI workAdr = createProperty("workAdr");

    /**
     * A work email address of a person.
     */
    public static final URI workEmail = createProperty("workEmail");

    /**
     * A work phone number of a person.
     */
    public static final URI workTel = createProperty("workTel");

    /**
     * Resources that are vCard (postal) addresses.
     */
    public static final URI Address = createURI("http://www.w3.org/2006/vcard/ns#Address");

    public static final URI addressType = createProperty("addressType");

    /**
     * Resources that are vCard Telephones.
     */
    public static final URI Telephone = createURI("http://www.w3.org/2006/vcard/ns#Address");

    /**
     * Resources that are vCard geographic locations.
     */
    public static final URI Location = createURI("http://www.w3.org/2006/vcard/ns#Location");

    /**
     * Resources that are vCard personal names.
     */
    public static final URI Name = createURI("http://www.w3.org/2006/vcard/ns#Name");

    /**
     * Resources that are vCard organizations.
     */
    public static final URI Organization = createURI("http://www.w3.org/2006/vcard/ns#Organization");

    /**
     * Resources that are vCards
     */
    public static final URI VCard = createURI("http://www.w3.org/2006/vcard/ns#VCard");

    private static Map<String, URI> propertyMap;

    public static URI getProperty(String name) {
        return propertyMap.get(name);
    }

    private static URI createProperty(String localName) {
        if(propertyMap == null) {
             propertyMap = new HashMap<String, URI>();
        }
        URI result = createURI("http://www.w3.org/2006/vcard/ns#" + localName);
        propertyMap.put(localName, result);
        return result;
    }

    public VCARD(){}
}
