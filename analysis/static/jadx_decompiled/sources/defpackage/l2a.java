package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l2a implements ry, sy, y2a {
    public static final byte[] X = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] Y = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object o;

    public l2a(Context context) {
        this.a = 8;
        this.c = 0;
        this.o = context;
    }

    public static void f(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = i2;
        z04.j(j2, "out of range: %s", (j2 >> 8) == 0);
        byteBuffer.put((byte) j2);
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        int i = x6gVar.a.f(7).b;
        int i2 = this.b;
        View view2 = (View) this.o;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return x6gVar;
    }

    @Override // defpackage.ry, defpackage.sy
    public int a() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.ry, defpackage.sy
    public int b() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.ry, defpackage.sy
    public int c() {
        switch (this.a) {
            case 2:
                int i = this.b;
                return i == -1 ? ((yaf) this.o).y() : i;
            default:
                int i2 = this.b;
                return i2 == -1 ? ((wpa) this.o).y() : i2;
        }
    }

    public void d(ata ataVar) {
        File file;
        int i = this.c + 1;
        this.c = i;
        if (i > this.b || (file = (File) this.o) == null) {
            return;
        }
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                m6d.y(parentFile);
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file, true)));
            try {
                rq9.l(dataOutputStream, ataVar);
                v3c.i(dataOutputStream, null);
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public void e(int i) {
        yi3 yi3VarG = ((dj3) this.o).g(this.c);
        switch (this.b) {
            case 1:
                yi3VarG.d.F = i;
                return;
            case 2:
                yi3VarG.d.G = i;
                return;
            case 3:
                yi3VarG.d.H = i;
                return;
            case 4:
                yi3VarG.d.I = i;
                return;
            case 5:
                yi3VarG.d.L = i;
                return;
            case 6:
                yi3VarG.d.K = i;
                return;
            case 7:
                yi3VarG.d.J = i;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public synchronized int g() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = ((Context) a9g.a((Context) this.o).b).getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    public synchronized int h() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.o;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) a9g.a(context).b).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
            this.c = 2;
            return 2;
        }
        this.c = 2;
        return 2;
    }

    public /* synthetic */ l2a(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.o = obj;
        this.c = i2;
    }

    public l2a(File file) {
        this.a = 1;
        this.o = file;
        kye kyeVar = kye.a;
        Object obj = kye.c().get(tfg.b);
        hta htaVar = obj instanceof hta ? (hta) obj : null;
        this.b = (htaVar == null ? new hta(new sh0(14, (byte) 0)) : htaVar).b;
    }

    public l2a(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.a = 5;
        this.o = new ArrayList();
        this.c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i3c.State);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == i3c.State_android_id) {
                this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == i3c.State_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new dj3().c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public l2a(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.o = new l2a[256];
                this.b = 0;
                this.c = 0;
                break;
        }
    }

    public l2a(int i, int i2) {
        this.a = 6;
        this.o = null;
        this.b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }

    public l2a(my myVar, oy5 oy5Var) {
        this.a = 2;
        yaf yafVar = myVar.c;
        this.o = yafVar;
        yafVar.H(12);
        int iY = yafVar.y();
        if ("audio/raw".equals(oy5Var.w0)) {
            int iV = maf.v(oy5Var.L0, oy5Var.J0);
            if (iY == 0 || iY % iV != 0) {
                iY = iV;
            }
        }
        this.b = iY == 0 ? -1 : iY;
        this.c = yafVar.y();
    }

    public l2a(ny nyVar, qy5 qy5Var) {
        this.a = 3;
        wpa wpaVar = nyVar.c;
        this.o = wpaVar;
        wpaVar.G(12);
        int iY = wpaVar.y();
        if ("audio/raw".equals(qy5Var.n)) {
            int iD = oaf.D(qy5Var.D, qy5Var.B);
            if (iY == 0 || iY % iD != 0) {
                z04.c0("Audio sample size mismatch. stsd sample size: " + iD + ", stsz sample size: " + iY);
                iY = iD;
            }
        }
        this.b = iY == 0 ? -1 : iY;
        this.c = wpaVar.y();
    }
}
