package defpackage;

import android.os.Bundle;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.ArrayList;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class hme implements qj3, b66, mpe, ru0, w56, mm7, cc3 {
    public final /* synthetic */ int a;
    public static final hme b = new hme(24);
    public static final hme c = new hme(25);
    public static final hme o = new hme(26);
    public static final hme X = new hme(27);
    public static final hme Y = new hme(28);

    public /* synthetic */ hme(int i) {
        this.a = i;
    }

    public void a(v1f v1fVar, w1f w1fVar, boolean z) {
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                v1fVar.d(w1fVar);
                break;
            case 25:
                v1fVar.e(w1fVar);
                break;
            case 26:
                v1fVar.g(w1fVar);
                break;
            case 27:
                v1fVar.b();
                break;
            default:
                v1fVar.f();
                break;
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                hm9.k("ime", "retryWhenTamHttpError: connected");
                break;
            case 3:
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0387  */
    @Override // defpackage.b66
    /* renamed from: apply */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo131apply(java.lang.Object r52) {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hme.mo131apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mm7
    public void d(Object obj, tm5 tm5Var) {
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        return TransportRegistrar.lambda$getComponents$0(bg4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ru0
    public su0 g(Bundle bundle) {
        qze qzeVar = null;
        switch (this.a) {
            case 8:
                np8.d(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new kte(bundle.getBoolean(Integer.toString(2, 36), false)) : new kte();
            case 9:
            case 10:
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case 16:
            default:
                Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
                if (bundle2 != null) {
                    ig5 ig5Var = oy5.S0;
                    ArrayList parcelableArrayList = bundle2.getParcelableArrayList(Integer.toString(0, 36));
                    ls5 ls5Var = zw6.b;
                    qzeVar = new qze(bundle2.getString(Integer.toString(1, 36), ""), (oy5[]) tu0.i(ig5Var, parcelableArrayList, ffc.X).toArray(new oy5[0]));
                }
                qzeVar.getClass();
                int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
                int i = qzeVar.a;
                int[] iArr = new int[i];
                if (intArray == null) {
                    intArray = iArr;
                }
                int i2 = bundle.getInt(Integer.toString(2, 36), -1);
                boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
                boolean[] zArr = new boolean[i];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new q0f(qzeVar, intArray, i2, booleanArray);
            case 11:
                int i3 = bundle.getInt(Integer.toString(0, 36), 0);
                long j = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
                long j2 = bundle.getLong(Integer.toString(2, 36), 0L);
                boolean z = bundle.getBoolean(Integer.toString(3, 36));
                Bundle bundle3 = bundle.getBundle(Integer.toString(4, 36));
                r8 r8Var = bundle3 != null ? (r8) r8.s0.g(bundle3) : r8.Y;
                gue gueVar = new gue();
                gueVar.h(null, null, i3, j, j2, r8Var, z);
                return gueVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Bundle bundle4 = bundle.getBundle(Integer.toString(1, 36));
                rb8 rb8Var = bundle4 != null ? (rb8) rb8.Y.g(bundle4) : null;
                long j3 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
                long j4 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
                long j5 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
                boolean z2 = bundle.getBoolean(Integer.toString(5, 36), false);
                boolean z3 = bundle.getBoolean(Integer.toString(6, 36), false);
                Bundle bundle5 = bundle.getBundle(Integer.toString(7, 36));
                gb8 gb8Var = bundle5 != null ? new gb8(bundle5.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle5.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle5.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle5.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle5.getFloat(Integer.toString(4, 36), -3.4028235E38f)) : null;
                boolean z4 = bundle.getBoolean(Integer.toString(8, 36), false);
                long j6 = bundle.getLong(Integer.toString(9, 36), 0L);
                long j7 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
                int i4 = bundle.getInt(Integer.toString(11, 36), 0);
                int i5 = bundle.getInt(Integer.toString(12, 36), 0);
                long j8 = bundle.getLong(Integer.toString(13, 36), 0L);
                jue jueVar = new jue();
                jueVar.b(jue.D0, rb8Var, null, j3, j4, j5, z2, z3, gb8Var, j6, j7, i4, i5, j8);
                jueVar.w0 = z4;
                return jueVar;
            case 13:
                ig5 ig5Var2 = oy5.S0;
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                ls5 ls5Var2 = zw6.b;
                return new qze(bundle.getString(Integer.toString(1, 36), ""), (oy5[]) ((qw6) tu0.i(ig5Var2, parcelableArrayList2, ffc.X)).toArray(new oy5[0]));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                hme hmeVar = qze.X;
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                ls5 ls5Var3 = zw6.b;
                return new sze((qze[]) ((qw6) tu0.i(hmeVar, parcelableArrayList3, ffc.X)).toArray(new qze[0]));
            case LangUtils.HASH_SEED /* 17 */:
                hme hmeVar2 = d0f.c;
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                ls5 ls5Var4 = zw6.b;
                List listI = tu0.i(hmeVar2, parcelableArrayList4, ffc.X);
                jn jnVar = new jn(4);
                for (int i6 = 0; i6 < ((ffc) listI).o; i6++) {
                    d0f d0fVar = (d0f) ((ffc) listI).get(i6);
                    jnVar.I(d0fVar.a, d0fVar);
                }
                return new e0f((kfc) jnVar.j());
            case 18:
                Bundle bundle6 = bundle.getBundle(Integer.toString(0, 36));
                bundle6.getClass();
                ig5 ig5Var3 = oy5.S0;
                ArrayList parcelableArrayList5 = bundle6.getParcelableArrayList(Integer.toString(0, 36));
                ls5 ls5Var5 = zw6.b;
                qze qzeVar2 = new qze(bundle6.getString(Integer.toString(1, 36), ""), (oy5[]) ((qw6) tu0.i(ig5Var3, parcelableArrayList5, ffc.X)).toArray(new oy5[0]));
                int[] intArray2 = bundle.getIntArray(Integer.toString(1, 36));
                return intArray2 == null ? new d0f(qzeVar2) : new d0f(qzeVar2, s5c.i(intArray2));
        }
    }
}
