package com.epam.mentoring.plugin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Url Encoder Plugin implementation. Encodes and prints encoded string in console.
 *
 * @author vkrasovsky
 */
public class UrlEncoderPlugin implements Plugin {
    private static final Logger LOGGER = LogManager.getLogger(UrlEncoderPlugin.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public void processInput(String input) {
        try {
            String encoded = URLEncoder.encode(input, "UTF-8");
            LOGGER.info(MenuConstants.DELIMITER);
            LOGGER.info("Encoded url: " + encoded);
            LOGGER.info(MenuConstants.DELIMITER);
        } catch (UnsupportedEncodingException e) {
            LOGGER.debug("Cannot find encoding");
        }
    }
}
