package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.soloader.NoBaseApkException;
import com.facebook.soloader.SoLoader;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.MainActivity;

/* loaded from: classes2.dex */
public final class hx9 implements nr2, b66, q7f, pic, en6, im9, fo7 {
    public static final hx9 a = new hx9();
    public static final is0 b = new is0(new bs0(new as0(-1555484473, -1555484473, 1716072647), new cs0(new ds0(524890311, 4796615), new es0(1028206791, 4796615), new fs0(1028206791, 4796615)), new gs0(-11980601, 340340935, -1, -2058800953), new hs0(1301099468, 177025996, 9253836, new int[]{1301099468, -2138229812}), -9810433, 1030376959, 342511103, -1, 342511103, -4112, 342511103, -1, 342511103, 2053787135, new int[]{-1, -1, -1}, new int[]{-1, -1}), new js0(-1, -11980601, -16711919, -53188, -11980601, -1303826233, -16711919, -16711919, -8356967, -8356967, -11980601, -871625458, -1895035634, 1879837966, -1895035634), new ks0(-1, 340340935, -11980601, -1), new ls0(new ms0(-1, -9810433, -9810433, -1), -11980601, -11980601, -11980601, -15987442, -2062807794, -2062808050, -1207170034, -9810433, 16777215, -2062808050, -1207170034, -2062807794));
    public static final is0 c = new is0(new bs0(new as0(-1723256633, -1723256633, 1716072647), new cs0(new ds0(524890311, 4796615), new es0(1028206791, 4796615), new fs0(1028206791, 4796615)), new gs0(-11980601, 524890311, -1, -2058800953), new hs0(1301099468, 177025996, 9253836, new int[]{1301099468, -2138229812}), -11980601, 1548300487, 340340935, -1442305, 340340935, 340340935, 524890311, -656897, 340340935, 2051569387, new int[]{-2432769, -2432769, -2432769}, new int[]{-2432769, -2432769}), new js0(-2432769, -11980601, -1685946, -16711919, -11980601, -11980601, -11980601, -1, -2062744269, -2062744269, -16711919, -871561933, -1894972109, 1879901491, -1894972109), new ks0(-2432769, 340340935, -11980601, -1), new ls0(new ms0(-1, -11980601, -11980601, -1), -11980601, -11980601, -16711919, -15923917, -2062744269, -2062744269, -1207106253, -11980601, 16777215, -2062744269, -1207106253, -11980601));
    public static final v83 o = new v83(new j73(new i73(-53188, -15921907, -11980601, -2693121), new k73(-15987442, -4933959, -11980601)), new m73(new l73(-857370754, -857370754, 15044478, -9199105, -9199105, 7578111, -3962899, -3962899, -5283609, -3587250, -3587250, 13189966, -14129921, -14129921, 2647295), new n73(-371456, 1039815936, 704271616, -371456, -1543503873, 1024489791, 688945471, -15697601, -2409396, 1037777996, 702233676, -2409396, -16544549, 1023642843, 688098523, -16544549, 1033643952, 698099632, -6543440, -10587743, 1029599649, 694055329, -10587743, 1025203902, 689659582, -14983490, -7523380, 1030376959, 694832639, -7523380, -9158436, 1031028956, 695484636, -9158436), new q73(new o73(1308622847, new int[]{16777215, 1090519039, -2130706433}), new p73(-986638, new int[]{16777215, 1090519039, -2130706433}), new s73(new r73(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new u73(new t73(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444})), new v73(new int[]{-1543503873, -520093697, -520093697}, -16769551, -16729857, 47359, -7798611, 8978605, -1, -2130706433), -11980601, 1543503872, -2055524153, -1192234767, -1249810, -1184014, -15921907, 856230153, 336136457, -15921907, 1376521230, -871625714, -1727263730, 1493172224, -11980601, -1184014, -3962899, new int[]{-2053557249, -2053557249}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-1732738, -3962899}), new w83(-11980601, -11980601, -53188, -2062808050, -11980601, -1), new b93(new c93(251658240, 167772160), new d93(251658240), new e93(251658240)), new j93(new h93(new g93(new f93(-14810958), 520093696), new i93(-1723256633, 168627469, 2047675661)), new k93(new l93(-1545253546, -1723256633)), new m93(new n93(-1543503873, -1191182337, -1545253546, -1552977290, -1723256633))), new o93(new p93(688655374), -1, 1308622847), new q93(-1, -15987698, -1, -53188, -15987698, -2062808050, 1712065550, -11980601));
    public static final hxe X = new hxe(new exe(new fxe(-15921907, 336136457, -11980601, -1), new gxe(2047675661, 168364297, -1723256633)), new ixe(new jxe(-1, 336136457, -15921907, -4276546, -11184811, -7566196, -11980601), new kxe(-1191182337, -1191182337, -1545253546, 168364297, -1552517514, -1552517514, -1552517514, -1552517514, -1723256633)), new lxe(new mxe(new nxe(688655374, 252447758))), new oxe(new pxe(-1, -15921907, -2062742259, -11980601), new qxe(-1543503873, -1191182337, -1552517514, -1552517514, -1723256633)));
    public static final i9g Y = new i9g(new h9g(-592138, -1, 336136457, -1), new j9g(-15987698, -7566196, -7566196, -11980601, 1879837710), new k9g(252447758, 252447758, -11980601), new l9g(-15987698, -11980601, 1712065550, -15987698, -1207170034, -2062808050, -2062808050, -11980601));
    public static final hx9 Z = new hx9();
    public static final hx9 s0 = new hx9();
    public static final hx9 t0 = new hx9();
    public static final hx9 u0 = new hx9();

    public static final void j(hx9 hx9Var, String str) {
        us7 us7Var;
        hx9Var.getClass();
        int iS = au1.s(2);
        if (iS == 0) {
            us7Var = us7.X;
        } else if (iS == 1) {
            us7Var = us7.Y;
        } else if (iS == 2) {
            us7Var = us7.Z;
        } else {
            if (iS != 3) {
                if (iS != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            us7Var = us7.s0;
        }
        hm9.N(us7Var, "Scout", str, new Object[0]);
    }

    public static final String l(sh0 sh0Var) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        int i = sh0Var.b;
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "Illegal Capacity: "));
        }
        int[] iArr2 = new int[Math.max(i, 8)];
        int i2 = 0;
        while (sh0Var.b != 0) {
            int iU = sh0Var.u();
            int length = iArr2.length;
            if (i2 < length) {
                iArr = iArr2;
            } else {
                iArr = new int[length * 2];
                System.arraycopy(iArr2, 0, iArr, 0, length);
                iArr2 = iArr;
            }
            iArr2[i2] = iU;
            i2++;
            iArr2 = iArr;
        }
        while (i2 != 0) {
            if (i2 == 0) {
                throw new NoSuchElementException();
            }
            i2--;
            int i3 = iArr2[i2];
            String str = "";
            switch (i3) {
                case 0:
                case 2:
                    break;
                case 1:
                    str = "=";
                    break;
                case 3:
                case 5:
                    str = "{";
                    break;
                case 4:
                    str = "{:";
                    break;
                case 6:
                case 7:
                    str = "[";
                    break;
                default:
                    throw new IllegalArgumentException(zr6.h(i3, ""));
            }
            sb.append(str);
            sh0Var.w(i3);
        }
        return sb.toString();
    }

    public static ece n(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u41 u41Var = (u41) it.next();
            int i = sag.a[u41Var.a.a.ordinal()];
            fp1 fp1Var = u41Var.a;
            if (i == 1) {
                hashSet.add(fp1Var.b);
            } else if (i == 2) {
                hashSet2.add(fp1Var.b);
            } else if (i == 3) {
                hashSet3.add(fp1Var.b);
            }
        }
        return new ece(hashSet2);
    }

    public static d6c q(int i) {
        Object next;
        v25 v25Var = d6c.X;
        v25Var.getClass();
        u1 u1Var = new u1(0, v25Var);
        while (true) {
            if (!u1Var.hasNext()) {
                next = null;
                break;
            }
            next = u1Var.next();
            if (((d6c) next).a == i) {
                break;
            }
        }
        d6c d6cVar = (d6c) next;
        if (d6cVar != null) {
            return d6cVar;
        }
        throw new IllegalArgumentException(zr6.h(i, "Unknown reactionType = "));
    }

    public static u61 r(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -2105248304) {
            if (iHashCode != -1881579439) {
                if (iHashCode != -1284823979) {
                    if (iHashCode == 65120 && str.equals("ASR")) {
                        return u61.o;
                    }
                } else if (str.equals("ADD_PARTICIPANT")) {
                    return u61.a;
                }
            } else if (str.equals("RECORD")) {
                return u61.b;
            }
        } else if (str.equals("MOVIE_SHARE")) {
            return u61.c;
        }
        return null;
    }

    public static void t(Context context, Uri uri, uia uiaVar, q12 q12Var, int i) {
        int i2 = MainActivity.a1;
        if ((i & 2) != 0) {
            uri = null;
        }
        if ((i & 4) != 0) {
            uiaVar = null;
        }
        m56 g27Var = q12Var;
        if ((i & 8) != 0) {
            g27Var = new g27(10);
        }
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.putExtra("deep_link", uri != null ? uri : null);
        intent.putExtra("snackbar", uiaVar);
        g27Var.invoke(intent);
        context.startActivity(intent);
    }

    @Override // defpackage.fo7
    public void a() {
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        return new sa3(2, new ia4(1, (tp4) obj));
    }

    @Override // defpackage.im9
    public boolean b(String str) {
        Boolean boolValueOf;
        if (SoLoader.e == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = SoLoader.c;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (SoLoader.e == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (SoLoader.class) {
                            try {
                                boolean z = !SoLoader.h.contains(str);
                                if (z) {
                                    System.loadLibrary(str);
                                }
                                boolValueOf = Boolean.valueOf(z);
                            } finally {
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                    } else if (!SoLoader.h()) {
                        throw new IllegalStateException("SoLoader.init() not yet called");
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                boolValueOf = null;
            } catch (Throwable th) {
                SoLoader.c.readLock().unlock();
                throw th;
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        if (!SoLoader.k) {
            return hm9.M(str);
        }
        if (SoLoader.m != 2) {
        }
        String strMapLibraryName = System.mapLibraryName(str);
        sh0 sh0VarD = null;
        while (true) {
            try {
                return SoLoader.i(strMapLibraryName, str, 0, null);
            } catch (UnsatisfiedLinkError e) {
                SoLoader.c.writeLock().lock();
                if (sh0VarD == null) {
                    try {
                        try {
                            sh0VarD = SoLoader.d();
                        } catch (Throwable th2) {
                            SoLoader.c.writeLock().unlock();
                            throw th2;
                        }
                    } catch (NoBaseApkException e2) {
                        throw e2;
                    } catch (Exception unused) {
                        throw e;
                    }
                }
                if (sh0VarD == null || !sh0VarD.q(e, SoLoader.e)) {
                    SoLoader.c.writeLock().unlock();
                    throw e;
                }
                SoLoader.f.getAndIncrement();
                SoLoader.c.writeLock().unlock();
            }
        }
        SoLoader.c.writeLock().unlock();
        throw e;
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

    @Override // defpackage.pic
    public void e(Object obj) {
        try {
            q43.a((Closeable) obj);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.en6
    public zpa f() {
        return new cn6();
    }

    @Override // defpackage.nr2
    public is0 g() {
        return b;
    }

    @Override // defpackage.nr2
    public i9g h() {
        return Y;
    }

    @Override // defpackage.en6
    public zpa i(ym6 ym6Var, qm6 qm6Var) {
        return new cn6(ym6Var, qm6Var);
    }

    @Override // defpackage.nr2
    public is0 k() {
        return c;
    }

    @Override // defpackage.fo7
    public void load() {
        synchronized (nu0.z0) {
            Object obj = nu0.A0;
            synchronized (obj) {
                if (nu0.B0) {
                    return;
                }
                long jA = nu0.a();
                synchronized (obj) {
                    nu0.C0 = jA;
                    nu0.B0 = true;
                }
            }
        }
    }

    @Override // defpackage.nr2
    public hxe m() {
        return X;
    }

    public HashMap o(Object obj) {
        ConcurrentHashMap concurrentHashMap = ek.a;
        Class<?> cls = obj.getClass();
        HashMap map = new HashMap();
        Map map2 = (Map) ek.a.get(cls);
        Map map3 = map2;
        if (map2 == null) {
            HashMap map4 = new HashMap();
            ek.a(cls, map4, new HashMap());
            map3 = map4;
        }
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                map.put(entry.getKey(), new e45(obj, (Method) entry.getValue()));
            }
        }
        return map;
    }

    public HashMap p(Object obj) {
        ConcurrentHashMap concurrentHashMap = ek.a;
        Class<?> cls = obj.getClass();
        HashMap map = new HashMap();
        Map map2 = (Map) ek.b.get(cls);
        Map map3 = map2;
        if (map2 == null) {
            HashMap map4 = new HashMap();
            ek.a(cls, new HashMap(), map4);
            map3 = map4;
        }
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                HashSet hashSet = new HashSet();
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    hashSet.add(new t35(obj, (Method) it.next()));
                }
                map.put(entry.getKey(), hashSet);
            }
        }
        return map;
    }

    @Override // defpackage.nr2
    public v83 s() {
        return o;
    }
}
