package ru.ok.tamtam.android.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.hm9;
import defpackage.i9d;
import defpackage.jyc;
import defpackage.k56;
import defpackage.k9d;
import defpackage.khe;
import defpackage.np8;
import defpackage.nz4;
import kotlin.Metadata;
import ru.ok.tamtam.android.services.NotificationTamService;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/tamtam/android/services/NotificationTamService;", "Landroid/app/Service;", "<init>", "()V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class NotificationTamService extends Service {
    public static final /* synthetic */ int u0 = 0;
    public final khe X;
    public final khe Y;
    public final khe Z;
    public jyc a;
    public final khe b;
    public final khe c;
    public final khe o;
    public final khe s0;
    public final khe t0;

    public NotificationTamService() {
        final int i = 0;
        this.b = new khe(new k56(this) { // from class: vv9
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        jyc jycVar = this.b.a;
                        if (jycVar == null) {
                            jycVar = null;
                        }
                        return jycVar.q();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        jyc jycVar2 = notificationTamService.a;
                        if (jycVar2 == null) {
                            jycVar2 = null;
                        }
                        nx3 nx3VarB = ((w9a) jycVar2.s()).b();
                        jyc jycVar3 = notificationTamService.a;
                        return j1e.a(nx3VarB.plus(new qj((jycVar3 != null ? jycVar3 : null).i())).plus(f46.a()));
                    case 2:
                        jyc jycVar4 = this.b.a;
                        if (jycVar4 == null) {
                            jycVar4 = null;
                        }
                        return (cea) jycVar4.l().f.getValue();
                    case 3:
                        jyc jycVar5 = this.b.a;
                        if (jycVar5 == null) {
                            jycVar5 = null;
                        }
                        return jycVar5.f();
                    case 4:
                        jyc jycVar6 = this.b.a;
                        if (jycVar6 == null) {
                            jycVar6 = null;
                        }
                        return ((k24) ((c34) jycVar6.getAccessor().c(c34.class))).b;
                    case 5:
                        jyc jycVar7 = this.b.a;
                        if (jycVar7 == null) {
                            jycVar7 = null;
                        }
                        return (p7c) jycVar7.getAccessor().c(p7c.class);
                    case 6:
                        jyc jycVar8 = this.b.a;
                        if (jycVar8 == null) {
                            jycVar8 = null;
                        }
                        return (qx9) jycVar8.l().h.getValue();
                    default:
                        jyc jycVar9 = this.b.a;
                        if (jycVar9 == null) {
                            jycVar9 = null;
                        }
                        return (rw9) jycVar9.l().g.getValue();
                }
            }
        });
        final int i2 = 1;
        this.c = new khe(new k56(this) { // from class: vv9
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        jyc jycVar = this.b.a;
                        if (jycVar == null) {
                            jycVar = null;
                        }
                        return jycVar.q();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        jyc jycVar2 = notificationTamService.a;
                        if (jycVar2 == null) {
                            jycVar2 = null;
                        }
                        nx3 nx3VarB = ((w9a) jycVar2.s()).b();
                        jyc jycVar3 = notificationTamService.a;
                        return j1e.a(nx3VarB.plus(new qj((jycVar3 != null ? jycVar3 : null).i())).plus(f46.a()));
                    case 2:
                        jyc jycVar4 = this.b.a;
                        if (jycVar4 == null) {
                            jycVar4 = null;
                        }
                        return (cea) jycVar4.l().f.getValue();
                    case 3:
                        jyc jycVar5 = this.b.a;
                        if (jycVar5 == null) {
                            jycVar5 = null;
                        }
                        return jycVar5.f();
                    case 4:
                        jyc jycVar6 = this.b.a;
                        if (jycVar6 == null) {
                            jycVar6 = null;
                        }
                        return ((k24) ((c34) jycVar6.getAccessor().c(c34.class))).b;
                    case 5:
                        jyc jycVar7 = this.b.a;
                        if (jycVar7 == null) {
                            jycVar7 = null;
                        }
                        return (p7c) jycVar7.getAccessor().c(p7c.class);
                    case 6:
                        jyc jycVar8 = this.b.a;
                        if (jycVar8 == null) {
                            jycVar8 = null;
                        }
                        return (qx9) jycVar8.l().h.getValue();
                    default:
                        jyc jycVar9 = this.b.a;
                        if (jycVar9 == null) {
                            jycVar9 = null;
                        }
                        return (rw9) jycVar9.l().g.getValue();
                }
            }
        });
        final int i3 = 2;
        this.o = new khe(new k56(this) { // from class: vv9
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        jyc jycVar = this.b.a;
                        if (jycVar == null) {
                            jycVar = null;
                        }
                        return jycVar.q();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        jyc jycVar2 = notificationTamService.a;
                        if (jycVar2 == null) {
                            jycVar2 = null;
                        }
                        nx3 nx3VarB = ((w9a) jycVar2.s()).b();
                        jyc jycVar3 = notificationTamService.a;
                        return j1e.a(nx3VarB.plus(new qj((jycVar3 != null ? jycVar3 : null).i())).plus(f46.a()));
                    case 2:
                        jyc jycVar4 = this.b.a;
                        if (jycVar4 == null) {
                            jycVar4 = null;
                        }
                        return (cea) jycVar4.l().f.getValue();
                    case 3:
                        jyc jycVar5 = this.b.a;
                        if (jycVar5 == null) {
                            jycVar5 = null;
                        }
                        return jycVar5.f();
                    case 4:
                        jyc jycVar6 = this.b.a;
                        if (jycVar6 == null) {
                            jycVar6 = null;
                        }
                        return ((k24) ((c34) jycVar6.getAccessor().c(c34.class))).b;
                    case 5:
                        jyc jycVar7 = this.b.a;
                        if (jycVar7 == null) {
                            jycVar7 = null;
                        }
                        return (p7c) jycVar7.getAccessor().c(p7c.class);
                    case 6:
                        jyc jycVar8 = this.b.a;
                        if (jycVar8 == null) {
                            jycVar8 = null;
                        }
                        return (qx9) jycVar8.l().h.getValue();
                    default:
                        jyc jycVar9 = this.b.a;
                        if (jycVar9 == null) {
                            jycVar9 = null;
                        }
                        return (rw9) jycVar9.l().g.getValue();
                }
            }
        });
        final int i4 = 3;
        this.X = new khe(new k56(this) { // from class: vv9
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        jyc jycVar = this.b.a;
                        if (jycVar == null) {
                            jycVar = null;
                        }
                        return jycVar.q();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        jyc jycVar2 = notificationTamService.a;
                        if (jycVar2 == null) {
                            jycVar2 = null;
                        }
                        nx3 nx3VarB = ((w9a) jycVar2.s()).b();
                        jyc jycVar3 = notificationTamService.a;
                        return j1e.a(nx3VarB.plus(new qj((jycVar3 != null ? jycVar3 : null).i())).plus(f46.a()));
                    case 2:
                        jyc jycVar4 = this.b.a;
                        if (jycVar4 == null) {
                            jycVar4 = null;
                        }
                        return (cea) jycVar4.l().f.getValue();
                    case 3:
                        jyc jycVar5 = this.b.a;
                        if (jycVar5 == null) {
                            jycVar5 = null;
                        }
                        return jycVar5.f();
                    case 4:
                        jyc jycVar6 = this.b.a;
                        if (jycVar6 == null) {
                            jycVar6 = null;
                        }
                        return ((k24) ((c34) jycVar6.getAccessor().c(c34.class))).b;
                    case 5:
                        jyc jycVar7 = this.b.a;
                        if (jycVar7 == null) {
                            jycVar7 = null;
                        }
                        return (p7c) jycVar7.getAccessor().c(p7c.class);
                    case 6:
                        jyc jycVar8 = this.b.a;
                        if (jycVar8 == null) {
                            jycVar8 = null;
                        }
                        return (qx9) jycVar8.l().h.getValue();
                    default:
                        jyc jycVar9 = this.b.a;
                        if (jycVar9 == null) {
                            jycVar9 = null;
                        }
                        return (rw9) jycVar9.l().g.getValue();
                }
            }
        });
        final int i5 = 4;
        this.Y = new khe(new k56(this) { // from class: vv9
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        jyc jycVar = this.b.a;
                        if (jycVar == null) {
                            jycVar = null;
                        }
                        return jycVar.q();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        jyc jycVar2 = notificationTamService.a;
                        if (jycVar2 == null) {
                            jycVar2 = null;
                        }
                        nx3 nx3VarB = ((w9a) jycVar2.s()).b();
                        jyc jycVar3 = notificationTamService.a;
                        return j1e.a(nx3VarB.plus(new qj((jycVar3 != null ? jycVar3 : null).i())).plus(f46.a()));
                    case 2:
                        jyc jycVar4 = this.b.a;
                        if (jycVar4 == null) {
                            jycVar4 = null;
                        }
                        return (cea) jycVar4.l().f.getValue();
                    case 3:
                        jyc jycVar5 = this.b.a;
                        if (jycVar5 == null) {
                            jycVar5 = null;
                        }
                        return jycVar5.f();
                    case 4:
                        jyc jycVar6 = this.b.a;
                        if (jycVar6 == null) {
                            jycVar6 = null;
                        }
                        return ((k24) ((c34) jycVar6.getAccessor().c(c34.class))).b;
                    case 5:
                        jyc jycVar7 = this.b.a;
                        if (jycVar7 == null) {
                            jycVar7 = null;
                        }
                        return (p7c) jycVar7.getAccessor().c(p7c.class);
                    case 6:
                        jyc jycVar8 = this.b.a;
                        if (jycVar8 == null) {
                            jycVar8 = null;
                        }
                        return (qx9) jycVar8.l().h.getValue();
                    default:
                        jyc jycVar9 = this.b.a;
                        if (jycVar9 == null) {
                            jycVar9 = null;
                        }
                        return (rw9) jycVar9.l().g.getValue();
                }
            }
        });
        final int i6 = 5;
        this.Z = new khe(new k56(this) { // from class: vv9
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        jyc jycVar = this.b.a;
                        if (jycVar == null) {
                            jycVar = null;
                        }
                        return jycVar.q();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        jyc jycVar2 = notificationTamService.a;
                        if (jycVar2 == null) {
                            jycVar2 = null;
                        }
                        nx3 nx3VarB = ((w9a) jycVar2.s()).b();
                        jyc jycVar3 = notificationTamService.a;
                        return j1e.a(nx3VarB.plus(new qj((jycVar3 != null ? jycVar3 : null).i())).plus(f46.a()));
                    case 2:
                        jyc jycVar4 = this.b.a;
                        if (jycVar4 == null) {
                            jycVar4 = null;
                        }
                        return (cea) jycVar4.l().f.getValue();
                    case 3:
                        jyc jycVar5 = this.b.a;
                        if (jycVar5 == null) {
                            jycVar5 = null;
                        }
                        return jycVar5.f();
                    case 4:
                        jyc jycVar6 = this.b.a;
                        if (jycVar6 == null) {
                            jycVar6 = null;
                        }
                        return ((k24) ((c34) jycVar6.getAccessor().c(c34.class))).b;
                    case 5:
                        jyc jycVar7 = this.b.a;
                        if (jycVar7 == null) {
                            jycVar7 = null;
                        }
                        return (p7c) jycVar7.getAccessor().c(p7c.class);
                    case 6:
                        jyc jycVar8 = this.b.a;
                        if (jycVar8 == null) {
                            jycVar8 = null;
                        }
                        return (qx9) jycVar8.l().h.getValue();
                    default:
                        jyc jycVar9 = this.b.a;
                        if (jycVar9 == null) {
                            jycVar9 = null;
                        }
                        return (rw9) jycVar9.l().g.getValue();
                }
            }
        });
        final int i7 = 6;
        this.s0 = new khe(new k56(this) { // from class: vv9
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        jyc jycVar = this.b.a;
                        if (jycVar == null) {
                            jycVar = null;
                        }
                        return jycVar.q();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        jyc jycVar2 = notificationTamService.a;
                        if (jycVar2 == null) {
                            jycVar2 = null;
                        }
                        nx3 nx3VarB = ((w9a) jycVar2.s()).b();
                        jyc jycVar3 = notificationTamService.a;
                        return j1e.a(nx3VarB.plus(new qj((jycVar3 != null ? jycVar3 : null).i())).plus(f46.a()));
                    case 2:
                        jyc jycVar4 = this.b.a;
                        if (jycVar4 == null) {
                            jycVar4 = null;
                        }
                        return (cea) jycVar4.l().f.getValue();
                    case 3:
                        jyc jycVar5 = this.b.a;
                        if (jycVar5 == null) {
                            jycVar5 = null;
                        }
                        return jycVar5.f();
                    case 4:
                        jyc jycVar6 = this.b.a;
                        if (jycVar6 == null) {
                            jycVar6 = null;
                        }
                        return ((k24) ((c34) jycVar6.getAccessor().c(c34.class))).b;
                    case 5:
                        jyc jycVar7 = this.b.a;
                        if (jycVar7 == null) {
                            jycVar7 = null;
                        }
                        return (p7c) jycVar7.getAccessor().c(p7c.class);
                    case 6:
                        jyc jycVar8 = this.b.a;
                        if (jycVar8 == null) {
                            jycVar8 = null;
                        }
                        return (qx9) jycVar8.l().h.getValue();
                    default:
                        jyc jycVar9 = this.b.a;
                        if (jycVar9 == null) {
                            jycVar9 = null;
                        }
                        return (rw9) jycVar9.l().g.getValue();
                }
            }
        });
        final int i8 = 7;
        this.t0 = new khe(new k56(this) { // from class: vv9
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        jyc jycVar = this.b.a;
                        if (jycVar == null) {
                            jycVar = null;
                        }
                        return jycVar.q();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        jyc jycVar2 = notificationTamService.a;
                        if (jycVar2 == null) {
                            jycVar2 = null;
                        }
                        nx3 nx3VarB = ((w9a) jycVar2.s()).b();
                        jyc jycVar3 = notificationTamService.a;
                        return j1e.a(nx3VarB.plus(new qj((jycVar3 != null ? jycVar3 : null).i())).plus(f46.a()));
                    case 2:
                        jyc jycVar4 = this.b.a;
                        if (jycVar4 == null) {
                            jycVar4 = null;
                        }
                        return (cea) jycVar4.l().f.getValue();
                    case 3:
                        jyc jycVar5 = this.b.a;
                        if (jycVar5 == null) {
                            jycVar5 = null;
                        }
                        return jycVar5.f();
                    case 4:
                        jyc jycVar6 = this.b.a;
                        if (jycVar6 == null) {
                            jycVar6 = null;
                        }
                        return ((k24) ((c34) jycVar6.getAccessor().c(c34.class))).b;
                    case 5:
                        jyc jycVar7 = this.b.a;
                        if (jycVar7 == null) {
                            jycVar7 = null;
                        }
                        return (p7c) jycVar7.getAccessor().c(p7c.class);
                    case 6:
                        jyc jycVar8 = this.b.a;
                        if (jycVar8 == null) {
                            jycVar8 = null;
                        }
                        return (qx9) jycVar8.l().h.getValue();
                    default:
                        jyc jycVar9 = this.b.a;
                        if (jycVar9 == null) {
                            jycVar9 = null;
                        }
                        return (rw9) jycVar9.l().g.getValue();
                }
            }
        });
    }

    public static final void a(long j, CharSequence charSequence, NotificationTamService notificationTamService, long j2) {
        if (j2 == 0) {
            hm9.q("ru.ok.tamtam.android.services.NotificationTamService", "directReply: failed to send message, no chat in cache for chatServerId=%d", Long.valueOf(j));
            return;
        }
        k9d k9dVar = new k9d(new i9d(j2, charSequence.toString(), true, nz4.a));
        jyc jycVar = notificationTamService.a;
        if (jycVar == null) {
            jycVar = null;
        }
        jycVar.u().a(k9dVar);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.a = np8.D(getApplicationContext());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        hm9.n("ru.ok.tamtam.android.services.NotificationTamService", "onDestroy");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.services.NotificationTamService.onStartCommand(android.content.Intent, int, int):int");
    }
}
