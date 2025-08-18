package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class are {
    public static final String[] b;
    public static final yu0 c;
    public static final yu0 d;
    public final je7 a;

    static {
        Pattern.compile("#u([0-9a-f]{2,16})(#\\d+:\\d+)?s#");
        b = new String[]{"B", "kB", "MB", "GB", "TB"};
        c = new yu0(9);
        d = new yu0(10);
    }

    public are(je7 je7Var) {
        this.a = je7Var;
    }

    public static CharSequence a(String str, uj3 uj3Var, ida idaVar, boolean z) {
        String strD = uj3Var.d();
        int iIndexOf = str.indexOf(strD);
        if (iIndexOf < 0) {
            return str;
        }
        int length = strD.length() + iIndexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!z) {
            if (idaVar.f == -1) {
                khe kheVar = sme.a0;
                idaVar.f = fm9.R(idaVar.a).t;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(idaVar.f), iIndexOf, length, 33);
            spannableStringBuilder.setSpan(new al3(uj3Var.n()), iIndexOf, length, 33);
        }
        idaVar.c(spannableStringBuilder, uj3Var.u(), z, length);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder b(String str, q10 q10Var, uj3 uj3Var, ida idaVar, el3 el3Var, boolean z) {
        int iIndexOf;
        xs xsVar = new xs(0);
        xsVar.add(Long.valueOf(uj3Var.n()));
        xsVar.addAll(q10Var.c);
        xsVar.add(Long.valueOf(q10Var.b));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (idaVar.f == -1) {
            khe kheVar = sme.a0;
            idaVar.f = fm9.R(idaVar.a).t;
        }
        int i = idaVar.f;
        qs qsVar = new qs(xsVar);
        while (qsVar.hasNext()) {
            Long l = (Long) qsVar.next();
            uj3 uj3VarI = el3Var.i(l.longValue(), true);
            String strD = uj3VarI.d();
            if (!oag.t(strD) && (iIndexOf = spannableStringBuilder.toString().indexOf(strD)) >= 0) {
                int length = strD.length() + iIndexOf;
                if (!z) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i), iIndexOf, length, 33);
                    spannableStringBuilder.setSpan(new al3(l.longValue()), iIndexOf, length, 33);
                }
                idaVar.c(spannableStringBuilder, uj3VarI.u(), z, length);
            }
        }
        return spannableStringBuilder;
    }

    public static String c(Context context, Integer num, boolean z, lde ldeVar) {
        if (num == null) {
            return "";
        }
        String strI = z ? zr6.i(" ", context.getString(dpc.a), " ") : "";
        if (num.intValue() > 1) {
            strI = strI + num + " ";
        }
        StringBuilder sbL = au1.l(strI);
        sbL.append((String) ldeVar.get());
        return sbL.toString();
    }

    public static String d(String str, String str2) {
        return rh4.j(str, " ", str2);
    }

    public static String e(String str) {
        if (oag.t(str)) {
            return str;
        }
        if (str.length() == 1) {
            return str.toUpperCase();
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String g(Context context, boolean z, boolean z2) {
        String string = z2 ? context.getString(c2c.tt_audio) : "";
        return z ? d("🎤", string) : eae.g0(string);
    }

    public static String h(Context context, cu8 cu8Var, boolean z, boolean z2, long j) {
        String string;
        l10 l10VarD = cu8Var.d();
        if (l10VarD == null) {
            return "";
        }
        boolean z3 = cu8Var.Y != j;
        boolean z4 = z3 && (l10VarD.c() || l10VarD.a());
        boolean z5 = l10VarD.d == 4 || (!z3 && l10VarD.a());
        boolean z6 = l10VarD.c == 2;
        if (z5 && z6) {
            string = z2 ? context.getString(c2c.tt_call_outgoing_canceled_video_cap) : context.getString(c2c.tt_call_outgoing_canceled_video);
        } else if (z5) {
            string = z2 ? context.getString(c2c.tt_call_outgoing_canceled_audio_cap) : context.getString(c2c.tt_call_outgoing_canceled_audio);
        } else if (z4 && z6) {
            string = z2 ? context.getString(c2c.tt_call_missed_audio_cap) : context.getString(c2c.tt_call_missed_audio);
        } else if (z4) {
            string = z2 ? context.getString(c2c.tt_call_missed_audio_cap) : context.getString(c2c.tt_call_missed_audio);
        } else if (z3 && z6) {
            StringBuilder sbL = au1.l(z2 ? context.getString(c2c.tt_call_incoming_video_cap) : context.getString(c2c.tt_call_incoming_video));
            sbL.append(i(l10VarD));
            string = sbL.toString();
        } else if (z3) {
            StringBuilder sbL2 = au1.l(z2 ? context.getString(c2c.tt_call_incoming_audio_cap) : context.getString(c2c.tt_call_incoming_audio));
            sbL2.append(i(l10VarD));
            string = sbL2.toString();
        } else if (z6) {
            StringBuilder sbL3 = au1.l(z2 ? context.getString(c2c.tt_call_outgoing_video_cap) : context.getString(c2c.tt_call_outgoing_video));
            sbL3.append(i(l10VarD));
            string = sbL3.toString();
        } else {
            StringBuilder sbL4 = au1.l(z2 ? context.getString(c2c.tt_call_outgoing_audio_cap) : context.getString(c2c.tt_call_outgoing_audio));
            sbL4.append(i(l10VarD));
            string = sbL4.toString();
        }
        return z ? d("📞", string) : string;
    }

    public static String i(l10 l10Var) {
        long j = l10Var.e;
        return j == 0 ? "" : " ".concat(tfg.c(j));
    }

    public static String j(Context context, n10 n10Var, ak3 ak3Var, boolean z, boolean z2) {
        String string;
        try {
            string = z04.y(ak3Var.b(n10Var), n10Var);
        } catch (Exception unused) {
            string = null;
        }
        if (oag.t(string)) {
            string = context.getString(c2c.tt_contact);
        } else if (!z2) {
            string = context.getString(c2c.tt_contact_with_name, string);
        }
        return z ? d("👤", string) : eae.g0(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029d  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence k(android.content.Context r18, defpackage.ida r19, defpackage.el3 r20, boolean r21, defpackage.cu8 r22, defpackage.uj3 r23, boolean r24, boolean r25, long r26) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.are.k(android.content.Context, ida, el3, boolean, cu8, uj3, boolean, boolean, long):java.lang.CharSequence");
    }

    public static String l(Context context, uj3 uj3Var, boolean z, boolean z2, boolean z3, q10 q10Var) {
        p10 p10Var = q10Var.a;
        int iOrdinal = p10Var.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            return "";
        }
        p10 p10Var2 = p10.c;
        if (!z && !z3) {
            return p10Var == p10Var2 ? p(context, uj3Var, z2, c2c.tt_control_you_add_user, c2c.tt_control_user_add_m, c2c.tt_control_user_add_f, c2c.tt_control_user_add) : p(context, uj3Var, z2, c2c.tt_control_you_remove_user, c2c.tt_control_user_remove_m, c2c.tt_control_user_remove_f, c2c.tt_control_user_remove);
        }
        if (p10Var == p10Var2 || p10Var == p10.b) {
            return p(context, uj3Var, false, 0, c2c.tt_control_user_add_you_m, c2c.tt_control_user_add_you_f, c2c.tt_control_user_add_you);
        }
        int i = c2c.tt_control_user_remove_you_m;
        return p(context, uj3Var, false, 0, i, c2c.tt_control_user_remove_you_f, i);
    }

    public static int m(long j) {
        if (j <= 0) {
            return 0;
        }
        int iLog10 = (int) (Math.log10(j) / Math.log10(1024.0d));
        if (iLog10 > 4) {
            return 4;
        }
        return iLog10;
    }

    public static String n(String str) {
        if (oag.t(str)) {
            return str;
        }
        String[] strArrSplit = str.trim().split("\\s");
        return strArrSplit.length > 0 ? strArrSplit[0] : str;
    }

    public static String o(Context context, int i, int i2, int i3, int i4) {
        return i == 2 ? context.getString(i2) : i == 3 ? context.getString(i3) : context.getString(i4);
    }

    public static String p(Context context, uj3 uj3Var, boolean z, int i, int i2, int i3, int i4) {
        return z ? context.getString(i) : o(context, uj3Var.a.c.l, i2, i3, i4);
    }

    public static String q(Context context, String str, boolean z, int i, String str2) {
        return z ? String.format(o(context, i, c2c.tt_message_sent_dialog_m, c2c.tt_message_sent_dialog_f, c2c.tt_message_sent_dialog), str) : String.format(o(context, i, c2c.tt_message_sent_chat_m, c2c.tt_message_sent_chat_f, c2c.tt_message_sent_chat), str, str2);
    }

    public static String r(Context context, boolean z, boolean z2) {
        String string = context.getString(z ? c2c.tt_gif : c2c.tt_photo);
        return z2 ? d("📷", string) : eae.g0(string);
    }

    public static String s(int i, int i2, Context context) {
        return String.format(context.getResources().getQuantityString(i, i2), Integer.valueOf(i2));
    }

    public static String t(Context context, boolean z) {
        String string = context.getString(c2c.tt_video);
        return z ? d("🎬", string) : eae.g0(string);
    }

    public static void u(HashMap map, xqe xqeVar) {
        Integer num = (Integer) map.get(xqeVar);
        map.put(xqeVar, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
    }

    public static String v(long j, int i, boolean z, Context context) {
        if (j <= 0) {
            return "0";
        }
        double dPow = j / Math.pow(1024.0d, i);
        return rh4.j(((z && i == 0) || i == 1) ? ((DecimalFormat) c.get()).format(dPow) : ((DecimalFormat) d.get()).format(dPow), " ", context != null ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? context.getString(c2c.tt_file_size_unit_b) : context.getString(c2c.tt_file_size_unit_tb) : context.getString(c2c.tt_file_size_unit_gb) : context.getString(c2c.tt_file_size_unit_mb) : context.getString(c2c.tt_file_size_unit_kb) : context.getString(c2c.tt_file_size_unit_b) : b[i]);
    }

    public static String w(long j, boolean z, Context context) {
        return j <= 0 ? "0" : v(j, m(j), z, context);
    }

    public final String f(Context context, ida idaVar, cu8 cu8Var, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5) {
        xqe xqeVar;
        xqe xqeVar2;
        xqe xqeVar3;
        boolean zN = cu8Var.n();
        k8g k8gVar = cu8Var.z0;
        if (!zN && (k8gVar == null || ((z07) k8gVar.b) == null)) {
            return "";
        }
        if (cu8Var.A() || (cu8Var.E() && !cu8Var.t())) {
            g20 g20Var = g20.c;
            if (z3) {
                boolean zA = cu8Var.A();
                return (zA && cu8Var.E()) ? d("📷", context.getString(c2c.tt_photo_and_video)) : zA ? r(context, k8gVar.k(g20Var).b.X, true) : cu8Var.t() ? eae.g0(context.getString(c2c.oneme_video_message)) : t(context, true);
            }
            HashMap map = new HashMap();
            int i = 0;
            while (true) {
                int i2 = k8gVar.i();
                xqeVar = xqe.c;
                xqeVar2 = xqe.a;
                xqeVar3 = xqe.b;
                if (i >= i2) {
                    break;
                }
                l20 l20VarH = k8gVar.h(i);
                if (l20VarH.a != g20Var) {
                    u(map, xqeVar);
                } else if (l20VarH.b.X) {
                    u(map, xqeVar3);
                } else {
                    u(map, xqeVar2);
                }
                i++;
            }
            if (map.isEmpty()) {
                return "";
            }
            StringBuilder sbL = au1.l("" + c(context, (Integer) map.get(xqe.o), false, new t72(context, z)));
            sbL.append(c(context, (Integer) map.get(xqeVar2), !oag.t(r1), new npb(1, context, z)));
            StringBuilder sbL2 = au1.l(sbL.toString());
            sbL2.append(c(context, (Integer) map.get(xqeVar3), !oag.t(r1), new npb(2, context, z)));
            StringBuilder sbL3 = au1.l(sbL2.toString());
            sbL3.append(c(context, (Integer) map.get(xqeVar), !oag.t(r1), new npb(3, context, z)));
            return sbL3.toString();
        }
        if (cu8Var.u()) {
            return g(context, z, z4);
        }
        if (cu8Var.v()) {
            return h(context, cu8Var, z, true, j);
        }
        strJ = null;
        strJ = null;
        String strJ = null;
        if (cu8Var.D()) {
            f20 f20VarJ = cu8Var.j();
            int i3 = f20VarJ.j;
            String string = idaVar.a.getString(c2c.tt_sticker);
            if (z5) {
                List list = f20VarJ.g;
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        if (idaVar.j.a(0, str)) {
                            strJ = rh4.j(str, " ", string);
                            break;
                        }
                    }
                }
                if (strJ != null) {
                    return eae.g0(strJ);
                }
            }
            return z ? d("🌄", string) : eae.g0(string);
        }
        if (cu8Var.C()) {
            String string2 = context.getString(z2 ? c2c.tt_link_acs : c2c.tt_link);
            return z ? d("🔗", string2) : eae.g0(string2);
        }
        if (cu8Var.n() && k8gVar.k(g20.t0) != null) {
            String string3 = context.getString(c2c.tt_game);
            return z ? d("🎮", string3) : string3;
        }
        if (cu8Var.y()) {
            String str2 = cu8Var.g().c;
            return z ? d("📄", str2) : str2;
        }
        if (cu8Var.w()) {
            return j(context, cu8Var.e(), (ak3) this.a.getValue(), z, false);
        }
        if (cu8Var.B()) {
            String string4 = context.getString((cu8Var.B() ? k8gVar.k(g20.w0).l : null).e == 4 ? c2c.tt_present_accepted : c2c.tt_present);
            return z ? d("🎁", string4) : string4;
        }
        if (!cu8Var.z()) {
            return (k8gVar == null || ((z07) k8gVar.b) == null) ? cu8Var.t() ? eae.g0(context.getString(c2c.oneme_video_message)) : "" : context.getString(c2c.tt_keyboard);
        }
        String string5 = context.getString(c2c.tt_location);
        return z ? d("📍", string5) : eae.g0(string5);
    }
}
