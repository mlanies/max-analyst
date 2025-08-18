package defpackage;

import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes2.dex */
public final /* synthetic */ class pld implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qld b;

    public /* synthetic */ pld(qld qldVar, int i) {
        this.a = i;
        this.b = qldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                JavaAudioDeviceModule javaAudioDeviceModule = this.b.g;
                if (javaAudioDeviceModule != null) {
                    javaAudioDeviceModule.restartAudioRecording();
                    break;
                }
                break;
            default:
                qld qldVar = this.b;
                qldVar.b.log("SharedPeerConnectionFac", "releaseInternal");
                PeerConnectionFactory peerConnectionFactory = qldVar.d;
                if (peerConnectionFactory != null) {
                    pn9 pn9Var = qldVar.i;
                    if (pn9Var != null) {
                        pn9Var.a(qldVar.j);
                    }
                    peerConnectionFactory.dispose();
                    qldVar.b.log("SharedPeerConnectionFac", jb9.c(peerConnectionFactory) + " was disposed.");
                    qldVar.d = null;
                }
                JavaAudioDeviceModule javaAudioDeviceModule2 = qldVar.g;
                if (javaAudioDeviceModule2 != null) {
                    javaAudioDeviceModule2.release();
                    qldVar.g = null;
                    break;
                }
                break;
        }
    }
}
