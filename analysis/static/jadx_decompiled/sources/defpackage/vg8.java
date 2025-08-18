package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vg8 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final List c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public vg8(ArrayList arrayList, boolean z) {
        this.a = 0;
        this.c = arrayList == null ? Collections.emptyList() : arrayList;
        this.b = z;
    }

    public static vg8 b(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList2.add(bundle2 != null ? new zf8(bundle2) : null);
            }
            arrayList = arrayList2;
        }
        return new vg8(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.b) {
            return captureCallback;
        }
        qt1 qt1Var = new qt1(2);
        List list = this.c;
        oq1 oq1Var = (oq1) qt1Var.b;
        list.add(oq1Var);
        oq1Var.b.d(new v05(this, qt1Var, oq1Var, 27), ju0.k());
        return new ju1(Arrays.asList(qt1Var, captureCallback));
    }

    public bm7 c() {
        List list = this.c;
        if (list.isEmpty()) {
            return dw6.c;
        }
        nl7 nl7VarJ = kq0.J(new ArrayList(list));
        mu1 mu1Var = new mu1(15);
        return kq0.w(kq0.K(nl7VarJ, new re6(15, mu1Var), ju0.k()));
    }

    public void d() {
        LinkedList linkedList = new LinkedList(this.c);
        while (!linkedList.isEmpty()) {
            bm7 bm7Var = (bm7) linkedList.poll();
            Objects.requireNonNull(bm7Var);
            bm7Var.cancel(true);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.c;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                    } else {
                        zf8 zf8Var = (zf8) list.get(i);
                        if (zf8Var != null && zf8Var.d()) {
                            i++;
                        }
                    }
                }
                return au1.j(sb, z, " }");
            default:
                return super.toString();
        }
    }

    public vg8(boolean z) {
        this.a = 1;
        this.c = Collections.synchronizedList(new ArrayList());
        this.b = z;
    }
}
