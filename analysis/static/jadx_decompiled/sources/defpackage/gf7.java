package defpackage;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import androidx.media3.common.PlaybackException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class gf7 {
    public static final jx6 a;

    static {
        String[] strArr = {MediaMetadataCompat.METADATA_KEY_COMPOSER, MediaMetadataCompat.METADATA_KEY_COMPILATION, MediaMetadataCompat.METADATA_KEY_DATE, MediaMetadataCompat.METADATA_KEY_YEAR, MediaMetadataCompat.METADATA_KEY_GENRE, MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, MediaMetadataCompat.METADATA_KEY_DISC_NUMBER, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_ART, MediaMetadataCompat.METADATA_KEY_ART_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, MediaMetadataCompat.METADATA_KEY_USER_RATING, MediaMetadataCompat.METADATA_KEY_RATING, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_MEDIA_ID, MediaMetadataCompat.METADATA_KEY_MEDIA_URI, MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT, MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"};
        int i = jx6.c;
        Object[] objArr = new Object[32];
        objArr[0] = MediaMetadataCompat.METADATA_KEY_TITLE;
        objArr[1] = MediaMetadataCompat.METADATA_KEY_ARTIST;
        objArr[2] = MediaMetadataCompat.METADATA_KEY_DURATION;
        objArr[3] = MediaMetadataCompat.METADATA_KEY_ALBUM;
        objArr[4] = MediaMetadataCompat.METADATA_KEY_AUTHOR;
        objArr[5] = MediaMetadataCompat.METADATA_KEY_WRITER;
        System.arraycopy(strArr, 0, objArr, 6, 26);
        a = jx6.i(32, objArr);
    }

    public static long a(i3b i3bVar, hd8 hd8Var, long j) {
        long j2 = i3bVar == null ? 0L : i3bVar.c;
        long jC = c(i3bVar, hd8Var, j);
        long jD = d(hd8Var);
        return jD == -9223372036854775807L ? Math.max(jC, j2) : oaf.k(j2, jC, jD);
    }

    public static byte[] b(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long c(i3b i3bVar, hd8 hd8Var, long j) {
        if (i3bVar == null) {
            return 0L;
        }
        long jMax = i3bVar.b;
        if (i3bVar.a == 3) {
            jMax = Math.max(0L, jMax + ((long) (i3bVar.o * ((j == -9223372036854775807L ? null : Long.valueOf(j)) != null ? r3.longValue() : SystemClock.elapsedRealtime() - i3bVar.s0))));
        }
        long j2 = jMax;
        long jD = d(hd8Var);
        return jD == -9223372036854775807L ? Math.max(0L, j2) : oaf.k(j2, 0L, jD);
    }

    public static long d(hd8 hd8Var) {
        if (hd8Var == null || !hd8Var.a.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            return -9223372036854775807L;
        }
        long jA = hd8Var.a(MediaMetadataCompat.METADATA_KEY_DURATION);
        if (jA <= 0) {
            return -9223372036854775807L;
        }
        return jA;
    }

    public static long e(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(zr6.h(i, "Unrecognized FolderType: "));
        }
    }

    public static int f(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ja8 g(defpackage.tb8 r17, android.graphics.Bitmap r18) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf7.g(tb8, android.graphics.Bitmap):ja8");
    }

    public static tb8 h(ja8 ja8Var) {
        ja8Var.getClass();
        za8 za8Var = new za8();
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        Collections.emptyList();
        fb8 fb8Var = new fb8();
        lb8 lb8Var = lb8.d;
        String str = ja8Var.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        nw4 nw4Var = new nw4(8);
        nw4Var.b = ja8Var.s0;
        lb8 lb8Var2 = new lb8(nw4Var);
        gd8 gd8VarJ = j(ja8Var, 0);
        db8 db8Var = new db8(za8Var);
        hb8 hb8Var = new hb8(fb8Var);
        if (gd8VarJ == null) {
            gd8VarJ = gd8.J;
        }
        return new tb8(str2, db8Var, null, hb8Var, gd8VarJ, lb8Var2);
    }

    public static tb8 i(String str, hd8 hd8Var, int i) {
        lb8 lb8Var;
        za8 za8Var = new za8();
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        Collections.emptyList();
        ffc ffcVar2 = ffc.X;
        fb8 fb8Var = new fb8();
        lb8 lb8Var2 = lb8.d;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = hd8Var.a.getCharSequence(MediaMetadataCompat.METADATA_KEY_MEDIA_URI);
        String string = charSequence != null ? charSequence.toString() : null;
        if (string != null) {
            nw4 nw4Var = new nw4(8);
            nw4Var.b = Uri.parse(string);
            lb8Var = new lb8(nw4Var);
        } else {
            lb8Var = lb8Var2;
        }
        gd8 gd8VarK = k(hd8Var, i);
        if (str == null) {
            str = "";
        }
        return new tb8(str, new db8(za8Var), null, new hb8(fb8Var), gd8VarK != null ? gd8VarK : gd8.J, lb8Var);
    }

    public static gd8 j(ja8 ja8Var, int i) {
        h5c h5cVar;
        byte[] bArrB;
        if (ja8Var == null) {
            return gd8.J;
        }
        ed8 ed8Var = new ed8();
        ed8Var.f = ja8Var.c;
        ed8Var.g = ja8Var.o;
        ed8Var.m = ja8Var.Y;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                h5cVar = new h5c(i, -1.0f);
                break;
            default:
                h5cVar = null;
                break;
        }
        ed8Var.i = q(h5cVar);
        Bitmap bitmap = ja8Var.X;
        if (bitmap != null) {
            try {
                bArrB = b(bitmap);
            } catch (IOException e) {
                z04.d0("Failed to convert iconBitmap to artworkData", e);
                bArrB = null;
            }
            ed8Var.f(bArrB, 3);
        }
        Bundle bundle = ja8Var.Z;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)) {
            ed8Var.p = Integer.valueOf(f(bundle2.getLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)));
            bundle2.remove(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE);
        }
        ed8Var.q = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            ed8Var.G = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        CharSequence charSequence = ja8Var.b;
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            ed8Var.a = charSequence;
        } else {
            ed8Var.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            ed8Var.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            ed8Var.H = bundle2;
        }
        ed8Var.r = Boolean.TRUE;
        return new gd8(ed8Var);
    }

    public static gd8 k(hd8 hd8Var, int i) {
        h5c h5cVarA;
        h5c h5cVarA2;
        h5c h5cVar;
        String string;
        if (hd8Var == null) {
            return gd8.J;
        }
        ed8 ed8Var = new ed8();
        Bundle bundle = hd8Var.a;
        CharSequence charSequence = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_TITLE);
        CharSequence charSequence2 = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        ed8Var.a = charSequence != null ? charSequence : charSequence2;
        Bitmap bitmap = null;
        if (charSequence == null) {
            charSequence2 = null;
        }
        ed8Var.e = charSequence2;
        ed8Var.f = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE);
        ed8Var.g = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        ed8Var.b = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_ARTIST);
        ed8Var.c = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_ALBUM);
        ed8Var.d = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST);
        try {
            h5cVarA = h5c.a(bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_RATING));
        } catch (Exception unused) {
            h5cVarA = null;
        }
        ed8Var.j = q(h5cVarA);
        if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            long jA = hd8Var.a(MediaMetadataCompat.METADATA_KEY_DURATION);
            if (jA >= 0) {
                ed8Var.i(Long.valueOf(jA));
            }
        }
        try {
            h5cVarA2 = h5c.a(bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_USER_RATING));
        } catch (Exception unused2) {
            h5cVarA2 = null;
        }
        e5c e5cVarQ = q(h5cVarA2);
        if (e5cVarQ != null) {
            ed8Var.i = e5cVarQ;
        } else {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    h5cVar = new h5c(i, -1.0f);
                    break;
                default:
                    h5cVar = null;
                    break;
            }
            ed8Var.i = q(h5cVar);
        }
        if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {
            ed8Var.s = Integer.valueOf((int) hd8Var.a(MediaMetadataCompat.METADATA_KEY_YEAR));
        }
        String[] strArr = {MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI};
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < 2) {
                String str = strArr[i3];
                if (bundle.containsKey(str)) {
                    CharSequence charSequence3 = bundle.getCharSequence(str);
                    if (charSequence3 != null) {
                        string = charSequence3.toString();
                    }
                } else {
                    i3++;
                }
            }
        }
        string = null;
        if (string != null) {
            ed8Var.m = Uri.parse(string);
        }
        String[] strArr2 = {MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_ALBUM_ART};
        while (true) {
            if (i2 < 2) {
                String str2 = strArr2[i2];
                if (bundle.containsKey(str2)) {
                    try {
                        bitmap = (Bitmap) bundle.getParcelable(str2);
                    } catch (Exception unused3) {
                    }
                } else {
                    i2++;
                }
            }
        }
        if (bitmap != null) {
            try {
                ed8Var.f(b(bitmap), 3);
            } catch (IOException e) {
                z04.d0("Failed to convert artworkBitmap to artworkData", e);
            }
        }
        boolean zContainsKey = bundle.containsKey(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        ed8Var.q = Boolean.valueOf(zContainsKey);
        if (zContainsKey) {
            ed8Var.p = Integer.valueOf(f(hd8Var.a(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE)));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            ed8Var.G = Integer.valueOf((int) hd8Var.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        ed8Var.r = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        m5f it = a.iterator();
        while (it.hasNext()) {
            bundle2.remove((String) it.next());
        }
        if (!bundle2.isEmpty()) {
            ed8Var.H = bundle2;
        }
        return new gd8(ed8Var);
    }

    public static hd8 l(gd8 gd8Var, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        y8 y8Var = new y8(19);
        y8Var.C(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, str);
        CharSequence charSequence = gd8Var.a;
        if (charSequence != null) {
            y8Var.D(MediaMetadataCompat.METADATA_KEY_TITLE, charSequence);
        }
        CharSequence charSequence2 = gd8Var.e;
        if (charSequence2 != null) {
            y8Var.D(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, charSequence2);
        }
        CharSequence charSequence3 = gd8Var.f;
        if (charSequence3 != null) {
            y8Var.D(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, charSequence3);
        }
        CharSequence charSequence4 = gd8Var.g;
        if (charSequence4 != null) {
            y8Var.D(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, charSequence4);
        }
        CharSequence charSequence5 = gd8Var.b;
        if (charSequence5 != null) {
            y8Var.D(MediaMetadataCompat.METADATA_KEY_ARTIST, charSequence5);
        }
        CharSequence charSequence6 = gd8Var.c;
        if (charSequence6 != null) {
            y8Var.D(MediaMetadataCompat.METADATA_KEY_ALBUM, charSequence6);
        }
        CharSequence charSequence7 = gd8Var.d;
        if (charSequence7 != null) {
            y8Var.D(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, charSequence7);
        }
        if (gd8Var.t != null) {
            y8Var.A(r4.intValue(), MediaMetadataCompat.METADATA_KEY_YEAR);
        }
        if (uri != null) {
            y8Var.C(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, uri.toString());
        }
        Uri uri2 = gd8Var.m;
        if (uri2 != null) {
            y8Var.C(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, uri2.toString());
            y8Var.C(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, uri2.toString());
        }
        if (bitmap != null) {
            y8Var.z(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap);
            y8Var.z(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        }
        Integer num = gd8Var.p;
        if (num != null && num.intValue() != -1) {
            y8Var.A(e(num.intValue()), MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        }
        if (j == -9223372036854775807L && (l = gd8Var.h) != null) {
            j = l.longValue();
        }
        if (j != -9223372036854775807L) {
            y8Var.A(j, MediaMetadataCompat.METADATA_KEY_DURATION);
        }
        h5c h5cVarR = r(gd8Var.i);
        if (h5cVarR != null) {
            y8Var.B(MediaMetadataCompat.METADATA_KEY_USER_RATING, h5cVarR);
        }
        h5c h5cVarR2 = r(gd8Var.j);
        if (h5cVarR2 != null) {
            y8Var.B(MediaMetadataCompat.METADATA_KEY_RATING, h5cVarR2);
        }
        if (gd8Var.H != null) {
            y8Var.A(r4.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        Bundle bundle = gd8Var.I;
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    y8Var.D(str2, (CharSequence) obj);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    y8Var.A(((Number) obj).longValue(), str2);
                }
            }
        }
        return new hd8((Bundle) y8Var.a);
    }

    public static PlaybackException m(i3b i3bVar) {
        if (i3bVar == null || i3bVar.a != 7) {
            return null;
        }
        CharSequence charSequence = i3bVar.Z;
        String string = charSequence != null ? charSequence.toString() : null;
        int iT = t(i3bVar.Y);
        if (iT == -5) {
            iT = 2000;
        } else if (iT == -1) {
            iT = 1000;
        }
        int i = iT;
        Bundle bundle = i3bVar.v0;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new PlaybackException(string, null, i, bundle, SystemClock.elapsedRealtime());
    }

    public static int n(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                z04.c0("Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    public static int o(x4b x4bVar) {
        if (x4bVar.X() != null) {
            return 7;
        }
        int playbackState = x4bVar.getPlaybackState();
        boolean zC0 = oaf.c0(x4bVar, true);
        if (playbackState == 1) {
            return 0;
        }
        if (playbackState == 2) {
            return zC0 ? 2 : 6;
        }
        if (playbackState == 3) {
            return zC0 ? 2 : 3;
        }
        if (playbackState == 4) {
            return 1;
        }
        throw new IllegalArgumentException(zr6.h(playbackState, "Unrecognized State: "));
    }

    public static long p(int i) {
        if (i == -1) {
            return -1L;
        }
        return i;
    }

    public static e5c q(h5c h5cVar) {
        if (h5cVar == null) {
            return null;
        }
        boolean z = false;
        float f = h5cVar.b;
        int i = h5cVar.a;
        switch (i) {
            case 1:
                if (!h5cVar.c()) {
                    break;
                } else {
                    if (i == 1) {
                        z = f == 1.0f;
                    }
                    break;
                }
            case 2:
                if (!h5cVar.c()) {
                    break;
                } else {
                    if (i == 2) {
                        z = f == 1.0f;
                    }
                    break;
                }
            case 3:
                if (!h5cVar.c()) {
                    break;
                } else {
                    break;
                }
            case 4:
                if (!h5cVar.c()) {
                    break;
                } else {
                    break;
                }
            case 5:
                if (!h5cVar.c()) {
                    break;
                } else {
                    break;
                }
            case 6:
                if (!h5cVar.c()) {
                    break;
                } else {
                    if (i != 6 || !h5cVar.c()) {
                        f = -1.0f;
                    }
                    break;
                }
                break;
        }
        return null;
    }

    public static h5c r(e5c e5cVar) {
        if (e5cVar == null) {
            return null;
        }
        int iX = x(e5cVar);
        if (!e5cVar.b()) {
            switch (iX) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return new h5c(iX, -1.0f);
                default:
                    return null;
            }
        }
        switch (iX) {
            case 1:
                return new h5c(1, ((pj6) e5cVar).c ? 1.0f : 0.0f);
            case 2:
                return new h5c(2, ((lte) e5cVar).c ? 1.0f : 0.0f);
            case 3:
            case 4:
            case 5:
                return h5c.d(iX, ((ayd) e5cVar).c);
            case 6:
                float f = ((ysa) e5cVar).b;
                if (f < 0.0f || f > 100.0f) {
                    return null;
                }
                return new h5c(6, f);
            default:
                return null;
        }
    }

    public static int s(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                z04.c0("Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    public static int t(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean u(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        throw new IllegalArgumentException(zr6.h(i, "Unrecognized ShuffleMode: "));
    }

    public static void v(bm7 bm7Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                try {
                    bm7Var.get(j, TimeUnit.MILLISECONDS);
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                } catch (InterruptedException unused) {
                    z = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
                        throw new TimeoutException();
                    }
                    j = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS - jElapsedRealtime2;
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static int w(h30 h30Var) {
        int i = 1;
        int i2 = j30.b;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setContentType(h30Var.a);
        builder.setFlags(h30Var.b);
        builder.setUsage(h30Var.c);
        AudioAttributes audioAttributesBuild = builder.build();
        audioAttributesBuild.getClass();
        int flags = audioAttributesBuild.getFlags();
        int usage = audioAttributesBuild.getUsage();
        if ((flags & 1) != 1) {
            if ((flags & 4) != 4) {
                switch (usage) {
                    case 0:
                    case 1:
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    case 16:
                    default:
                        i = 3;
                        break;
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 8;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i = 5;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 11:
                        i = 10;
                        break;
                    case 13:
                        break;
                }
            } else {
                i = 6;
            }
        } else {
            i = 7;
        }
        if (i == Integer.MIN_VALUE) {
            return 3;
        }
        return i;
    }

    public static int x(e5c e5cVar) {
        if (e5cVar instanceof pj6) {
            return 1;
        }
        if (e5cVar instanceof lte) {
            return 2;
        }
        if (!(e5cVar instanceof ayd)) {
            return e5cVar instanceof ysa ? 6 : 0;
        }
        int i = ((ayd) e5cVar).b;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static boolean y(long j, long j2) {
        return (j & j2) != 0;
    }
}
