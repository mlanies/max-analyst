package ru.ok.android.externcalls.sdk.video.internal;

import defpackage.c;
import defpackage.d;
import defpackage.jx1;
import defpackage.k56;
import defpackage.py0;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.video.CameraManager;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/CameraManagerImpl;", "Lru/ok/android/externcalls/sdk/video/CameraManager;", "Lpy0;", "call", "Lkotlin/Function0;", "", "isInited", "isPrepared", "<init>", "(Lpy0;Lk56;Lk56;)V", "Ljx1;", "cameraParams", "Le5f;", "switchCamera", "(Ljx1;)V", "Lpy0;", "Lk56;", "isCapturingFromFrontCamera", "()Z", "", "getNumberOfCameras", "()I", "numberOfCameras", "value", "isCameraEnabled", "setCameraEnabled", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CameraManagerImpl implements CameraManager {
    private final py0 call;
    private final k56 isInited;
    private final k56 isPrepared;

    public CameraManagerImpl(py0 py0Var, k56 k56Var, k56 k56Var2) {
        this.call = py0Var;
        this.isInited = k56Var;
        this.isPrepared = k56Var2;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public int getNumberOfCameras() {
        if (((Boolean) this.isInited.invoke()).booleanValue()) {
            return this.call.O0;
        }
        return 0;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public boolean isCameraEnabled() {
        return this.call.y1.f;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public boolean isCapturingFromFrontCamera() {
        return this.call.l1.c() == 1;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public void setCameraEnabled(boolean z) {
        if (((Boolean) this.isPrepared.invoke()).booleanValue()) {
            this.call.G(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public void switchCamera(jx1 cameraParams) {
        py0 py0Var = this.call;
        if (py0Var.i() && py0Var.n1.d) {
            py0Var.V0.log("OKRTCCall", "switchCamera");
            py0Var.v("rtc.switch_camera");
            d dVar = py0Var.l1;
            dVar.v0.log("SlmsSource", "switchCamera");
            dVar.c.a.execute(new c(dVar, 0, cameraParams));
        }
    }
}
