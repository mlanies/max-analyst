package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b46 implements bi, nr2, b66, s43, mbe, gy7, kxd {
    public static final b46 a = new b46();
    public static final b46 b = new b46();
    public static final b46 c = new b46();
    public static final is0 o = new is0(new bs0(new as0(-1559261502, -1559261502, 1712295618), new cs0(new ds0(521113282, 1019586), new es0(1024429762, 1019586), new fs0(1024231611, 821435)), new gs0(-15757630, 336563906, -1, -2062577982), new hs0(1292865218, 168791746, 1019586, new int[]{1292865218, -2146464062}), -15757630, 1024429762, 336563906, -1, 336563906, -4112, 336563906, -1, 336563906, 2047839938, new int[]{-1, -1, -1}, new int[]{-1, -1}), new js0(-1, -15757630, -16711919, -53188, -15757630, -1307603262, -16711919, -16711919, -8682855, -8682855, -15757630, -1559491314, -1895035634, 1879837966, -1895035634), new ks0(-1, 336563906, -15757630, -1), new ls0(new ms0(-1, -15757630, -15757630, -1), -15757630, -15757630, -15757630, -15987442, -2062807794, -2062807794, -1207169778, -15757630, 16777215, -2062807794, -1207169778, -2062807794));
    public static final is0 X = new is0(new bs0(new as0(-1728006644, -1728006644, 1711322636), new cs0(new ds0(521113282, 1019586), new es0(1024429762, 1019586), new fs0(1024231611, 821435)), new gs0(-15757630, 521113282, -1, -2062577982), new hs0(1292865218, 168791746, 1019586, new int[]{1292865218, -2146464062}), -15757630, 1544523458, 336563906, -1442305, 336563906, 336563906, 521113282, -656897, 336563906, 2051569387, new int[]{-1442305, -1442305, -1442305}, new int[]{-1442305, -1442305}), new js0(-1442305, -15757630, -1685946, -16711919, -15757630, -15757630, -15757630, -1, -2063258820, -2063258820, -16711919, -1559942340, -1895486660, 1879386940, -1895486660), new ks0(-1442305, 336563906, -15757630, -1), new ls0(new ms0(-1, -15757630, -15757630, -1), -15757630, -15757630, -16711919, -16438468, -2063258820, -2063258820, -1207620804, -15757630, 16777215, -2063258820, -1207620804, -15757630));
    public static final v83 Y = new v83(new j73(new i73(-53188, -15921907, -15757630, -2693121), new k73(-15987442, -4933959, -15757630)), new m73(new l73(0, 0, 0, 0, 0, 0, -6695465, -8340225, 1291877119, 0, 0, 0, 0, 0, 0), new n73(-371456, 1039815936, 704271616, -371456, -1543503873, 1024489791, 688945471, -15697601, -2409396, 1037777996, 702233676, -2409396, -16544549, 1023642843, 688098523, -16544549, 1033643952, 698099632, -6543440, -10587743, 1029599649, 694055329, -10587743, 1025203902, 689659582, -14983490, -15757630, 1024429762, 688885442, -15757630, -9158436, 1031028956, 695484636, -9158436), new q73(new o73(1308622847, new int[]{16777215, 1090519039, -2130706433}), new p73(-986638, new int[]{16777215, 1090519039, -2130706433}), new s73(new r73(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new u73(new t73(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444})), new v73(new int[]{-1543503873, -520093697, -520093697}, -16769551, -16729857, 47359, -7798611, 8978605, -1, -2130706433), -15757630, 1543503872, -2062577982, -1192234767, -1249810, -1184014, -15921907, 856230153, 336136457, -15921907, 1376521486, -871625458, -1727263474, 1291877119, -15757630, -1184014, -8734748, new int[]{-2062577982, -2062577982}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-6695465, -8340225}), new w83(-15757630, -15757630, -53188, -2062807794, -15757630, -855638017), new b93(new c93(251658240, 167772160), new d93(251658240), new e93(251658240)), new j93(new h93(new g93(new f93(-16089170), 520093696), new i93(-1727033662, 168627469, 2047675661)), new k93(new l93(-1545253546, -1727033662)), new m93(new n93(-1543503873, -1191182337, -1545253546, -1552977290, -1727033662))), new o93(new p93(688655630), -1, 1308622847), new q93(-1, -15987442, -1, -53188, -15987698, -2062808050, 1712065550, -15757630));
    public static final hxe Z = new hxe(new exe(new fxe(-15921907, 336136457, -15757630, -1), new gxe(2047675661, 168364297, -1727033662)), new ixe(new jxe(-1, 336136457, -15921907, -4407874, -11447211, -7762804, -15757630), new kxe(-1191182337, -1191182337, -1545253546, 168364297, -1552977290, -1552977290, -1552977290, -1552977290, -1727033662)), new lxe(new mxe(new nxe(688655630, 252448014))), new oxe(new pxe(-1, -15921907, -2062742259, -15757630), new qxe(-1543503873, -1191182337, -1552977290, -1552977290, -1728021761)));
    public static final i9g s0 = new i9g(new h9g(-592138, -1, 336136457, -1), new j9g(-15987442, -7762804, -7762804, -15757630, 1879837966), new k9g(252448014, 252448014, -15757630), new l9g(-15987442, -15757630, 1712065806, -15987442, -1207169778, -2062807794, -2062807794, -15757630));
    public static final b46 t0 = new b46();
    public static final b46 u0 = new b46();
    public static final wlf v0 = new wlf(new float[8]);

    public static ArrayList f(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((sob) obj) != sob.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((sob) it.next()).a);
        }
        return arrayList2;
    }

    public static byte[] i(List list) {
        bt0 bt0Var = new bt0();
        Iterator it = f(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            bt0Var.u0(str.length());
            bt0Var.z0(0, str.length(), str);
        }
        return bt0Var.n0(bt0Var.b);
    }

    public static ohc n(byte[] bArr, rl8 rl8Var, int i) {
        if ((i & 1) != 0) {
            rl8Var = null;
        }
        int length = bArr.length;
        long length2 = bArr.length;
        long j = 0;
        long j2 = length;
        byte[] bArr2 = naf.a;
        if ((j | j2) < 0 || j > length2 || length2 - j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new ohc(bArr, rl8Var, length, 0);
    }

    public static rh5 o(String str, String str2) {
        return new rh5(str, 1, str2.getBytes(a52.a));
    }

    public static boolean p() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static z61 q(JSONObject jSONObject) {
        String strOptString;
        bg1 bg1VarB;
        String strOptString2 = jSONObject.optString("key");
        int i = 0;
        jSONObject.optInt("totalCount", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray == null) {
            return new z61(strOptString2, nz4.a);
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        if (length >= 0) {
            while (true) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("participantId")) != null && (bg1VarB = bg1.b(strOptString)) != null) {
                    arrayList.add(bg1VarB);
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return new z61(strOptString2, arrayList);
    }

    public static goe r(int i) {
        Object next;
        goe.b.getClass();
        Iterator it = goe.Z.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                next = null;
                break;
            }
            next = u1Var.next();
            if (((goe) next).a == i) {
                break;
            }
        }
        goe goeVar = (goe) next;
        if (goeVar != null) {
            return goeVar;
        }
        throw new IllegalArgumentException(wg0.g(i, "No such value ", " for TaskStatus"));
    }

    public static iua t(int i) {
        Object next;
        iua.b.getClass();
        Iterator it = iua.e1.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                next = null;
                break;
            }
            next = u1Var.next();
            if (((iua) next).a == i) {
                break;
            }
        }
        iua iuaVar = (iua) next;
        if (iuaVar != null) {
            return iuaVar;
        }
        throw new IllegalArgumentException(wg0.g(i, "No such value ", " for PersistableTaskType"));
    }

    @Override // defpackage.mbe
    public boolean a(qy5 qy5Var) {
        String str = qy5Var.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        ref refVarA;
        np4 np4Var = (np4) obj;
        fp4 fp4Var = np4Var.a;
        ep4 ep4Var = new ep4(fp4Var.a, fp4Var.b);
        i20 i20Var = np4Var.e;
        if (i20Var == null) {
            refVarA = null;
        } else {
            i20 i20Var2 = new i20(1);
            i20Var2.a = i20Var.a;
            i20Var2.c = i20Var.c;
            i20Var2.b = i20Var.b;
            i20Var2.d = i20Var.d;
            refVarA = i20Var2.a();
        }
        ref refVar = refVarA;
        return new lp4(ep4Var, np4Var.b, np4Var.c, np4Var.d, refVar);
    }

    @Override // defpackage.gy7
    public Object b(ova ovaVar) {
        return Integer.valueOf(ovaVar.U0);
    }

    @Override // defpackage.nr2
    public int c(int i) {
        int i2 = lsb.chat_common_action_background_error;
        v83 v83Var = Y;
        j73 j73Var = v83Var.a;
        if (i == i2) {
            return j73Var.a.a;
        }
        if (i == lsb.chat_common_action_background_neutral) {
            return j73Var.a.b;
        }
        if (i == lsb.chat_common_action_background_themed) {
            return j73Var.a.c;
        }
        if (i == lsb.chat_common_action_background_themedFade) {
            return j73Var.a.d;
        }
        if (i == lsb.chat_common_action_icon_contrastStatic) {
            j73Var.b.getClass();
        } else {
            if (i == lsb.chat_common_action_icon_neutral) {
                return j73Var.b.a;
            }
            if (i == lsb.chat_common_action_icon_neutralSecondary) {
                return j73Var.b.b;
            }
            if (i == lsb.chat_common_action_icon_themedFade) {
                return j73Var.b.c;
            }
            int i3 = lsb.chat_common_background_accent;
            m73 m73Var = v83Var.b;
            if (i == i3) {
                return m73Var.e;
            }
            if (i == lsb.chat_common_background_capsule) {
                return m73Var.f;
            }
            if (i == lsb.chat_common_background_capsuleOutside) {
                return m73Var.g;
            }
            if (i == lsb.chat_common_background_capsuleSecondary) {
                return m73Var.h;
            }
            if (i == lsb.chat_common_background_chatFAB) {
                return m73Var.i;
            }
            if (i == lsb.chat_common_background_contrastFloatingSecondary) {
                return m73Var.j;
            }
            if (i == lsb.chat_common_background_contrastStatic) {
                m73Var.getClass();
            } else {
                if (i == lsb.chat_common_background_neutral) {
                    return m73Var.k;
                }
                if (i == lsb.chat_common_background_neutralFade) {
                    m73Var.getClass();
                    return 1543503872;
                }
                if (i == lsb.chat_common_background_neutralFadeSecondary) {
                    return m73Var.l;
                }
                if (i == lsb.chat_common_background_neutralFadeTertiary) {
                    return m73Var.m;
                }
                if (i == lsb.chat_common_background_neutralThemed) {
                    return m73Var.n;
                }
                if (i == lsb.chat_common_background_overlay) {
                    return m73Var.o;
                }
                if (i == lsb.chat_common_background_overlayHard) {
                    return m73Var.p;
                }
                if (i == lsb.chat_common_background_overlaySecondary) {
                    return m73Var.q;
                }
                if (i == lsb.chat_common_background_pattern) {
                    return m73Var.r;
                }
                if (i == lsb.chat_common_background_searchHighlight) {
                    return m73Var.s;
                }
                if (i == lsb.chat_common_background_stickerBlank) {
                    return m73Var.t;
                }
                if (i == lsb.chat_common_background_surfaceGround) {
                    return m73Var.u;
                }
                if (i == lsb.chat_common_background_timelineActive) {
                    m73Var.getClass();
                    return -1191182337;
                }
                if (i == lsb.chat_common_background_timelinePassive) {
                    m73Var.getClass();
                    return 1392508927;
                }
                if (i == lsb.chat_common_background_chatBackground_additionalStep1) {
                    return m73Var.a.a;
                }
                if (i == lsb.chat_common_background_chatBackground_additionalStep2) {
                    return m73Var.a.b;
                }
                if (i == lsb.chat_common_background_chatBackground_additionalStep3) {
                    return m73Var.a.c;
                }
                if (i == lsb.chat_common_background_chatBackground_additionalStep4) {
                    return m73Var.a.d;
                }
                if (i == lsb.chat_common_background_chatBackground_additionalStep5) {
                    return m73Var.a.e;
                }
                if (i == lsb.chat_common_background_chatBackground_additionalStep6) {
                    return m73Var.a.f;
                }
                if (i == lsb.chat_common_background_chatBackground_backgroundStep1) {
                    return m73Var.a.g;
                }
                if (i == lsb.chat_common_background_chatBackground_backgroundStep2) {
                    return m73Var.a.h;
                }
                if (i == lsb.chat_common_background_chatBackground_patternColor) {
                    return m73Var.a.i;
                }
                if (i == lsb.chat_common_background_chatBackground_patternStep1) {
                    return m73Var.a.j;
                }
                if (i == lsb.chat_common_background_chatBackground_patternStep2) {
                    return m73Var.a.k;
                }
                if (i == lsb.chat_common_background_chatBackground_patternStep3) {
                    return m73Var.a.l;
                }
                if (i == lsb.chat_common_background_chatBackground_patternStep4) {
                    return m73Var.a.m;
                }
                if (i == lsb.chat_common_background_chatBackground_patternStep5) {
                    return m73Var.a.n;
                }
                if (i == lsb.chat_common_background_chatBackground_patternStep6) {
                    return m73Var.a.o;
                }
                if (i == lsb.chat_common_background_fileType_archiveBadge) {
                    return m73Var.b.a;
                }
                if (i == lsb.chat_common_background_fileType_archiveBkg) {
                    return m73Var.b.b;
                }
                if (i == lsb.chat_common_background_fileType_archiveElement) {
                    return m73Var.b.c;
                }
                if (i == lsb.chat_common_background_fileType_archiveIcon) {
                    return m73Var.b.d;
                }
                if (i == lsb.chat_common_background_fileType_background) {
                    return m73Var.b.e;
                }
                if (i == lsb.chat_common_background_fileType_dataBadge) {
                    m73Var.b.getClass();
                    return -15697601;
                }
                if (i == lsb.chat_common_background_fileType_dataBkg) {
                    return m73Var.b.f;
                }
                if (i == lsb.chat_common_background_fileType_dataElement) {
                    return m73Var.b.g;
                }
                if (i == lsb.chat_common_background_fileType_dataIcon) {
                    return m73Var.b.h;
                }
                if (i == lsb.chat_common_background_fileType_imageBadge) {
                    return m73Var.b.i;
                }
                if (i == lsb.chat_common_background_fileType_imageBkg) {
                    return m73Var.b.j;
                }
                if (i == lsb.chat_common_background_fileType_imageElement) {
                    return m73Var.b.k;
                }
                if (i == lsb.chat_common_background_fileType_imageIcon) {
                    return m73Var.b.l;
                }
                if (i == lsb.chat_common_background_fileType_musicBadge) {
                    return m73Var.b.m;
                }
                if (i == lsb.chat_common_background_fileType_musicBkg) {
                    return m73Var.b.n;
                }
                if (i == lsb.chat_common_background_fileType_musicElement) {
                    return m73Var.b.o;
                }
                if (i == lsb.chat_common_background_fileType_musicIcon) {
                    return m73Var.b.p;
                }
                if (i == lsb.chat_common_background_fileType_presentationBadge) {
                    m73Var.b.getClass();
                    return -6543440;
                }
                if (i == lsb.chat_common_background_fileType_presentationBkg) {
                    return m73Var.b.q;
                }
                if (i == lsb.chat_common_background_fileType_presentationElement) {
                    return m73Var.b.r;
                }
                if (i == lsb.chat_common_background_fileType_presentationIcon) {
                    return m73Var.b.s;
                }
                if (i == lsb.chat_common_background_fileType_programBadge) {
                    return m73Var.b.t;
                }
                if (i == lsb.chat_common_background_fileType_programBkg) {
                    return m73Var.b.u;
                }
                if (i == lsb.chat_common_background_fileType_programElement) {
                    return m73Var.b.v;
                }
                if (i == lsb.chat_common_background_fileType_programIcon) {
                    return m73Var.b.w;
                }
                if (i == lsb.chat_common_background_fileType_textBadge) {
                    m73Var.b.getClass();
                    return -14983490;
                }
                if (i == lsb.chat_common_background_fileType_textBkg) {
                    return m73Var.b.x;
                }
                if (i == lsb.chat_common_background_fileType_textElement) {
                    return m73Var.b.y;
                }
                if (i == lsb.chat_common_background_fileType_textIcon) {
                    return m73Var.b.z;
                }
                if (i == lsb.chat_common_background_fileType_unknownBadge) {
                    return m73Var.b.A;
                }
                if (i == lsb.chat_common_background_fileType_unknownBkg) {
                    return m73Var.b.B;
                }
                if (i == lsb.chat_common_background_fileType_unknownElement) {
                    return m73Var.b.C;
                }
                if (i == lsb.chat_common_background_fileType_unknownIcon) {
                    return m73Var.b.D;
                }
                if (i == lsb.chat_common_background_fileType_videoBadge) {
                    return m73Var.b.E;
                }
                if (i == lsb.chat_common_background_fileType_videoBkg) {
                    return m73Var.b.F;
                }
                if (i == lsb.chat_common_background_fileType_videoElement) {
                    return m73Var.b.G;
                }
                if (i == lsb.chat_common_background_fileType_videoIcon) {
                    return m73Var.b.H;
                }
                if (i == lsb.chat_common_background_skeleton_bubbleGradientPrimary_staticBackground) {
                    return m73Var.c.a.b;
                }
                if (i == lsb.chat_common_background_skeleton_bubbleGradientSecondary_staticBackground) {
                    return m73Var.c.b.b;
                }
                if (i == lsb.chat_common_background_skeleton_stickerPrimary_baseGradient_staticBackground) {
                    return m73Var.c.c.a.b;
                }
                if (i == lsb.chat_common_background_skeleton_stickerSecondary_baseGradient_staticBackground) {
                    return m73Var.c.d.a.b;
                }
                if (i == lsb.chat_common_background_systemBubbleGradient_qRBackground) {
                    return m73Var.d.b;
                }
                if (i == lsb.chat_common_background_systemBubbleGradient_qRStep1) {
                    return m73Var.d.c;
                }
                if (i == lsb.chat_common_background_systemBubbleGradient_qRStep2) {
                    return m73Var.d.d;
                }
                if (i == lsb.chat_common_background_systemBubbleGradient_qRStep3) {
                    return m73Var.d.e;
                }
                if (i == lsb.chat_common_background_systemBubbleGradient_qRStep4) {
                    return m73Var.d.f;
                }
                if (i == lsb.chat_common_background_systemBubbleGradient_strokeFadeStep1) {
                    m73Var.d.getClass();
                    return 872415231;
                }
                if (i == lsb.chat_common_background_systemBubbleGradient_strokeFadeStep2) {
                    m73Var.d.getClass();
                    return 452984831;
                }
                if (i == lsb.chat_common_background_systemBubbleGradient_strokeStep1) {
                    return m73Var.d.g;
                }
                if (i == lsb.chat_common_background_systemBubbleGradient_strokeStep2) {
                    return m73Var.d.h;
                }
                int i4 = lsb.chat_common_icon_accent;
                w83 w83Var = v83Var.c;
                if (i == i4) {
                    return w83Var.a;
                }
                if (i == lsb.chat_common_icon_accentContrast) {
                    return w83Var.b;
                }
                if (i == lsb.chat_common_icon_capsule || i == lsb.chat_common_icon_contrastStatic) {
                    w83Var.getClass();
                } else {
                    if (i == lsb.chat_common_icon_negative) {
                        return w83Var.c;
                    }
                    if (i == lsb.chat_common_icon_secondary) {
                        return w83Var.d;
                    }
                    if (i == lsb.chat_common_icon_themed) {
                        return w83Var.e;
                    }
                    if (i == lsb.chat_common_icon_verificationCapsule) {
                        return w83Var.f;
                    }
                    int i5 = lsb.chat_common_shadows_elevation2_primary;
                    b93 b93Var = v83Var.d;
                    if (i == i5) {
                        return b93Var.a.a;
                    }
                    if (i == lsb.chat_common_shadows_elevation2_secondary) {
                        return b93Var.a.b;
                    }
                    if (i == lsb.chat_common_shadows_topBar_color) {
                        return b93Var.b.a;
                    }
                    if (i == lsb.chat_common_shadows_writeBar_color) {
                        return b93Var.c.a;
                    }
                    int i6 = lsb.chat_common_states_background_active_neutralFadeTertiary;
                    j93 j93Var = v83Var.e;
                    if (i == i6) {
                        return j93Var.a.a.b;
                    }
                    if (i == lsb.chat_common_states_background_active_action_themed) {
                        return j93Var.a.a.a.a;
                    }
                    if (i == lsb.chat_common_states_background_disabled_accent) {
                        return j93Var.a.b.a;
                    }
                    if (i == lsb.chat_common_states_background_disabled_neutralFadeSecondary) {
                        return j93Var.a.b.b;
                    }
                    if (i == lsb.chat_common_states_background_disabled_neutralThemed) {
                        return j93Var.a.b.c;
                    }
                    if (i == lsb.chat_common_states_icon_disabled_negative) {
                        return j93Var.b.a.a;
                    }
                    if (i == lsb.chat_common_states_icon_disabled_themed) {
                        return j93Var.b.a.b;
                    }
                    if (i == lsb.chat_common_states_text_disabled_contrast) {
                        return j93Var.c.a.a;
                    }
                    if (i == lsb.chat_common_states_text_disabled_contrastStatic) {
                        return j93Var.c.a.b;
                    }
                    if (i == lsb.chat_common_states_text_disabled_negative) {
                        return j93Var.c.a.c;
                    }
                    if (i == lsb.chat_common_states_text_disabled_primary) {
                        return j93Var.c.a.d;
                    }
                    if (i == lsb.chat_common_states_text_disabled_themed) {
                        return j93Var.c.a.e;
                    }
                    int i7 = lsb.chat_common_stroke_contrast;
                    o93 o93Var = v83Var.f;
                    if (i == i7) {
                        return o93Var.b;
                    }
                    if (i == lsb.chat_common_stroke_contrastStatic) {
                        o93Var.getClass();
                    } else {
                        if (i == lsb.chat_common_stroke_glass) {
                            return o93Var.c;
                        }
                        if (i == lsb.chat_common_stroke_separator_primary) {
                            return o93Var.a.a;
                        }
                        int i8 = lsb.chat_common_text_capsule;
                        q93 q93Var = v83Var.g;
                        if (i == i8) {
                            return q93Var.a;
                        }
                        if (i == lsb.chat_common_text_capsuleSecondary) {
                            return q93Var.b;
                        }
                        if (i == lsb.chat_common_text_contrast) {
                            return q93Var.c;
                        }
                        if (i == lsb.chat_common_text_contrastStatic) {
                            q93Var.getClass();
                        } else {
                            if (i == lsb.chat_common_text_fileType) {
                                q93Var.getClass();
                                return -520093697;
                            }
                            if (i == lsb.chat_common_text_negative) {
                                return q93Var.d;
                            }
                            if (i == lsb.chat_common_text_primary) {
                                return q93Var.e;
                            }
                            if (i == lsb.chat_common_text_secondary) {
                                return q93Var.f;
                            }
                            if (i == lsb.chat_common_text_tertiary) {
                                return q93Var.g;
                            }
                            if (i == lsb.chat_common_text_themed) {
                                return q93Var.h;
                            }
                            int i9 = lsb.chat_topbar_background_default_neutral;
                            hxe hxeVar = Z;
                            exe exeVar = hxeVar.a;
                            if (i == i9) {
                                return exeVar.a.a;
                            }
                            if (i == lsb.chat_topbar_background_default_neutralFade) {
                                return exeVar.a.b;
                            }
                            if (i == lsb.chat_topbar_background_default_primary) {
                                exeVar.a.getClass();
                                return -855638017;
                            }
                            if (i == lsb.chat_topbar_background_default_themed) {
                                return exeVar.a.c;
                            }
                            if (i == lsb.chat_topbar_background_default_topbar) {
                                return exeVar.a.d;
                            }
                            if (i == lsb.chat_topbar_background_disabled_neutral) {
                                return exeVar.b.a;
                            }
                            if (i == lsb.chat_topbar_background_disabled_neutralFade) {
                                return exeVar.b.b;
                            }
                            if (i == lsb.chat_topbar_background_disabled_themed) {
                                return exeVar.b.c;
                            }
                            int i10 = lsb.chat_topbar_icon_default_contrast;
                            ixe ixeVar = hxeVar.b;
                            if (i == i10) {
                                return ixeVar.a.a;
                            }
                            if (i == lsb.chat_topbar_icon_default_contrastStatic) {
                                ixeVar.a.getClass();
                            } else {
                                if (i == lsb.chat_topbar_icon_default_neutralFade) {
                                    return ixeVar.a.b;
                                }
                                if (i == lsb.chat_topbar_icon_default_primary) {
                                    return ixeVar.a.c;
                                }
                                if (i == lsb.chat_topbar_icon_default_quaternary) {
                                    return ixeVar.a.d;
                                }
                                if (i == lsb.chat_topbar_icon_default_secondary) {
                                    return ixeVar.a.e;
                                }
                                if (i == lsb.chat_topbar_icon_default_tertiary) {
                                    return ixeVar.a.f;
                                }
                                if (i == lsb.chat_topbar_icon_default_themed) {
                                    return ixeVar.a.g;
                                }
                                if (i == lsb.chat_topbar_icon_disabled_contrast) {
                                    return ixeVar.b.a;
                                }
                                if (i == lsb.chat_topbar_icon_disabled_contrastStatic) {
                                    return ixeVar.b.b;
                                }
                                if (i == lsb.chat_topbar_icon_disabled_negative) {
                                    return ixeVar.b.c;
                                }
                                if (i == lsb.chat_topbar_icon_disabled_neutralFade) {
                                    return ixeVar.b.d;
                                }
                                if (i == lsb.chat_topbar_icon_disabled_primary) {
                                    return ixeVar.b.e;
                                }
                                if (i == lsb.chat_topbar_icon_disabled_quaternary) {
                                    return ixeVar.b.f;
                                }
                                if (i == lsb.chat_topbar_icon_disabled_secondary) {
                                    return ixeVar.b.g;
                                }
                                if (i == lsb.chat_topbar_icon_disabled_tertiary) {
                                    return ixeVar.b.h;
                                }
                                if (i == lsb.chat_topbar_icon_disabled_themed) {
                                    return ixeVar.b.i;
                                }
                                int i11 = lsb.chat_topbar_stroke_separator_default_primary;
                                lxe lxeVar = hxeVar.c;
                                if (i == i11) {
                                    return lxeVar.a.a.a;
                                }
                                if (i == lsb.chat_topbar_stroke_separator_default_secondary) {
                                    return lxeVar.a.a.b;
                                }
                                int i12 = lsb.chat_topbar_text_default_contrast;
                                oxe oxeVar = hxeVar.d;
                                if (i == i12) {
                                    return oxeVar.a.a;
                                }
                                if (i != lsb.chat_topbar_text_default_contrastStatic) {
                                    if (i == lsb.chat_topbar_text_default_primary) {
                                        return oxeVar.a.b;
                                    }
                                    if (i == lsb.chat_topbar_text_default_secondary) {
                                        return oxeVar.a.c;
                                    }
                                    if (i == lsb.chat_topbar_text_default_themed) {
                                        return oxeVar.a.d;
                                    }
                                    if (i == lsb.chat_topbar_text_disabled_contrast) {
                                        return oxeVar.b.a;
                                    }
                                    if (i == lsb.chat_topbar_text_disabled_contrastStatic) {
                                        return oxeVar.b.b;
                                    }
                                    if (i == lsb.chat_topbar_text_disabled_primary) {
                                        return oxeVar.b.c;
                                    }
                                    if (i == lsb.chat_topbar_text_disabled_secondary) {
                                        return oxeVar.b.d;
                                    }
                                    if (i == lsb.chat_topbar_text_disabled_themed) {
                                        return oxeVar.b.e;
                                    }
                                    int i13 = lsb.chat_writebar_background_emojiArea;
                                    i9g i9gVar = s0;
                                    h9g h9gVar = i9gVar.a;
                                    if (i == i13) {
                                        return h9gVar.a;
                                    }
                                    if (i == lsb.chat_writebar_background_input) {
                                        return h9gVar.b;
                                    }
                                    if (i == lsb.chat_writebar_background_neutralFade) {
                                        return h9gVar.c;
                                    }
                                    if (i == lsb.chat_writebar_background_surface) {
                                        return h9gVar.d;
                                    }
                                    int i14 = lsb.chat_writebar_icon_neutral;
                                    j9g j9gVar = i9gVar.b;
                                    if (i == i14) {
                                        return j9gVar.a;
                                    }
                                    if (i == lsb.chat_writebar_icon_neutralSecondary) {
                                        return j9gVar.b;
                                    }
                                    if (i == lsb.chat_writebar_icon_neutralTertiary) {
                                        return j9gVar.c;
                                    }
                                    if (i == lsb.chat_writebar_icon_themed) {
                                        return j9gVar.d;
                                    }
                                    if (i == lsb.chat_writebar_icon_verificationReplyTo) {
                                        return j9gVar.e;
                                    }
                                    int i15 = lsb.chat_writebar_stroke_areaSeparator;
                                    k9g k9gVar = i9gVar.c;
                                    if (i == i15) {
                                        return k9gVar.a;
                                    }
                                    if (i == lsb.chat_writebar_stroke_input) {
                                        return k9gVar.b;
                                    }
                                    if (i == lsb.chat_writebar_stroke_themed) {
                                        return k9gVar.c;
                                    }
                                    int i16 = lsb.chat_writebar_text_input;
                                    l9g l9gVar = i9gVar.d;
                                    if (i == i16) {
                                        return l9gVar.a;
                                    }
                                    if (i == lsb.chat_writebar_text_inputMDLink) {
                                        return l9gVar.b;
                                    }
                                    if (i == lsb.chat_writebar_text_inputPlaceholder) {
                                        return l9gVar.c;
                                    }
                                    if (i == lsb.chat_writebar_text_primary) {
                                        return l9gVar.d;
                                    }
                                    if (i == lsb.chat_writebar_text_replyMessage) {
                                        return l9gVar.e;
                                    }
                                    if (i == lsb.chat_writebar_text_replyTo) {
                                        return l9gVar.f;
                                    }
                                    if (i == lsb.chat_writebar_text_secondary) {
                                        return l9gVar.g;
                                    }
                                    if (i == lsb.chat_writebar_text_themed) {
                                        return l9gVar.h;
                                    }
                                    throw new IllegalArgumentException(zr6.h(i, "Unknown attr res passed "));
                                }
                                oxeVar.a.getClass();
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    @Override // defpackage.mbe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.obe e(defpackage.qy5 r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b46.e(qy5):obe");
    }

    @Override // defpackage.nr2
    public is0 g() {
        return o;
    }

    @Override // defpackage.nr2
    public i9g h() {
        return s0;
    }

    @Override // defpackage.kxd
    public long j(long j) {
        return -1L;
    }

    @Override // defpackage.nr2
    public is0 k() {
        return X;
    }

    @Override // defpackage.mbe
    public int l(qy5 qy5Var) {
        String str = qy5Var.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(wg0.i("Unsupported MIME type: ", str));
    }

    @Override // defpackage.nr2
    public hxe m() {
        return Z;
    }

    @Override // defpackage.nr2
    public v83 s() {
        return Y;
    }

    @Override // defpackage.s43
    public gle w(gy8 gy8Var) {
        int iN;
        String strP;
        if (!gy8Var.m()) {
            return null;
        }
        try {
            iN = lz7.N(gy8Var);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int iS = au1.s(k7d.a);
            if (iS != 0) {
                if (iS != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
            iN = 0;
        }
        Long lValueOf = null;
        for (int i = 0; i < iN; i++) {
            try {
                strP = lz7.P(gy8Var);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int iS2 = au1.s(k7d.a);
                if (iS2 != 0) {
                    if (iS2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strP = null;
            }
            if (strP != null) {
                if (strP.equals("timestamp")) {
                    long jM = 0;
                    try {
                        jM = lz7.M(gy8Var, 0L);
                    } catch (Throwable th3) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int iS3 = au1.s(k7d.a);
                        if (iS3 != 0) {
                            if (iS3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                    }
                    lValueOf = Long.valueOf(jM);
                } else {
                    try {
                        gy8Var.z();
                    } catch (Throwable th4) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th4);
                        }
                        int iS4 = au1.s(k7d.a);
                        if (iS4 != 0) {
                            if (iS4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new egc(lValueOf);
    }
}
