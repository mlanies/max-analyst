package ru.ok.android.externcalls.sdk.dev.internal;

import defpackage.cy0;
import defpackage.f46;
import defpackage.jy0;
import defpackage.py0;
import defpackage.rod;
import defpackage.ux0;
import defpackage.x53;
import defpackage.z53;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.DumpCallback;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeDumpCallback;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager;", "Lpy0;", "call", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lpy0;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", ClientCookie.PATH_ATTR, "Le5f;", "setLocalAudioDumpLocation", "(Ljava/lang/String;)V", "", "durationSeconds", "", MediaStreamTrack.AUDIO_TRACK_KIND, MediaStreamTrack.VIDEO_TRACK_KIND, "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$RemoteMediaDumpRequestListener;", "listener", "requestMediaDump", "(IZZLru/ok/android/externcalls/sdk/dev/MediaDumpManager$RemoteMediaDumpRequestListener;)V", "", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$Source;", "sources", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$LocalAudioDumpRecordListener;", "recordAudioDump", "(ILjava/util/Set;Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$LocalAudioDumpRecordListener;)Ljava/lang/String;", "cancelAudioDumpRecord", "()V", "Lpy0;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "dumpLocation", "Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MediaDumpManagerImpl implements MediaDumpManager {
    private final py0 call;
    private String dumpLocation;
    private final SignalingProvider signalingProvider;

    public MediaDumpManagerImpl(py0 py0Var, SignalingProvider signalingProvider) {
        this.call = py0Var;
        this.signalingProvider = signalingProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestMediaDump$lambda$0(MediaDumpManager.RemoteMediaDumpRequestListener remoteMediaDumpRequestListener, JSONObject jSONObject) {
        if ("response".equals(jSONObject.optString("type")) && "collect-debug-dump".equals(jSONObject.optString("response")) && remoteMediaDumpRequestListener != null) {
            remoteMediaDumpRequestListener.onRequestSent();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager
    public void cancelAudioDumpRecord() {
        py0 py0Var = this.call;
        py0Var.getClass();
        py0.o2.execute(new ux0(py0Var, 4));
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager
    public String recordAudioDump(int durationSeconds, Set<? extends MediaDumpManager.Source> sources, final MediaDumpManager.LocalAudioDumpRecordListener listener) {
        String str = this.dumpLocation;
        Set setH0 = null;
        if (str == null) {
            return null;
        }
        File file = new File(new File(str), "calldump_" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime()) + "_" + durationSeconds + "s");
        try {
            if (file.exists() || file.mkdirs()) {
                py0 py0Var = this.call;
                String absolutePath = file.getAbsolutePath();
                if (sources != null) {
                    ArrayList arrayList = new ArrayList(z53.S(sources, 10));
                    Iterator<T> it = sources.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((MediaDumpManager.Source) it.next()).getWebrtcDumpSource());
                    }
                    setH0 = x53.H0(arrayList);
                }
                NativeDumpCallback nativeDumpCallback = new NativeDumpCallback(new DumpCallback() { // from class: ru.ok.android.externcalls.sdk.dev.internal.MediaDumpManagerImpl$recordAudioDump$1$2
                    @Override // org.webrtc.DumpCallback
                    public void onComplete(String dumpFolderPath) {
                        MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener = listener;
                        if (localAudioDumpRecordListener != null) {
                            localAudioDumpRecordListener.onRecordCompleted(dumpFolderPath);
                        }
                    }

                    @Override // org.webrtc.DumpCallback
                    public void onStarted(String dumpFolderPath) {
                        MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener = listener;
                        if (localAudioDumpRecordListener != null) {
                            localAudioDumpRecordListener.onRecordStarted(dumpFolderPath);
                        }
                    }
                });
                py0Var.getClass();
                py0.o2.execute(new cy0(py0Var, absolutePath, durationSeconds, setH0, nativeDumpCallback, 0));
            }
        } catch (Throwable unused) {
        }
        return file.getAbsolutePath();
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager
    public void requestMediaDump(int durationSeconds, boolean audio, boolean video, MediaDumpManager.RemoteMediaDumpRequestListener listener) throws JSONException {
        rod signaling = this.signalingProvider.getSignaling();
        if (signaling == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(MediaStreamTrack.AUDIO_TRACK_KIND, audio);
        jSONObject.put(MediaStreamTrack.VIDEO_TRACK_KIND, video);
        jSONObject.put("duration", durationSeconds);
        signaling.h(f46.b(jSONObject, "collect-debug-dump"), new jy0(2, listener));
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager
    public void setLocalAudioDumpLocation(String path) {
        this.dumpLocation = path;
    }
}
