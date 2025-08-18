package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.RtpParameters;
import org.webrtc.RtpSender;

/* loaded from: classes2.dex */
public final class hd9 {
    public final a4c a;

    public /* synthetic */ hd9(a4c a4cVar) {
        this.a = a4cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kd9 a(org.json.JSONObject r16, defpackage.zad r17) throws org.json.JSONException {
        /*
            r0 = r16
            java.lang.String r1 = "movieId"
            long r1 = r0.getLong(r1)
            java.lang.String r3 = "initiatorId"
            java.lang.String r3 = r0.getString(r3)
            bg1 r3 = defpackage.bg1.a(r3)
            java.lang.String r4 = "title"
            java.lang.String r8 = r0.getString(r4)
            java.lang.String r4 = "source"
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r5 = "MOVIE"
            boolean r5 = r4.equals(r5)
            r6 = 0
            if (r5 == 0) goto L2b
            id9 r4 = defpackage.id9.a
        L29:
            r9 = r4
            goto L37
        L2b:
            java.lang.String r5 = "STREAM"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L36
            id9 r4 = defpackage.id9.b
            goto L29
        L36:
            r9 = r6
        L37:
            if (r9 != 0) goto L3a
            return r6
        L3a:
            java.lang.String r4 = "externalMovieId"
            java.lang.String r7 = r0.getString(r4)
            java.lang.String r4 = "duration"
            long r4 = r0.optLong(r4)
            r10 = 0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L50
            ad9 r4 = defpackage.ad9.e
            r10 = r4
            goto L58
        L50:
            bd9 r6 = new bd9
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r6.<init>(r4, r10)
            r10 = r6
        L58:
            kd9 r4 = new kd9
            zc9 r12 = new zc9
            cd9 r6 = new cd9
            r6.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "thumbnails"
            org.json.JSONArray r0 = r0.optJSONArray(r2)
            if (r0 == 0) goto L9a
            int r2 = r0.length()
            r5 = 0
        L73:
            if (r5 >= r2) goto L9a
            org.json.JSONObject r11 = r0.getJSONObject(r5)
            od9 r13 = new od9
            java.lang.String r14 = "url"
            java.lang.String r14 = r11.optString(r14)
            java.lang.String r15 = "width"
            int r15 = r11.optInt(r15)
            r16 = r0
            java.lang.String r0 = "height"
            int r0 = r11.optInt(r0)
            r13.<init>(r14, r15, r0)
            r1.add(r13)
            int r5 = r5 + 1
            r0 = r16
            goto L73
        L9a:
            pd9 r11 = new pd9
            r11.<init>(r1)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = r17
            r4.<init>(r3, r0, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd9.a(org.json.JSONObject, zad):kd9");
    }

    public static nd9 b(JSONObject jSONObject) throws JSONException {
        long j = jSONObject.getLong("movieId");
        bg1 bg1VarA = bg1.a(jSONObject.getString("initiatorId"));
        String string = jSONObject.getString("source");
        id9 id9Var = string.equals("MOVIE") ? id9.a : string.equals("STREAM") ? id9.b : null;
        if (id9Var == null) {
            return null;
        }
        Integer numValueOf = jSONObject.has("roomId") ? Integer.valueOf(jSONObject.optInt("roomId")) : null;
        return new nd9(bg1VarA, numValueOf != null ? new yad(numValueOf.intValue()) : xad.a, new cd9(j), id9Var);
    }

    public void c(RtpSender rtpSender, String str) {
        nsa.A().b();
        this.a.log("RtpSenderHelper", "set audio bitrate range to 6000-48000, priority=1.0");
        d(rtpSender, str, 6000, 48000, Double.valueOf(1.0d), true);
    }

    public void d(RtpSender rtpSender, String str, int i, int i2, Double d, boolean z) {
        try {
            e(rtpSender, str, i, i2, d, z);
        } catch (Throwable th) {
            this.a.reportException("RtpSenderHelper", "Failed to set bitrate of ".concat(str), th);
        }
    }

    public void e(RtpSender rtpSender, String str, int i, int i2, Double d, boolean z) {
        a4c a4cVar = this.a;
        if (rtpSender == null) {
            a4cVar.log("RtpSenderHelper", str.concat(": no sender"));
            return;
        }
        RtpParameters parameters = rtpSender.getParameters();
        if (parameters.encodings.isEmpty()) {
            a4cVar.log("RtpSenderHelper", str.concat(": RtpParameters are not ready yet"));
            return;
        }
        boolean z2 = false;
        for (RtpParameters.Encoding encoding : parameters.encodings) {
            Integer num = encoding.maxBitrateBps;
            if (num == null || num.intValue() != i2) {
                encoding.maxBitrateBps = Integer.valueOf(i2);
                z2 = true;
            }
            Integer num2 = encoding.minBitrateBps;
            if (num2 == null || num2.intValue() != i) {
                encoding.minBitrateBps = Integer.valueOf(i);
                z2 = true;
            }
            if (d != null && encoding.bitratePriority != d.doubleValue()) {
                encoding.bitratePriority = d.doubleValue();
                z2 = true;
            }
            if (encoding.adaptiveAudioPacketTime != z) {
                encoding.adaptiveAudioPacketTime = z;
                z2 = true;
            }
        }
        if (!z2) {
            a4cVar.log("RtpSenderHelper", str + " encodings update not needed. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
            return;
        }
        if (rtpSender.setParameters(parameters)) {
            a4cVar.log("RtpSenderHelper", str + " encodings update done. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
            return;
        }
        a4cVar.log("RtpSenderHelper", str + " encodings update failed. bitrate=[" + i + "-" + i2 + "](bps),priority=" + d + ",adaptiveAudioPTime=" + z);
    }

    public void f(RtpSender rtpSender, String str, boolean z, Integer num, Integer num2, Integer num3, RtpParameters.DegradationPreference degradationPreference) {
        if (rtpSender == null) {
            return;
        }
        RtpParameters parameters = rtpSender.getParameters();
        boolean zIsEmpty = parameters.encodings.isEmpty();
        a4c a4cVar = this.a;
        if (zIsEmpty) {
            a4cVar.log("RtpSenderHelper", str.concat(": RtpParameters are not ready yet"));
            return;
        }
        for (RtpParameters.Encoding encoding : parameters.encodings) {
            if (!tpa.f(encoding.maxBitrateBps, num)) {
                encoding.maxBitrateBps = num;
                z = true;
            }
            if (!tpa.f(encoding.numTemporalLayers, num2)) {
                encoding.numTemporalLayers = num2;
                z = true;
            }
            if (!tpa.f(encoding.maxFramerate, num3)) {
                encoding.maxFramerate = num3;
                z = true;
            }
        }
        if (parameters.degradationPreference != degradationPreference) {
            parameters.degradationPreference = degradationPreference;
            z = true;
        }
        if (!z) {
            a4cVar.log("RtpSenderHelper", "No " + str + " change detected. Ignore update");
            return;
        }
        if (rtpSender.setParameters(parameters)) {
            a4cVar.log("RtpSenderHelper", "Sender parameters for " + str + ": maxBitrate=" + num + ", numTemporalLayers=" + num2 + ", maxFramerate=" + num3 + ", degradationPreference=" + degradationPreference);
            return;
        }
        a4cVar.log("RtpSenderHelper", "Failed to set sender parameters for " + str + ": maxBitrate=" + num + ", numTemporalLayers=" + num2 + ", maxFramerate=" + num3 + ", degradationPreference=" + degradationPreference);
    }

    public int g(RtpSender rtpSender) {
        List<RtpParameters.Encoding> list;
        RtpParameters.Encoding encoding;
        if (rtpSender == null) {
            return 0;
        }
        try {
            RtpParameters parameters = rtpSender.getParameters();
            Integer num = (parameters == null || (list = parameters.encodings) == null || (encoding = (RtpParameters.Encoding) x53.i0(list)) == null) ? null : encoding.maxBitrateBps;
            if (num == null) {
                return 0;
            }
            return num.intValue();
        } catch (Throwable th) {
            this.a.reportException("RtpSenderHelper", "Unable to get sender max bitrate", th);
            return 0;
        }
    }

    public List h(JSONObject jSONObject, zad zadVar) {
        kd9 kd9VarA;
        zc9 zc9Var;
        a4c a4cVar = this.a;
        nz4 nz4Var = nz4.a;
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("movieShareInfos");
            if (jSONArrayOptJSONArray == null) {
                return nz4Var;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    kd9VarA = a(jSONArrayOptJSONArray.getJSONObject(i), zadVar);
                } catch (Throwable th) {
                    a4cVar.logException("VideoStreamsParser", "Can't parse movie", th);
                    kd9VarA = null;
                }
                if (kd9VarA != null && (zc9Var = kd9VarA.c) != null) {
                    arrayList.add(zc9Var);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            a4cVar.logException("VideoStreamsParser", "Can't parse movies", th2);
            return nz4Var;
        }
    }
}
