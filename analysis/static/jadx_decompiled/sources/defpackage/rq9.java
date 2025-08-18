package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.http.NoHttpApiEndpointException;

/* loaded from: classes.dex */
public final class rq9 implements o5b, nr2, qj3, s43, q7f, i43, dn6, Provider, vp6, df9 {
    public static rq9 a;
    public static rq9 v0;
    public static final rq9 b = new rq9();
    public static final is0 c = new is0(new bs0(new as0(-1301656065, -1721086465, 1718242815), new cs0(new ds0(697119692, 9253836), new es0(1032664012, 9253836), new fs0(1384985548, 9253836)), new gs0(-9810433, 704643071, -9810433, 704643071), new hs0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -3158065, -2133864497, 536870911, -13028803, 704643071, 704643071, 536870911, 704643071, 536870911, 1728053247, new int[]{-13487043, -13487043, -13487043}, new int[]{-13487043, -13487043}), new js0(-13028803, -1191182337, -16711919, -36771, -1543503873, -1543503873, -16711919, -16711919, -2130706433, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new ks0(-14078413, 352321535, 1728053247, -1), new ls0(new ms0(-1, -520093697, -1, -520093697), -8362241, -520093697, -1, -520093697, -2046820353, -2130706433, -1107296257, -1, -1, -2130706433, -520093697, -2130706433));
    public static final is0 o = new is0(new bs0(new as0(-1721086465, -1721086465, 1718242815), new cs0(new ds0(704643071, 16777215), new es0(1032664012, 9253836), new fs0(1384985548, 9253836)), new gs0(-1, 704643071, -9810433, 704643071), new hs0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -520093697, -2130706433, 704643071, -7523380, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-1741997, -7523380, -13022491}, new int[]{-13022491, -7523380}), new js0(-10469159, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new ks0(-10469159, 452984831, -2046820353, -1), new ls0(new ms0(-9810433, -520093697, -1, -520093697), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
    public static final v83 X = new v83(new j73(new i73(-48049, -1579033, -9810433, -5058310), new k73(-1, 1895825407, -9810433)), new m73(new l73(0, 0, 0, 0, 0, 0, -15725039, -15725039, 1032871917, -11319257, -11319257, 5457959, -14465714, -14465714, 2311502), new n73(-2405632, 721429580, 1305464783, -1, 1946157055, 721429580, 1305464783, -1, -4703924, 721429580, 1305464783, -1, -15166245, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -13290047, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -7523380, 724959367, 1305464783, -1, -10669092, 721429580, 1305464783, -1), new q73(new o73(452984831, new int[]{16777215, 285212671, 553648127}), new p73(452984831, new int[]{16777215, 285212671, 553648127}), new s73(new r73(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}), new u73(new t73(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433})), new v73(new int[]{-1556990915, -533580739, -533580739}, -1, 16777215, 16777215, 16777215, 16777215, 872415231, 452984831), -9810433, 1932407608, -1305266074, -869058458, -13420442, -15263716, -1, 536870911, 402653183, -9810433, -1559491570, -871625714, -1727263730, 1301964543, -9810433, -12171706, -15725039, new int[]{-1305266074, -1305266074}, new int[]{-13420442, -13420442}, new int[]{-650954650, -1305266074, -1942800282}, new int[]{-15725039, -15725039}), new w83(-9810433, -520093697, -3259817, -2130706433, -9810433, -855638017), new b93(new c93(855638016, 637534208), new d93(687865856), new e93(687865856)), new j93(new h93(new g93(new f93(-12641537), 536870911), new i93(-1721086465, 184549375, 1728053247)), new k93(new l93(1207959551, -1721086465)), new m93(new n93(1207959551, 2063597567, 1207959551, -1548240711, -1721086465))), new o93(new p93(536870911), -855638017, 1882734149), new q93(-855638017, -855638017, -15987698, -3259817, -520093697, 1895825407, 1207959551, -9810433));
    public static final hxe Y = new hxe(new exe(new fxe(-1, 352321535, -9810433, -14672348), new gxe(1728053247, 184549375, -1721086465)), new ixe(new jxe(-15921907, 352321535, -855638017, -11513776, 1895825407, -8618884, -9810433), new kxe(-1559425779, 2063597567, 1207959551, 184549375, -1548109383, -1548109383, -1548109383, -1548109383, -1721086465)), new lxe(new mxe(new nxe(536870911, 268435455))), new oxe(new pxe(-15921907, -855638017, 1895825407, -9810433), new qxe(-1559425779, 2063597567, -1548109383, -1548109383, -1721086465)));
    public static final i9g Z = new i9g(new h9g(-15198184, -14672348, 401074151, -14672348), new j9g(-855638017, 1895825407, -8618884, -9810433, 1895825407), new k9g(266856423, 15198183, -9810433), new l9g(-1579033, -9810433, 1474815975, -1, -1108875289, -2130706433, -2130706433, -9810433));
    public static final rq9 s0 = new rq9();
    public static final rq9 t0 = new rq9();
    public static final rq9 u0 = new rq9();

    public static final void e(File... fileArr) {
        for (File file : fileArr) {
            if (file.exists()) {
                try {
                    m6d.k(file);
                } catch (IOException unused) {
                    file.toString();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.hs i(java.io.File... r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq9.i(java.io.File[]):hs");
    }

    public static final kl7 j(DataInputStream dataInputStream) throws IOException {
        Object utf;
        kl7 kl7VarL = j1e.l();
        while (dataInputStream.read() == 3) {
            long j = dataInputStream.readLong();
            String utf2 = dataInputStream.readUTF();
            long j2 = dataInputStream.readLong();
            String utf3 = dataInputStream.readUTF();
            ky7 ky7Var = new ky7();
            int i = dataInputStream.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                String utf4 = dataInputStream.readUTF();
                int i3 = dataInputStream.readInt();
                if (i3 == 1) {
                    utf = dataInputStream.readUTF();
                } else if (i3 == 2) {
                    utf = Boolean.valueOf(dataInputStream.readBoolean());
                } else if (i3 == 3) {
                    utf = Long.valueOf(dataInputStream.readLong());
                } else {
                    if (i3 != 4) {
                        throw new IOException(zr6.h(i3, "Unsupported attribute value type "));
                    }
                    utf = Double.valueOf(dataInputStream.readDouble());
                }
                ky7Var.put(utf4, utf);
            }
            kl7VarL.add(new ata(j, utf2, j2, utf3, ky7Var.b()));
        }
        return j1e.d(kl7VarL);
    }

    public static final void l(DataOutputStream dataOutputStream, ata ataVar) throws IOException {
        dataOutputStream.writeByte(3);
        dataOutputStream.writeLong(ataVar.a);
        dataOutputStream.writeUTF(ataVar.b);
        dataOutputStream.writeLong(ataVar.c);
        dataOutputStream.writeUTF(ataVar.d);
        Map map = ataVar.e;
        dataOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            dataOutputStream.writeUTF(str);
            if (value instanceof Boolean) {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
            } else if (value instanceof Long ? true : value instanceof Integer ? true : value instanceof Byte ? true : value instanceof Short) {
                dataOutputStream.writeInt(3);
                dataOutputStream.writeLong(((Number) value).longValue());
            } else if (value instanceof Double ? true : value instanceof Float) {
                dataOutputStream.writeInt(4);
                dataOutputStream.writeDouble(((Number) value).doubleValue());
            } else {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeUTF(value.toString());
            }
        }
    }

    public static rq9 n(Context context, int i) {
        c54.j("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, z2c.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(z2c.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(z2c.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(z2c.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(z2c.MaterialCalendarItem_android_insetBottom, 0));
        ju0.q(context, typedArrayObtainStyledAttributes, z2c.MaterialCalendarItem_itemFillColor);
        ju0.q(context, typedArrayObtainStyledAttributes, z2c.MaterialCalendarItem_itemTextColor);
        ju0.q(context, typedArrayObtainStyledAttributes, z2c.MaterialCalendarItem_itemStrokeColor);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.MaterialCalendarItem_itemStrokeWidth, 0);
        gjd.a(context, typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new a0(0)).c();
        typedArrayObtainStyledAttributes.recycle();
        rq9 rq9Var = new rq9();
        c54.m(rect.left);
        c54.m(rect.top);
        c54.m(rect.right);
        c54.m(rect.bottom);
        return rq9Var;
    }

    public static synchronized rq9 o() {
        try {
            if (a == null) {
                a = new rq9();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static boolean q(List list, String str, String str2, int i) {
        if (str2 == null) {
            String strY0 = w9e.Y0(31, str);
            int length = strY0.length();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (eae.o0(str3, strY0, false) && str3.length() > length && str3.charAt(length) == '=') {
                    it.remove();
                }
            }
            return false;
        }
        String strY02 = w9e.Y0(31, str);
        int length2 = strY02.length();
        String strY03 = w9e.Y0(31, str2);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str4 = (String) it2.next();
            if (eae.o0(str4, strY02, false) && str4.length() > length2 && str4.charAt(length2) == '=') {
                it2.remove();
                if (str4.endsWith(strY03) && str4.length() == strY03.length() + length2 + 1) {
                    list.add(str4);
                    return false;
                }
            }
        }
        list.add(strY02 + '=' + strY03);
        while (list.size() > i) {
            list.remove(0);
        }
        return true;
    }

    public static sh0 t() throws IOException {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("dns.google.com").appendPath("resolve");
        builderAppendPath.appendQueryParameter("name", "api._endpoint.ok.ru.");
        builderAppendPath.appendQueryParameter("type", String.valueOf(16));
        URLConnection uRLConnectionOpenConnection = new URL(builderAppendPath.toString()).openConnection();
        uRLConnectionOpenConnection.setConnectTimeout(3000);
        uRLConnectionOpenConnection.setReadTimeout(3000);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnectionOpenConnection.getInputStream(), a52.a), 8192);
        try {
            String strH = m6d.H(bufferedReader);
            v3c.i(bufferedReader, null);
            try {
                JSONObject jSONObject = new JSONObject(strH).getJSONArray("Answer").getJSONObject(0);
                jSONObject.getString("name");
                jSONObject.getInt("type");
                return new sh0(jSONObject.getInt("TTL"), jSONObject.getString("data"), 8);
            } catch (JSONException e) {
                throw new IOException(e);
            }
        } finally {
        }
    }

    @Override // defpackage.dn6
    public ypa E(xm6 xm6Var, pm6 pm6Var) {
        return new bn6(xm6Var, pm6Var);
    }

    @Override // defpackage.i43
    public void a() {
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        hm9.p(mp4.g, "restoreUploadsFromStorage: failed", (Throwable) obj);
    }

    @Override // defpackage.i43
    public void b(String str) {
    }

    @Override // defpackage.nr2
    public int c(int i) {
        int i2 = lsb.chat_common_action_background_error;
        v83 v83Var = X;
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
                            hxe hxeVar = Y;
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
                                    i9g i9gVar = Z;
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

    @Override // defpackage.i43
    public void close() {
    }

    @Override // defpackage.dn6
    public ypa f() {
        return new bn6(xm6.n, null);
    }

    @Override // defpackage.nr2
    public is0 g() {
        return c;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new q67(Executors.newSingleThreadExecutor());
    }

    @Override // defpackage.nr2
    public i9g h() {
        return Z;
    }

    @Override // defpackage.nr2
    public is0 k() {
        return o;
    }

    @Override // defpackage.nr2
    public hxe m() {
        return Y;
    }

    @Override // defpackage.vp6
    public Uri p(String str) {
        if (!str.equals("api")) {
            throw new NoHttpApiEndpointException(str);
        }
        Uri uri = sl.a;
        return sl.a;
    }

    @Override // defpackage.df9
    public Object r(gy8 gy8Var) {
        return Integer.valueOf(lz7.L(gy8Var));
    }

    @Override // defpackage.nr2
    public v83 s() {
        return X;
    }

    @Override // defpackage.s43
    public gle w(gy8 gy8Var) throws IOException {
        int iN;
        String strP;
        ArrayList arrayList;
        boolean zM = gy8Var.m();
        nz4 nz4Var = nz4.a;
        if (!zM) {
            return new d8b(nz4Var);
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
        if (iN == 0) {
            return new d8b(nz4Var);
        }
        ArrayList arrayList2 = new ArrayList();
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
                if (strP.equals("presetAvatars")) {
                    if (gy8Var.n().a() == 7) {
                        arrayList = new ArrayList();
                        int iS0 = gy8Var.s0();
                        for (int i2 = 0; i2 < iS0; i2++) {
                            arrayList.add(z04.S(gy8Var));
                        }
                    } else {
                        gy8Var.z();
                        arrayList = null;
                    }
                    List listE0 = arrayList != null ? x53.e0(arrayList) : null;
                    if (listE0 == null) {
                        listE0 = nz4Var;
                    }
                    arrayList2.addAll(listE0);
                } else {
                    try {
                        gy8Var.z();
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
                }
            }
        }
        return new d8b(arrayList2);
    }
}
