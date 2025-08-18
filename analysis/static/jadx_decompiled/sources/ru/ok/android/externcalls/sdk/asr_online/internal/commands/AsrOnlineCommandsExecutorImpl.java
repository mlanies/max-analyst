package ru.ok.android.externcalls.sdk.asr_online.internal.commands;

import defpackage.f46;
import defpackage.k56;
import defpackage.ka6;
import defpackage.py0;
import defpackage.rod;
import defpackage.xxe;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;", "Lkotlin/Function0;", "Lpy0;", "getCall", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lk56;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", "isEnabled", "Le5f;", "enableAsrOnline", "(Z)V", "onMigratedToServerCallTopology", "()V", "Lk56;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "isAsrOnlineEnabled", "Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AsrOnlineCommandsExecutorImpl implements AsrOnlineCommandsExecutor {
    private final k56 getCall;
    private boolean isAsrOnlineEnabled;
    private final SignalingProvider signalingProvider;

    public AsrOnlineCommandsExecutorImpl(k56 k56Var, SignalingProvider signalingProvider) {
        this.getCall = k56Var;
        this.signalingProvider = signalingProvider;
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public void enableAsrOnline(boolean isEnabled) {
        this.isAsrOnlineEnabled = isEnabled;
        py0 py0Var = (py0) this.getCall.invoke();
        if (py0Var == null) {
            return;
        }
        if (!py0Var.t1.H(xxe.b)) {
            py0 py0Var2 = (py0) this.getCall.invoke();
            if (py0Var2 != null) {
                py0Var2.t1.O(isEnabled);
                return;
            }
            return;
        }
        ka6 ka6VarB = f46.b(null, "request-asr");
        rod signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            signaling.i(ka6VarB);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public void onMigratedToServerCallTopology() {
        py0 py0Var;
        if (!this.isAsrOnlineEnabled || (py0Var = (py0) this.getCall.invoke()) == null) {
            return;
        }
        py0Var.t1.O(this.isAsrOnlineEnabled);
    }
}
