package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class wa8 implements ru0, w56, hi8, rj8, pj3, qj8 {
    public final /* synthetic */ int a;

    public /* synthetic */ wa8(int i) {
        this.a = i;
    }

    @Override // defpackage.hi8
    public void a(nh8 nh8Var, int i) {
        switch (this.a) {
            case 7:
                nh8Var.getClass();
                break;
            case 8:
                nh8Var.getClass();
                break;
            default:
                nh8Var.b(i);
                break;
        }
    }

    @Override // defpackage.pj3
    public void accept(Object obj) {
        x4b x4bVar = (x4b) obj;
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                x4bVar.pause();
                break;
            case 13:
                x4bVar.f0();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                x4bVar.D0();
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                x4bVar.L0();
                break;
            case 16:
            case 19:
            case 22:
            case 23:
            case 25:
            case 26:
            default:
                x4bVar.prepare();
                break;
            case LangUtils.HASH_SEED /* 17 */:
                x4bVar.V();
                break;
            case 18:
                x4bVar.D();
                break;
            case 20:
                x4bVar.K0();
                break;
            case 21:
                x4bVar.J0();
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                x4bVar.J();
                break;
            case 27:
                x4bVar.stop();
                break;
        }
    }

    @Override // defpackage.w56, defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 3:
                x8e x8eVar = (x8e) obj;
                x8eVar.getClass();
                Bundle bundle = new Bundle();
                int i = x8eVar.a;
                if (i != 0) {
                    bundle.putInt(x8e.o, i);
                }
                int i2 = x8eVar.b;
                if (i2 != 0) {
                    bundle.putInt(x8e.X, i2);
                }
                int i3 = x8eVar.c;
                if (i3 != 0) {
                    bundle.putInt(x8e.Y, i3);
                }
                return bundle;
            case 4:
                pb8 pb8Var = (pb8) obj;
                pb8Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(pb8.h, pb8Var.a);
                String str = pb8Var.b;
                if (str != null) {
                    bundle2.putString(pb8.i, str);
                }
                String str2 = pb8Var.c;
                if (str2 != null) {
                    bundle2.putString(pb8.j, str2);
                }
                int i4 = pb8Var.d;
                if (i4 != 0) {
                    bundle2.putInt(pb8.k, i4);
                }
                int i5 = pb8Var.e;
                if (i5 != 0) {
                    bundle2.putInt(pb8.l, i5);
                }
                String str3 = pb8Var.f;
                if (str3 != null) {
                    bundle2.putString(pb8.m, str3);
                }
                String str4 = pb8Var.g;
                if (str4 != null) {
                    bundle2.putString(pb8.n, str4);
                }
                return bundle2;
            default:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(pb8.h);
                uri.getClass();
                String string = bundle3.getString(pb8.i);
                String string2 = bundle3.getString(pb8.j);
                int i6 = bundle3.getInt(pb8.k, 0);
                int i7 = bundle3.getInt(pb8.l, 0);
                String string3 = bundle3.getString(pb8.m);
                String string4 = bundle3.getString(pb8.n);
                ob8 ob8Var = new ob8();
                ob8Var.a = uri;
                ob8Var.b = ia9.l(string);
                ob8Var.c = string2;
                ob8Var.d = i6;
                ob8Var.e = i7;
                ob8Var.f = string3;
                ob8Var.g = string4;
                return new pb8(ob8Var);
        }
    }

    @Override // defpackage.qj8
    public void b(x4b x4bVar, oh8 oh8Var, List list) {
        switch (this.a) {
            case 23:
                x4bVar.w0(list);
                break;
            default:
                x4bVar.w0(list);
                break;
        }
    }

    @Override // defpackage.ru0
    public su0 g(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        switch (this.a) {
            case 0:
                String string = bundle.getString(Integer.toString(0, 36), "");
                string.getClass();
                Bundle bundle4 = bundle.getBundle(Integer.toString(1, 36));
                gb8 gb8Var = bundle4 == null ? gb8.Y : new gb8(bundle4.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle4.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle4.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle4.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle4.getFloat(Integer.toString(4, 36), -3.4028235E38f));
                Bundle bundle5 = bundle.getBundle(Integer.toString(2, 36));
                fd8 fd8Var = bundle5 == null ? fd8.S0 : (fd8) fd8.T0.g(bundle5);
                Bundle bundle6 = bundle.getBundle(Integer.toString(3, 36));
                return new rb8(string, bundle6 == null ? cb8.Z : (cb8) ab8.Y.g(bundle6), null, gb8Var, fd8Var);
            case 1:
                za8 za8Var = new za8();
                long j = bundle.getLong(Integer.toString(0, 36), 0L);
                boolean z = true;
                np8.d(j >= 0);
                za8Var.a = j;
                long j2 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
                if (j2 != Long.MIN_VALUE && j2 < 0) {
                    z = false;
                }
                np8.d(z);
                za8Var.b = j2;
                za8Var.c = bundle.getBoolean(Integer.toString(2, 36), false);
                za8Var.d = bundle.getBoolean(Integer.toString(3, 36), false);
                za8Var.e = bundle.getBoolean(Integer.toString(4, 36), false);
                return new cb8(za8Var);
            case 2:
                return new gb8(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
            default:
                dd8 dd8Var = new dd8();
                dd8Var.a = bundle.getCharSequence(Integer.toString(0, 36));
                dd8Var.b = bundle.getCharSequence(Integer.toString(1, 36));
                dd8Var.c = bundle.getCharSequence(Integer.toString(2, 36));
                dd8Var.d = bundle.getCharSequence(Integer.toString(3, 36));
                dd8Var.e = bundle.getCharSequence(Integer.toString(4, 36));
                dd8Var.f = bundle.getCharSequence(Integer.toString(5, 36));
                dd8Var.g = bundle.getCharSequence(Integer.toString(6, 36));
                dd8Var.h = (Uri) bundle.getParcelable(Integer.toString(7, 36));
                byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
                Integer numValueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
                dd8Var.k = byteArray != null ? (byte[]) byteArray.clone() : null;
                dd8Var.l = numValueOf;
                dd8Var.m = (Uri) bundle.getParcelable(Integer.toString(11, 36));
                dd8Var.x = bundle.getCharSequence(Integer.toString(22, 36));
                dd8Var.y = bundle.getCharSequence(Integer.toString(23, 36));
                dd8Var.z = bundle.getCharSequence(Integer.toString(24, 36));
                dd8Var.C = bundle.getCharSequence(Integer.toString(27, 36));
                dd8Var.D = bundle.getCharSequence(Integer.toString(28, 36));
                dd8Var.E = bundle.getCharSequence(Integer.toString(30, 36));
                dd8Var.F = bundle.getBundle(Integer.toString(1000, 36));
                boolean zContainsKey = bundle.containsKey(Integer.toString(8, 36));
                p4c p4cVar = d5c.a;
                if (zContainsKey && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
                    dd8Var.i = (d5c) p4cVar.g(bundle3);
                }
                if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
                    dd8Var.j = (d5c) p4cVar.g(bundle2);
                }
                if (bundle.containsKey(Integer.toString(12, 36))) {
                    dd8Var.n = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
                }
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    dd8Var.o = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
                }
                if (bundle.containsKey(Integer.toString(14, 36))) {
                    dd8Var.p = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
                }
                if (bundle.containsKey(Integer.toString(15, 36))) {
                    dd8Var.q = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
                }
                if (bundle.containsKey(Integer.toString(16, 36))) {
                    dd8Var.r = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
                }
                if (bundle.containsKey(Integer.toString(17, 36))) {
                    dd8Var.s = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
                }
                if (bundle.containsKey(Integer.toString(18, 36))) {
                    dd8Var.t = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
                }
                if (bundle.containsKey(Integer.toString(19, 36))) {
                    dd8Var.u = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
                }
                if (bundle.containsKey(Integer.toString(20, 36))) {
                    dd8Var.v = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
                }
                if (bundle.containsKey(Integer.toString(21, 36))) {
                    dd8Var.w = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
                }
                if (bundle.containsKey(Integer.toString(25, 36))) {
                    dd8Var.A = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
                }
                if (bundle.containsKey(Integer.toString(26, 36))) {
                    dd8Var.B = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
                }
                return new fd8(dd8Var);
        }
    }

    @Override // defpackage.rj8
    public Object k(ii8 ii8Var, oh8 oh8Var, int i) {
        switch (this.a) {
            case 10:
                au1.r(ii8Var);
                throw null;
            case 11:
                au1.r(ii8Var);
                throw null;
            case 16:
                return ii8Var.m(oh8Var);
            case 19:
                au1.r(ii8Var);
                throw null;
            case 22:
                ii8Var.s(oh8Var);
                ii8Var.e.getClass();
                return fm9.F(new sad(-6));
            case 26:
                au1.r(ii8Var);
                throw null;
            default:
                au1.r(ii8Var);
                throw null;
        }
    }

    public /* synthetic */ wa8(Object obj, int i, Object obj2) {
        this.a = i;
    }
}
