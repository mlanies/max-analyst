package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.http.HttpHost;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class buc implements nr2, b66, ol6, qj3, q7f, iud, n43, lm9, go7, ele, edc {
    public static final buc a = new buc();
    public static final is0 b = new is0(new bs0(new as0(-1308591361, -1728021761, 1711307519), new cs0(new ds0(694773221, 6907365), new es0(1030317541, 6907365), new fs0(1382641064, 6909352)), new gs0(-16745729, 704643071, -16745729, 704643071), new hs0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -3158065, -2133864497, 536870911, -14671838, 704643071, 704643071, 536870911, 704643071, 536870911, 1728053247, new int[]{-14671838, -14671838, -14671838}, new int[]{-14671838, -14671838}), new js0(-14671838, -1191182337, -16711919, -36771, -1543503873, -1543503873, -16711919, -16711919, -2130706433, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new ks0(-14078413, 352321535, 1728053247, -1), new ls0(new ms0(-1, -520093697, -1, -520093697), -12542721, -520093697, -1, -520093697, -2046820353, -2130706433, -1107296257, -1, -1, -2130706433, -1107296257, -2130706433));
    public static final is0 c = new is0(new bs0(new as0(-1728021761, -1728021761, 1711307519), new cs0(new ds0(704643071, 16777215), new es0(1030317541, 6907365), new fs0(1382641064, 6909352)), new gs0(-1, 704643071, -16745729, 704643071), new hs0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -520093697, -2130706433, 704643071, -14526260, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-12310068, -14528027, -16742196}, new int[]{-12310068, -16742196}), new js0(-15375889, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new ks0(-15375889, 452984831, -2046820353, -1), new ls0(new ms0(-16745729, -520093697, -1, -520093697), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
    public static final v83 o = new v83(new j73(new i73(-48049, -1579033, -16745729, -5058310), new k73(-1, 1895825407, -16745729)), new m73(new l73(0, 0, 0, 0, 0, 0, -15856111, -15856111, 0, 0, 0, 0, 0, 0, 0), new n73(-2405632, 721429580, 1305464783, -1, 1946157055, 721429580, 1305464783, -1, -4703924, 721429580, 1305464783, -1, -15166245, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -13290047, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -14528027, 721429580, 1305464783, -1, -10669092, 721429580, 1305464783, -1), new q73(new o73(452984831, new int[]{16777215, 285212671, 553648127}), new p73(452984831, new int[]{16777215, 285212671, 553648127}), new s73(new r73(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}), new u73(new t73(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433})), new v73(new int[]{-1558175710, -534765534, -534765534}, -1, 16777215, 16777215, 16777215, 16777215, 872415231, 452984831), -16745729, 1933394762, 352321535, -868400310, -12762294, -15263716, -1, 536870911, 402653183, -16745729, -1559425779, -871625458, -1727263474, 0, -16745729, -12500154, -15856111, new int[]{352321535, 352321535}, new int[]{352321535, 352321535}, new int[]{-650625467, -1304936891, -1942471099}, new int[]{-15856111, -15856111}), new w83(-16745729, -520093697, -3259817, -2130706433, -16745729, -855638017), new b93(new c93(855638016, 637534208), new d93(687865856), new e93(687865856)), new j93(new h93(new g93(new f93(-16751924), 536870911), new i93(-1728021761, 184549375, 1728053247)), new k93(new l93(1207959551, -1728021761)), new m93(new n93(1207959551, 2063597567, 1207959551, -1548240711, -1728021761))), new o93(new p93(536870911), -855638017, 1882734149), new q93(-855638017, -855638017, -15987442, -3259817, -520093697, 1895825407, 1207959551, -16745729));
    public static final hxe X = new hxe(new exe(new fxe(-1, 352321535, -16745729, -14803164), new gxe(1728053247, 184549375, -1728021761)), new ixe(new jxe(-15921907, 352321535, -855638017, -11579312, 1895825407, -8815492, -16745729), new kxe(-1559425779, 2063597567, 1207959551, 184549375, -1548240711, -1548240711, -1548240711, -1548240711, -1728021761)), new lxe(new mxe(new nxe(536870911, 268435455))), new oxe(new pxe(-15921907, -855638017, 1895825407, -16745729), new qxe(-1559425779, 2063597567, -1548240711, -1548240711, -1728021761)));
    public static final i9g Y = new i9g(new h9g(-15198184, -14803164, 401074151, -14803164), new j9g(-855638017, 1895825407, -8815492, -16745729, 1895825407), new k9g(266856423, 15198183, -16745729), new l9g(-1579033, -16745729, 1474815975, -1, -1108875289, -2130706433, -2130706433, -16745729));
    public static final buc Z = new buc();
    public static final buc s0 = new buc();
    public static final buc t0 = new buc();
    public static final buc u0 = new buc();

    public static ArrayList A(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iZ0 = w9e.z0(str, '&', i, false, 4);
            if (iZ0 == -1) {
                iZ0 = str.length();
            }
            int iZ02 = w9e.z0(str, '=', i, false, 4);
            if (iZ02 == -1 || iZ02 > iZ0) {
                arrayList.add(str.substring(i, iZ0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iZ02));
                arrayList.add(str.substring(iZ02 + 1, iZ0));
            }
            i = iZ0 + 1;
        }
        return arrayList;
    }

    public static String e(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = 0;
        int i5 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 32) != 0 ? false : z3;
        boolean z8 = (i3 & 64) != 0 ? false : z4;
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = 32;
            int i7 = 43;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || w9e.q0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !x(iCharCount, length, str)))) || (iCodePointAt == 43 && z7)))) {
                bt0 bt0Var = new bt0();
                bt0Var.z0(i5, iCharCount, str);
                bt0 bt0Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i7 && z7) {
                            String str3 = z5 ? "+" : "%2B";
                            bt0Var.z0(i4, str3.length(), str3);
                        } else {
                            if (iCodePointAt2 >= i6 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z8) && !w9e.q0(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z5 && (!z6 || x(iCharCount, length, str))))) {
                                    bt0Var.B0(iCodePointAt2);
                                }
                            }
                            if (bt0Var2 == null) {
                                bt0Var2 = new bt0();
                            }
                            bt0Var2.B0(iCodePointAt2);
                            while (!bt0Var2.B()) {
                                byte b2 = bt0Var2.readByte();
                                bt0Var.u0(37);
                                char[] cArr = vq6.j;
                                bt0Var.u0(cArr[((b2 & 255) >> 4) & 15]);
                                bt0Var.u0(cArr[b2 & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i4 = 0;
                    i6 = 32;
                    i7 = 43;
                }
                return bt0Var.p0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i5, length);
    }

    public static int t(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 3213448) {
            if (iHashCode == 99617003 && str.equals("https")) {
                return 443;
            }
        } else if (str.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
            return 80;
        }
        return -1;
    }

    public static b11 u(ty4 ty4Var, wn7 wn7Var) {
        int i;
        IOException iOException = wn7Var.a;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException) || ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).c) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (ty4Var.a(1)) {
            return new b11(1, 2, 300000L);
        }
        if (ty4Var.a(2)) {
            return new b11(2, 2, 60000L);
        }
        return null;
    }

    public static long w(wn7 wn7Var) {
        Throwable cause = wn7Var.a;
        if (!(cause instanceof ParserException) && !(cause instanceof FileNotFoundException) && !(cause instanceof HttpDataSource$CleartextNotPermittedException) && !(cause instanceof Loader$UnexpectedLoaderException)) {
            int i = DataSourceException.b;
            while (cause != null) {
                if (!(cause instanceof DataSourceException) || ((DataSourceException) cause).a != 2008) {
                    cause = cause.getCause();
                }
            }
            return Math.min((wn7Var.b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public static boolean x(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && naf.q(str.charAt(i + 1)) != -1 && naf.q(str.charAt(i3)) != -1;
    }

    public static void y() {
        xx6 xx6VarI = y8a.a.i();
        if (xx6VarI != null) {
            xx6VarI.b(1);
        }
    }

    public static String z(int i, String str, int i2, int i3, boolean z) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                bt0 bt0Var = new bt0();
                bt0Var.z0(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iQ = naf.q(str.charAt(iCharCount + 1));
                        int iQ2 = naf.q(str.charAt(i4));
                        if (iQ == -1 || iQ2 == -1) {
                            bt0Var.B0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            bt0Var.u0((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        bt0Var.u0(32);
                        iCharCount++;
                    } else {
                        bt0Var.B0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return bt0Var.p0();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    @Override // defpackage.go7
    public void a() {
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        int i = x9c.g;
        hm9.p("x9c", "Can't add to recents", (Throwable) obj);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        return ((OneMeRoomDatabase) obj).z();
    }

    @Override // defpackage.ol6
    public boolean b() {
        return true;
    }

    @Override // defpackage.nr2
    public int c(int i) {
        int i2 = lsb.chat_common_action_background_error;
        v83 v83Var = o;
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
                            hxe hxeVar = X;
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
                                    i9g i9gVar = Y;
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

    @Override // defpackage.n43
    public void f() {
    }

    @Override // defpackage.nr2
    public is0 g() {
        return b;
    }

    @Override // defpackage.nr2
    public i9g h() {
        return Y;
    }

    @Override // defpackage.lm9
    public void i(String str) {
    }

    @Override // defpackage.lm9
    public void j(String str, Throwable th) {
    }

    @Override // defpackage.nr2
    public is0 k() {
        return c;
    }

    @Override // defpackage.ol6
    public long l() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.go7
    public void load() {
        synchronized (tu0.h) {
            Object obj = tu0.i;
            synchronized (obj) {
                if (tu0.j) {
                    return;
                }
                long jA = tu0.a();
                synchronized (obj) {
                    tu0.k = jA;
                    tu0.j = true;
                }
            }
        }
    }

    @Override // defpackage.nr2
    public hxe m() {
        return X;
    }

    @Override // defpackage.ol6
    public boolean n(long j) {
        return System.currentTimeMillis() < j;
    }

    @Override // defpackage.lm9
    public void o(Throwable th) {
        if (th != null) {
            th.getMessage();
        }
    }

    @Override // defpackage.ele
    public long p(int i, long j, float f) {
        if (i > 6) {
            i = 6;
        }
        long jPow = ((long) Math.pow(2.0d, i)) * 1000;
        return jPow + ((long) (jPow * f)) + j;
    }

    @Override // defpackage.edc
    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, nud[] nudVarArr) {
        String str = unsatisfiedLinkError instanceof mud ? ((mud) unsatisfiedLinkError).a : null;
        Objects.toString(unsatisfiedLinkError);
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (nud nudVar : nudVarArr) {
            if (nudVar instanceof p5f) {
                p5f p5fVar = (p5f) nudVar;
                nudVar.b();
                p5fVar.getClass();
                File file = p5fVar.a;
                try {
                    mhe.d(file, new File(file, "dso_lock")).close();
                } catch (Exception unused) {
                    Objects.toString(file);
                }
            }
        }
        return true;
    }

    @Override // defpackage.n43
    public void r(tld tldVar, Throwable th) {
        Object objB = tldVar.b();
        ta5.j(o43.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(tldVar)), objB == null ? null : objB.getClass().getName());
    }

    @Override // defpackage.nr2
    public v83 s() {
        return o;
    }

    public int v(int i) {
        return i == 7 ? 6 : 3;
    }
}
