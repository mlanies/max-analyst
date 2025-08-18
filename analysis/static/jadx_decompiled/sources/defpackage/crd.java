package defpackage;

import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.List;
import org.apache.http.entity.ContentLengthStrategy;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* loaded from: classes2.dex */
public final class crd implements nr2, b66, qj3, p78, pa5, gy7 {
    public static final crd a = new crd();
    public static final is0 b = new is0(new bs0(new as0(-1303424355, -1722854755, 1716474525), new cs0(new ds0(694773221, 6907365), new es0(1030317541, 6907365), new fs0(1382641064, 6909352)), new gs0(-16745729, 704643071, -16745729, 704643071), new hs0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -3158065, -2133864497, 536870911, -14471622, 704643071, 704643071, 536870911, 704643071, 536870911, 1728053247, new int[]{-12894370, -13157810, -13487043}, new int[]{-12894370, -13487043}), new js0(-13487042, -1191182337, -16711919, -36771, -1543503873, -1543503873, -16711919, -16711919, -2130706433, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new ks0(-14078413, 352321535, 1728053247, -1), new ls0(new ms0(-1, -520093697, -1, -520093697), -12542721, -520093697, -1, -520093697, -2046820353, -2130706433, -1107296257, -1, -1, -2130706433, -520093697, -2130706433));
    public static final is0 c = new is0(new bs0(new as0(-1722117017, -1722117017, 1717212263), new cs0(new ds0(704643071, 16777215), new es0(1030317541, 6907365), new fs0(1382641064, 6909352)), new gs0(-1, 704643071, -16745729, 704643071), new hs0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -520093697, -2130706433, 704643071, -9869851, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-7845452, -9217331, -10655003}, new int[]{-7845452, -10655003}), new js0(-9869851, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new ks0(-9217331, 452984831, -2046820353, -1), new ls0(new ms0(-10655003, -520093697, -1, -520093697), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
    public static final v83 o = new v83(new j73(new i73(-48049, -1579033, -16745729, -5058310), new k73(-1, 1895825407, -16745729)), new m73(new l73(0, 0, 0, 0, 0, 0, -15461356, -15461356, 1297112007, 0, 0, 0, 0, 0, 0), new n73(-2405632, 721429580, 1305464783, -1, 1946157055, 721429580, 1305464783, -1, -4703924, 721429580, 1305464783, -1, -15166245, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -13290047, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -15757630, 721429580, 1305464783, -1, -10669092, 721429580, 1305464783, -1), new q73(new o73(452984831, new int[]{16777215, 285212671, 553648127}), new p73(452984831, new int[]{16777215, 285212671, 553648127}), new s73(new r73(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}), new u73(new t73(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433})), new v73(new int[]{-1556661682, -533251506, -533251506}, -1, 16777215, 16777215, 16777215, 16777215, 872415231, 452984831), -16745729, 1932407608, 352321535, -868400310, -12762294, -15263716, -1, 536870911, 402653183, -16745729, -1559425779, -871625458, -1727263474, 1297112007, -16745729, -12500154, -15461356, new int[]{-1304740002, -1305332675}, new int[]{-12894370, -13487043}, new int[]{-650625467, -1304936891, -1942471099}, new int[]{-15856111, -15856111}), new w83(-16745729, -520093697, -3259817, -2130706433, -16745729, -855638017), new b93(new c93(855638016, 637534208), new d93(687865856), new e93(687865856)), new j93(new h93(new g93(new f93(-16751924), 536870911), new i93(-1721145883, 184549375, 1728053247)), new k93(new l93(1207959551, -1728021761)), new m93(new n93(1207959551, 2063597567, 1207959551, -1548240711, -1728021761))), new o93(new p93(536870911), -855638017, 1882734149), new q93(-855638017, -855638017, -15987442, -3259817, -520093697, 1895825407, 1207959551, -16745729));
    public static final hxe X = new hxe(new exe(new fxe(-1, 352321535, -16745729, -14803164), new gxe(1728053247, 184549375, -1728021761)), new ixe(new jxe(-15921907, 352321535, -855638017, -11579312, 1895825407, -8815492, -16745729), new kxe(-1559425779, 2063597567, 1207959551, 184549375, -1548240711, -1548240711, -1548240711, -1548240711, -1728021761)), new lxe(new mxe(new nxe(536870911, 268435455))), new oxe(new pxe(-15921907, -855638017, 1895825407, -16745729), new qxe(-1559425779, 2063597567, -1548240711, -1548240711, -1728021761)));
    public static final i9g Y = new i9g(new h9g(-15198184, -14803164, 401074151, -14803164), new j9g(-855638017, 1895825407, -8815492, -16745729, 1895825407), new k9g(266856423, 15198183, -16745729), new l9g(-1579033, -16745729, 1474815975, -1, -1108875289, -2130706433, -2130706433, -16745729));
    public static final crd Z = new crd();
    public static final crd s0 = new crd();
    public static final crd t0 = new crd();
    public static final crd u0 = new crd();

    public static void a(EventItemsMap eventItemsMap, cz1 cz1Var) {
        eventItemsMap.set("local_connection_type", cz1Var.b);
        eventItemsMap.set("remote_connection_type", cz1Var.e);
        eventItemsMap.set("local_address", cz1Var.d);
        eventItemsMap.set("remote_address", cz1Var.g);
        Integer numValueOf = null;
        String str = cz1Var.h;
        if (str != null) {
            Float fValueOf = hvc.a.a(str) ? Float.valueOf(Float.parseFloat(str)) : null;
            if (fValueOf != null) {
                numValueOf = Integer.valueOf((int) fValueOf.floatValue());
            }
        }
        eventItemsMap.set("rtt", numValueOf);
        eventItemsMap.set("transport", cz1Var.i);
    }

    public static j00 e(l20 l20Var, long j, long j2, Uri uri, boolean z) {
        if (l20Var.f()) {
            return new j00(l20Var, l20Var.b, j, j2, uri);
        }
        if (!l20Var.i()) {
            return null;
        }
        k20 k20Var = l20Var.d;
        return new j00(l20Var, k20Var, k20Var.b, j, j2, uri, z);
    }

    public static /* synthetic */ j00 f(l20 l20Var, long j, long j2, boolean z, int i) {
        if ((i & 16) != 0) {
            z = false;
        }
        return e(l20Var, j, j2, null, z);
    }

    public static gvd l(CharSequence charSequence, boolean z) {
        SpannableString spannableString;
        try {
            spannableString = new SpannableString(charSequence);
            kp.g(spannableString, z);
        } catch (IndexOutOfBoundsException unused) {
            if (charSequence instanceof Spannable) {
                kp.g((Spannable) charSequence, z);
            }
            spannableString = new SpannableString(charSequence);
        }
        return new gvd(spannableString);
    }

    @Override // defpackage.pa5
    /* renamed from: B */
    public yze mo6B(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pa5
    public void J(v1d v1dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        int i = x9c.g;
        hm9.p("x9c", "RECENT REMOVED update handle fail", (Throwable) obj);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        return qy9.j((List) obj);
    }

    @Override // defpackage.gy7
    public Object b(ova ovaVar) {
        return ovaVar.T0;
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

    @Override // defpackage.nr2
    public is0 g() {
        return b;
    }

    @Override // defpackage.nr2
    public i9g h() {
        return Y;
    }

    @Override // defpackage.p78
    public r78 i(n78 n78Var) {
        String string;
        if (maf.a < 31) {
            return new oz7().i(n78Var);
        }
        int iG = ha9.g(n78Var.c.w0);
        switch (iG) {
            case ContentLengthStrategy.CHUNKED /* -2 */:
                string = "none";
                break;
            case -1:
                string = "unknown";
                break;
            case 0:
                string = "default";
                break;
            case 1:
                string = MediaStreamTrack.AUDIO_TRACK_KIND;
                break;
            case 2:
                string = MediaStreamTrack.VIDEO_TRACK_KIND;
                break;
            case 3:
                string = "text";
                break;
            case 4:
                string = "image";
                break;
            case 5:
                string = "metadata";
                break;
            case 6:
                string = "camera motion";
                break;
            default:
                if (iG < 10000) {
                    string = "?";
                    break;
                } else {
                    StringBuilder sb = new StringBuilder(20);
                    sb.append("custom (");
                    sb.append(iG);
                    sb.append(")");
                    string = sb.toString();
                    break;
                }
        }
        String strValueOf = String.valueOf(string);
        if (strValueOf.length() != 0) {
            "Creating an asynchronous MediaCodec adapter for track type ".concat(strValueOf);
        }
        return new va8(iG).i(n78Var);
    }

    public lsd j(ffc ffcVar) {
        return (lsd) ffcVar.get(0);
    }

    @Override // defpackage.nr2
    public is0 k() {
        return c;
    }

    @Override // defpackage.nr2
    public hxe m() {
        return X;
    }

    @Override // defpackage.nr2
    public v83 s() {
        return o;
    }

    @Override // defpackage.pa5
    public void w() {
        throw new UnsupportedOperationException();
    }
}
