package org.apache.http.client.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

@Deprecated
/* loaded from: classes2.dex */
public class URLEncodedUtils {
    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String NAME_VALUE_SEPARATOR = "=";
    private static final String PARAMETER_SEPARATOR = "&";

    private static String decode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String format(List<? extends NameValuePair> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (NameValuePair nameValuePair : list) {
            String strEncode = encode(nameValuePair.getName(), str);
            String value = nameValuePair.getValue();
            String strEncode2 = value != null ? encode(value, str) : "";
            if (sb.length() > 0) {
                sb.append(PARAMETER_SEPARATOR);
            }
            sb.append(strEncode);
            sb.append(NAME_VALUE_SEPARATOR);
            sb.append(strEncode2);
        }
        return sb.toString();
    }

    public static boolean isEncoded(HttpEntity httpEntity) {
        Header contentType = httpEntity.getContentType();
        return contentType != null && contentType.getValue().equalsIgnoreCase(CONTENT_TYPE);
    }

    public static List<NameValuePair> parse(URI uri, String str) {
        List<NameValuePair> listEmptyList = Collections.emptyList();
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null || rawQuery.length() <= 0) {
            return listEmptyList;
        }
        ArrayList arrayList = new ArrayList();
        parse(arrayList, new Scanner(rawQuery), str);
        return arrayList;
    }

    public static List<NameValuePair> parse(HttpEntity httpEntity) throws ParseException, IOException {
        List<NameValuePair> listEmptyList = Collections.emptyList();
        if (isEncoded(httpEntity)) {
            String string = EntityUtils.toString(httpEntity);
            Header contentEncoding = httpEntity.getContentEncoding();
            if (string != null && string.length() > 0) {
                listEmptyList = new ArrayList<>();
                parse(listEmptyList, new Scanner(string), contentEncoding != null ? contentEncoding.getValue() : null);
            }
        }
        return listEmptyList;
    }

    public static void parse(List<NameValuePair> list, Scanner scanner, String str) {
        scanner.useDelimiter(PARAMETER_SEPARATOR);
        while (scanner.hasNext()) {
            String[] strArrSplit = scanner.next().split(NAME_VALUE_SEPARATOR);
            if (strArrSplit.length != 0 && strArrSplit.length <= 2) {
                list.add(new BasicNameValuePair(decode(strArrSplit[0], str), strArrSplit.length == 2 ? decode(strArrSplit[1], str) : null));
            } else {
                throw new IllegalArgumentException("bad parameter");
            }
        }
    }
}
