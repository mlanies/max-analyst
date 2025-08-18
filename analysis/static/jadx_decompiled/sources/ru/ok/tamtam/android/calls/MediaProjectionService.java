package ru.ok.tamtam.android.calls;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.bea;
import defpackage.bf8;
import defpackage.bu9;
import defpackage.df8;
import defpackage.dp;
import defpackage.ep;
import defpackage.hm9;
import defpackage.jpc;
import defpackage.k56;
import defpackage.khe;
import defpackage.lle;
import defpackage.ri4;
import kotlin.Metadata;
import ru.ok.tamtam.android.calls.MediaProjectionService;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/tamtam/android/calls/MediaProjectionService;", "Landroid/app/Service;", "<init>", "()V", "df8", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class MediaProjectionService extends Service {
    public static final /* synthetic */ int X = 0;
    public final khe a;
    public final khe b;
    public final df8 c = new df8();
    public final String o = MediaProjectionService.class.getName();

    public MediaProjectionService() {
        final int i = 0;
        this.a = new khe(new k56(this) { // from class: cf8
            public final /* synthetic */ MediaProjectionService b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                MediaProjectionService mediaProjectionService = this.b;
                switch (i) {
                    case 0:
                        int i2 = MediaProjectionService.X;
                        return np8.D(mediaProjectionService).h();
                    default:
                        int i3 = MediaProjectionService.X;
                        return np8.D(mediaProjectionService).l();
                }
            }
        });
        final int i2 = 1;
        this.b = new khe(new k56(this) { // from class: cf8
            public final /* synthetic */ MediaProjectionService b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                MediaProjectionService mediaProjectionService = this.b;
                switch (i2) {
                    case 0:
                        int i22 = MediaProjectionService.X;
                        return np8.D(mediaProjectionService).h();
                    default:
                        int i3 = MediaProjectionService.X;
                        return np8.D(mediaProjectionService).l();
                }
            }
        });
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.c;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        String str = this.o;
        hm9.n(str, "onCreate");
        ((ri4) this.a.getValue()).f(str);
        bf8 bf8Var = (bf8) ((ep) ((lle) this.b.getValue())).o.getValue();
        bu9 bu9VarH = ((bea) bf8Var.b.getValue()).h(bf8Var.a, true, true);
        dp dpVar = bf8Var.c;
        dpVar.getClass();
        bu9VarH.f = bu9.c(dpVar.a.getString(jpc.y2));
        startForeground(12, bu9VarH.b());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        String str = this.o;
        hm9.n(str, "onDestroy");
        ((ri4) this.a.getValue()).g(str);
    }
}
