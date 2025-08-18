package ru.ok.android.externcalls.sdk.audio.internal;

import defpackage.e09;
import defpackage.m56;
import defpackage.py0;
import defpackage.rd7;
import defpackage.uq9;
import defpackage.vq9;
import defpackage.wq9;
import defpackage.yh0;
import kotlin.Metadata;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J}\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u00182\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/NoiseSuppressionManagerImpl;", "Lru/ok/android/externcalls/sdk/audio/NoiseSuppressionManager;", "Lpy0;", "call", "<init>", "(Lpy0;)V", "", "serversideBasic", "serversideAnn", "clientsidePlatform", "clientsideAnn", "Lorg/webrtc/PeerConnectionFactory$EnhancerKind;", "enhancerKind", "", "filePath", "", "inputSampleRate", "outputSampleRate", "fallbackTimeLimitMillis", "fallbackStutterCountMillis", "fallbackTimeframeMillis", "logTimings", "Ljava/lang/Runnable;", "onNoiseSuppressorDisabledDueToStutter", "Le5f;", "setNoiseSuppressorParams", "(ZZZZLorg/webrtc/PeerConnectionFactory$EnhancerKind;Ljava/lang/String;IIIIIZLjava/lang/Runnable;)V", "Lkotlin/Function1;", "Lvq9;", "Lwq9;", "paramFun", "setNoiseSuppressionParams", "(Lm56;)V", "Lpy0;", "getNsActiveState", "()Lwq9;", "nsActiveState", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NoiseSuppressionManagerImpl implements NoiseSuppressionManager {
    private final py0 call;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvq9;", "builder", "Lwq9;", "invoke", "(Lvq9;)Lwq9;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.NoiseSuppressionManagerImpl$setNoiseSuppressorParams$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements m56 {
        final /* synthetic */ boolean $clientsideAnn;
        final /* synthetic */ boolean $clientsidePlatform;
        final /* synthetic */ PeerConnectionFactory.EnhancerKind $enhancerKind;
        final /* synthetic */ int $fallbackStutterCountMillis;
        final /* synthetic */ int $fallbackTimeLimitMillis;
        final /* synthetic */ int $fallbackTimeframeMillis;
        final /* synthetic */ String $filePath;
        final /* synthetic */ int $inputSampleRate;
        final /* synthetic */ boolean $logTimings;
        final /* synthetic */ Runnable $onNoiseSuppressorDisabledDueToStutter;
        final /* synthetic */ int $outputSampleRate;
        final /* synthetic */ boolean $serversideAnn;
        final /* synthetic */ boolean $serversideBasic;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z5, Runnable runnable) {
            super(1);
            this.$serversideBasic = z;
            this.$serversideAnn = z2;
            this.$clientsidePlatform = z3;
            this.$clientsideAnn = z4;
            this.$enhancerKind = enhancerKind;
            this.$filePath = str;
            this.$inputSampleRate = i;
            this.$outputSampleRate = i2;
            this.$fallbackTimeLimitMillis = i3;
            this.$fallbackStutterCountMillis = i4;
            this.$fallbackTimeframeMillis = i5;
            this.$logTimings = z5;
            this.$onNoiseSuppressorDisabledDueToStutter = runnable;
        }

        @Override // defpackage.m56
        public final wq9 invoke(vq9 vq9Var) {
            boolean z;
            yh0 yh0Var;
            vq9Var.a = this.$serversideBasic;
            vq9Var.b = this.$serversideAnn;
            vq9Var.c = this.$clientsidePlatform;
            vq9Var.d = this.$clientsideAnn;
            PeerConnectionFactory.EnhancerKind enhancerKind = this.$enhancerKind;
            vq9Var.f = enhancerKind;
            int i = enhancerKind == null ? -1 : uq9.$EnumSwitchMapping$1[enhancerKind.ordinal()];
            int i2 = 1;
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    i2 = i != 3 ? 0 : 2;
                }
            }
            vq9Var.e = i2;
            vq9Var.g = this.$filePath;
            vq9Var.h = this.$inputSampleRate;
            vq9Var.i = this.$outputSampleRate;
            vq9Var.j = this.$fallbackTimeLimitMillis;
            vq9Var.k = this.$fallbackStutterCountMillis;
            vq9Var.l = this.$fallbackTimeframeMillis;
            vq9Var.m = this.$logTimings;
            Runnable runnable = this.$onNoiseSuppressorDisabledDueToStutter;
            if (runnable != null) {
                vq9Var.n = new e09(0, runnable, Runnable.class, "run", "run()V", 0, 20);
            }
            boolean z2 = vq9Var.a;
            boolean z3 = vq9Var.b;
            boolean z4 = vq9Var.c;
            boolean z5 = vq9Var.d;
            PeerConnectionFactory.EnhancerKind enhancerKind2 = vq9Var.f;
            String str = vq9Var.g;
            int i3 = vq9Var.h;
            int i4 = vq9Var.i;
            int i5 = vq9Var.j;
            int i6 = vq9Var.k;
            int i7 = vq9Var.l;
            boolean z6 = vq9Var.m;
            e09 e09Var = vq9Var.n;
            if (e09Var != null) {
                z = z6;
                yh0Var = new yh0(5, e09Var);
            } else {
                z = z6;
                yh0Var = null;
            }
            return new wq9(z2, z3, z4, z5, enhancerKind2, str, i3, i4, i5, i6, i7, z, yh0Var, vq9Var.e);
        }
    }

    public NoiseSuppressionManagerImpl(py0 py0Var) {
        this.call = py0Var;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager
    public wq9 getNsActiveState() {
        return this.call.b;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager
    public void setNoiseSuppressionParams(m56 paramFun) {
        this.call.F((wq9) paramFun.invoke(new vq9()));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager
    public void setNoiseSuppressorParams(boolean serversideBasic, boolean serversideAnn, boolean clientsidePlatform, boolean clientsideAnn, PeerConnectionFactory.EnhancerKind enhancerKind, String filePath, int inputSampleRate, int outputSampleRate, int fallbackTimeLimitMillis, int fallbackStutterCountMillis, int fallbackTimeframeMillis, boolean logTimings, Runnable onNoiseSuppressorDisabledDueToStutter) {
        setNoiseSuppressionParams(new AnonymousClass1(serversideBasic, serversideAnn, clientsidePlatform, clientsideAnn, enhancerKind, filePath, inputSampleRate, outputSampleRate, fallbackTimeLimitMillis, fallbackStutterCountMillis, fallbackTimeframeMillis, logTimings, onNoiseSuppressorDisabledDueToStutter));
    }
}
