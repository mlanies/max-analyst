package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class v14 implements ypa {
    public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // defpackage.ypa
    public final Object g(Uri uri, w24 w24Var) throws IOException, NumberFormatException {
        String line = new BufferedReader(new InputStreamReader(w24Var, b52.c)).readLine();
        try {
            Matcher matcher = a.matcher(line);
            if (!matcher.matches()) {
                String strValueOf = String.valueOf(line);
                throw ParserException.b(null, strValueOf.length() != 0 ? "Couldn't parse timestamp: ".concat(strValueOf) : new String("Couldn't parse timestamp: "));
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j2 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw ParserException.b(e, null);
        }
    }
}
