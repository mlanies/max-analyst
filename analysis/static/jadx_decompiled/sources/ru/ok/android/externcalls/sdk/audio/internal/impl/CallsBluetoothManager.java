package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Process;
import defpackage.tpa;
import defpackage.wg0;
import defpackage.z7;
import defpackage.z84;
import java.util.List;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluetoothManager;
import ru.ok.tamtam.nano.Protos;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 c2\u00020\u0001:\u0006decfghB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u000f\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000eH\u0003¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0003¢\u0006\u0004\b1\u0010\u0010J\u000f\u00102\u001a\u00020\nH\u0003¢\u0006\u0004\b2\u0010\fJ\u000f\u00103\u001a\u00020\nH\u0003¢\u0006\u0004\b3\u0010\fJ\u000f\u00104\u001a\u00020\nH\u0003¢\u0006\u0004\b4\u0010\fJ!\u00106\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u000eH\u0003¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\nH\u0003¢\u0006\u0004\b8\u0010\fJ\u0017\u00109\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u000eH\u0003¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\nH\u0003¢\u0006\u0004\b;\u0010\fJ\u000f\u0010<\u001a\u00020\nH\u0003¢\u0006\u0004\b<\u0010\fJ\u000f\u0010=\u001a\u00020\nH\u0003¢\u0006\u0004\b=\u0010\fJ\u0019\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020>H\u0003¢\u0006\u0004\bC\u0010DJ!\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020E2\b\b\u0002\u00105\u001a\u00020\u000eH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\nH\u0003¢\u0006\u0004\bI\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010[R\u0011\u0010^\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b]\u0010\u0010R\u0011\u0010_\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b_\u0010\u0010R\u0011\u0010b\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006i"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager;", "", "Landroid/content/Context;", "context", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;", "callsAudioManager", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "<init>", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;Lru/ok/android/externcalls/sdk/audio/Logger;)V", "Le5f;", "start", "()V", "stop", "", "startScoAudio", "()Z", "stopScoAudio", "Landroid/bluetooth/BluetoothHeadset;", "headset", "closeProfileProxy", "(Landroid/bluetooth/BluetoothHeadset;)V", "", "attempt", "(I)Z", "profile", "Landroid/bluetooth/BluetoothProfile;", "proxy", "onServiceConnectedImpl", "(ILandroid/bluetooth/BluetoothProfile;)V", "onServiceDisconnectedImpl", "(I)V", "Landroid/content/Intent;", "intent", "isInitialStickyBroadcast", "onBroadcastReceiveImpl", "(Landroid/content/Intent;Z)V", "Landroid/content/BroadcastReceiver;", "receiver", "Landroid/content/IntentFilter;", "filter", "registerReceiver", "(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V", "unregisterReceiver", "(Landroid/content/BroadcastReceiver;)V", "Landroid/bluetooth/BluetoothProfile$ServiceListener;", "listener", "getBluetoothProfileProxy", "(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z", "hasPermission", "onHeadsetConnected", "onAudioConnected", "onAudioConnecting", "triggerDeviceUpdate", "updateCurrentConnectionState", "(Landroid/bluetooth/BluetoothHeadset;Z)Z", "onHeadsetDisconnected", "onAudioDisconnected", "(Z)V", "startTimer", "cancelTimer", "bluetoothTimeout", "Landroid/bluetooth/BluetoothDevice;", "getConnectedBluetoothDevice", "(Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothDevice;", "device", "", "getBluetoothDeviceName", "(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState;", "state", "updateHeadsetState", "(Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState;Z)V", "updateAudioDeviceState", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "Landroid/content/Context;", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "bluetoothHeadsetState", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState;", "bluetoothServiceListener", "Landroid/bluetooth/BluetoothProfile$ServiceListener;", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothHeadsetReceiver", "Landroid/content/BroadcastReceiver;", "Ljava/lang/Runnable;", "bluetoothTimeoutRunnable", "Ljava/lang/Runnable;", "updateAudioManagerRunnable", "getHasBluetoothHeadset", "hasBluetoothHeadset", "isBluetoothOn", "getConnectedDeviceName", "()Ljava/lang/String;", "connectedDeviceName", "Companion", "BluetoothHeadsetBroadcastReceiver", "BluetoothServiceListener", "ConnectionState", "HeadsetState", "SCOAudioState", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CallsBluetoothManager {
    private static final int BLUETOOTH_SCO_TIMEOUT_MS = 2500;
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "CallsBluetoothManager";
    private static final int MAX_SCO_CONNECTION_ATTEMPTS = 3;
    private final AudioManager audioManager;
    private BluetoothAdapter bluetoothAdapter;
    private final Runnable bluetoothTimeoutRunnable;
    private final CallsAudioManagerV2Impl callsAudioManager;
    private final Context context;
    private final Logger logger;
    private final Runnable updateAudioManagerRunnable;
    private volatile HeadsetState bluetoothHeadsetState = HeadsetState.None.INSTANCE;
    private final BluetoothProfile.ServiceListener bluetoothServiceListener = new BluetoothServiceListener();
    private final BroadcastReceiver bluetoothHeadsetReceiver = new BluetoothHeadsetBroadcastReceiver();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$BluetoothHeadsetBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Le5f;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
    public final class BluetoothHeadsetBroadcastReceiver extends BroadcastReceiver {
        public BluetoothHeadsetBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CallsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release$default(CallsBluetoothManager.this.callsAudioManager, "bluetoothBroadcastRecieved", null, null, new CallsBluetoothManager$BluetoothHeadsetBroadcastReceiver$onReceive$1(CallsBluetoothManager.this, intent, this), 6, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$BluetoothServiceListener;", "Landroid/bluetooth/BluetoothProfile$ServiceListener;", "<init>", "(Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager;)V", "", "profile", "Landroid/bluetooth/BluetoothProfile;", "proxy", "Le5f;", "onServiceConnected", "(ILandroid/bluetooth/BluetoothProfile;)V", "onServiceDisconnected", "(I)V", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
    public final class BluetoothServiceListener implements BluetoothProfile.ServiceListener {
        public BluetoothServiceListener() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int profile, BluetoothProfile proxy) {
            CallsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release$default(CallsBluetoothManager.this.callsAudioManager, "bluetoothServiceConnected", null, new CallsBluetoothManager$BluetoothServiceListener$onServiceConnected$1(CallsBluetoothManager.this, profile), new CallsBluetoothManager$BluetoothServiceListener$onServiceConnected$2(CallsBluetoothManager.this, profile, proxy), 2, null);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int profile) {
            CallsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release$default(CallsBluetoothManager.this.callsAudioManager, "bluetoothServiceDisconnected", null, new CallsBluetoothManager$BluetoothServiceListener$onServiceDisconnected$1(CallsBluetoothManager.this, profile), new CallsBluetoothManager$BluetoothServiceListener$onServiceDisconnected$2(CallsBluetoothManager.this, profile), 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$Companion;", "", "()V", "BLUETOOTH_SCO_TIMEOUT_MS", "", "LOG_TAG", "", "MAX_SCO_CONNECTION_ATTEMPTS", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState;", "", "Connected", "Disconnected", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState$Connected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState$Disconnected;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ConnectionState {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState$Connected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState;", "deviceName", "", "audioState", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;)V", "getAudioState", "()Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "getDeviceName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Connected implements ConnectionState {
            private final SCOAudioState audioState;
            private final String deviceName;

            public Connected(String str, SCOAudioState sCOAudioState) {
                this.deviceName = str;
                this.audioState = sCOAudioState;
            }

            public static /* synthetic */ Connected copy$default(Connected connected, String str, SCOAudioState sCOAudioState, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = connected.deviceName;
                }
                if ((i & 2) != 0) {
                    sCOAudioState = connected.audioState;
                }
                return connected.copy(str, sCOAudioState);
            }

            /* renamed from: component1, reason: from getter */
            public final String getDeviceName() {
                return this.deviceName;
            }

            /* renamed from: component2, reason: from getter */
            public final SCOAudioState getAudioState() {
                return this.audioState;
            }

            public final Connected copy(String deviceName, SCOAudioState audioState) {
                return new Connected(deviceName, audioState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Connected)) {
                    return false;
                }
                Connected connected = (Connected) other;
                return tpa.f(this.deviceName, connected.deviceName) && tpa.f(this.audioState, connected.audioState);
            }

            public final SCOAudioState getAudioState() {
                return this.audioState;
            }

            public final String getDeviceName() {
                return this.deviceName;
            }

            public int hashCode() {
                return this.audioState.hashCode() + (this.deviceName.hashCode() * 31);
            }

            public String toString() {
                return "Connected(device=" + this.deviceName + ", audio=" + this.audioState + ")";
            }

            public /* synthetic */ Connected(String str, SCOAudioState sCOAudioState, int i, z84 z84Var) {
                this(str, (i & 2) != 0 ? SCOAudioState.Disconnected.INSTANCE : sCOAudioState);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState$Disconnected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Disconnected implements ConnectionState {
            public static final Disconnected INSTANCE = new Disconnected();

            private Disconnected() {
            }

            public String toString() {
                return "Disconnected";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState;", "", "Available", "None", "Unavailable", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState$Available;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState$None;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState$Unavailable;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface HeadsetState {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState$Available;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState;", "headset", "Landroid/bluetooth/BluetoothHeadset;", "connectionState", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState;", "(Landroid/bluetooth/BluetoothHeadset;Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState;)V", "getConnectionState", "()Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$ConnectionState;", "getHeadset", "()Landroid/bluetooth/BluetoothHeadset;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Available implements HeadsetState {
            private final ConnectionState connectionState;
            private final BluetoothHeadset headset;

            public Available(BluetoothHeadset bluetoothHeadset, ConnectionState connectionState) {
                this.headset = bluetoothHeadset;
                this.connectionState = connectionState;
            }

            public static /* synthetic */ Available copy$default(Available available, BluetoothHeadset bluetoothHeadset, ConnectionState connectionState, int i, Object obj) {
                if ((i & 1) != 0) {
                    bluetoothHeadset = available.headset;
                }
                if ((i & 2) != 0) {
                    connectionState = available.connectionState;
                }
                return available.copy(bluetoothHeadset, connectionState);
            }

            /* renamed from: component1, reason: from getter */
            public final BluetoothHeadset getHeadset() {
                return this.headset;
            }

            /* renamed from: component2, reason: from getter */
            public final ConnectionState getConnectionState() {
                return this.connectionState;
            }

            public final Available copy(BluetoothHeadset headset, ConnectionState connectionState) {
                return new Available(headset, connectionState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Available)) {
                    return false;
                }
                Available available = (Available) other;
                return tpa.f(this.headset, available.headset) && tpa.f(this.connectionState, available.connectionState);
            }

            public final ConnectionState getConnectionState() {
                return this.connectionState;
            }

            public final BluetoothHeadset getHeadset() {
                return this.headset;
            }

            public int hashCode() {
                return this.connectionState.hashCode() + (this.headset.hashCode() * 31);
            }

            public String toString() {
                return "Available(connection=" + this.connectionState + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState$None;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class None implements HeadsetState {
            public static final None INSTANCE = new None();

            private None() {
            }

            public String toString() {
                return "Uninitialized";
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState$Unavailable;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$HeadsetState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Unavailable implements HeadsetState {
            public static final Unavailable INSTANCE = new Unavailable();

            private Unavailable() {
            }

            public String toString() {
                return "Unavailable";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "", "Connected", "Connecting", "Disconnected", "Disconnecting", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Connected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Connecting;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Disconnected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Disconnecting;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SCOAudioState {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Connected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Connected implements SCOAudioState {
            public static final Connected INSTANCE = new Connected();

            private Connected() {
            }

            public String toString() {
                return "Connected";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Connecting;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "connectionAttempt", "", "(I)V", "getConnectionAttempt", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Connecting implements SCOAudioState {
            private final int connectionAttempt;

            public Connecting(int i) {
                this.connectionAttempt = i;
            }

            public static /* synthetic */ Connecting copy$default(Connecting connecting, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = connecting.connectionAttempt;
                }
                return connecting.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getConnectionAttempt() {
                return this.connectionAttempt;
            }

            public final Connecting copy(int connectionAttempt) {
                return new Connecting(connectionAttempt);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Connecting) && this.connectionAttempt == ((Connecting) other).connectionAttempt;
            }

            public final int getConnectionAttempt() {
                return this.connectionAttempt;
            }

            public int hashCode() {
                return Integer.hashCode(this.connectionAttempt);
            }

            public String toString() {
                return wg0.g(this.connectionAttempt, "Connecting(attempt=", ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Disconnected;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Disconnected implements SCOAudioState {
            public static final Disconnected INSTANCE = new Disconnected();

            private Disconnected() {
            }

            public String toString() {
                return "Disconnected";
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState$Disconnecting;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager$SCOAudioState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Disconnecting implements SCOAudioState {
            public static final Disconnecting INSTANCE = new Disconnecting();

            private Disconnecting() {
            }

            public String toString() {
                return "Disconnecting";
            }
        }
    }

    public CallsBluetoothManager(Context context, CallsAudioManagerV2Impl callsAudioManagerV2Impl, Logger logger) {
        this.callsAudioManager = callsAudioManagerV2Impl;
        this.logger = logger;
        this.audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        final int i = 0;
        this.bluetoothTimeoutRunnable = new Runnable(this) { // from class: yq1
            public final /* synthetic */ CallsBluetoothManager b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                CallsBluetoothManager callsBluetoothManager = this.b;
                switch (i2) {
                    case 0:
                        callsBluetoothManager.bluetoothTimeout();
                        break;
                    default:
                        callsBluetoothManager.updateAudioDeviceState();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.updateAudioManagerRunnable = new Runnable(this) { // from class: yq1
            public final /* synthetic */ CallsBluetoothManager b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                CallsBluetoothManager callsBluetoothManager = this.b;
                switch (i22) {
                    case 0:
                        callsBluetoothManager.bluetoothTimeout();
                        break;
                    default:
                        callsBluetoothManager.updateAudioDeviceState();
                        break;
                }
            }
        };
        this.context = context;
        logger.v(LOG_TAG, "CAM BT is created");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bluetoothTimeout() {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "BT SCO timed out, state " + this.bluetoothHeadsetState);
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            this.logger.v(str, "Ignore timeout event because headset not available");
            return;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.v(str, "Ignore timeout event because headset is not connected");
            return;
        }
        SCOAudioState audioState = ((ConnectionState.Connected) connectionState).getAudioState();
        if (!(audioState instanceof SCOAudioState.Connecting)) {
            this.logger.v(str, "Ignore timeout event because we are not connecting now");
            return;
        }
        if (updateCurrentConnectionState$default(this, available.getHeadset(), false, 2, null)) {
            return;
        }
        SCOAudioState.Connecting connecting = (SCOAudioState.Connecting) audioState;
        this.logger.w(str, "BT failed to connect after timeout, attempt was " + connecting.getConnectionAttempt());
        int connectionAttempt = connecting.getConnectionAttempt();
        if (connectionAttempt < 3) {
            startScoAudio(connectionAttempt + 1);
        } else {
            this.callsAudioManager.selectPreferredAudioDevice$calls_audiomanager_release(false);
        }
    }

    private final void cancelTimer() {
        this.logger.v(LOG_TAG, "cancel timers");
        this.callsAudioManager.getWorkerThreadHandler().removeCallbacks(this.bluetoothTimeoutRunnable);
    }

    private final void closeProfileProxy(BluetoothHeadset headset) {
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        if (bluetoothAdapter != null) {
            this.logger.d(LOG_TAG, "Close bluetooth profile proxy: " + headset);
            bluetoothAdapter.closeProfileProxy(1, headset);
        }
    }

    private final String getBluetoothDeviceName(BluetoothDevice device) {
        String alias;
        return (Build.VERSION.SDK_INT >= 30 && (alias = device.getAlias()) != null) ? alias : device.getName();
    }

    private final boolean getBluetoothProfileProxy(Context context, BluetoothProfile.ServiceListener listener, int profile) {
        try {
            BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
            if (bluetoothAdapter == null) {
                return false;
            }
            return bluetoothAdapter.getProfileProxy(context, listener, profile);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't get bluetooth profile proxy", th);
            return false;
        }
    }

    private final BluetoothDevice getConnectedBluetoothDevice(BluetoothHeadset headset) {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "Looking for connected bluetooth device...");
        List<BluetoothDevice> connectedDevices = headset.getConnectedDevices();
        if (connectedDevices.isEmpty()) {
            this.logger.v(str, "No connected divice found...");
            return null;
        }
        for (BluetoothDevice bluetoothDevice : connectedDevices) {
            int connectionState = headset.getConnectionState(bluetoothDevice);
            String bluetoothDeviceName = getBluetoothDeviceName(bluetoothDevice);
            if (connectionState == 0) {
                this.logger.v(LOG_TAG, "Disconnected device found: " + bluetoothDeviceName);
            } else if (connectionState == 1) {
                this.logger.v(LOG_TAG, "Connected device found: " + bluetoothDeviceName);
            } else {
                if (connectionState == 2) {
                    this.logger.v(LOG_TAG, "Connected device found: " + bluetoothDeviceName);
                    return bluetoothDevice;
                }
                if (connectionState == 3) {
                    this.logger.v(LOG_TAG, "Disconnecting device found: " + bluetoothDeviceName);
                }
            }
        }
        return null;
    }

    private final boolean hasPermission() {
        if (Build.VERSION.SDK_INT < 31) {
            if (z7.c(this.context, "android.permission.BLUETOOTH") != 0) {
                return false;
            }
        } else if (z7.c(this.context, "android.permission.BLUETOOTH_CONNECT") != 0) {
            return false;
        }
        return true;
    }

    private final void onAudioConnected() {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "audio connected, state " + this.bluetoothHeadsetState);
        cancelTimer();
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            this.logger.v(str, "Weird! audio connected notification while headset not available, ignore");
            return;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.w(str, "Weird! audio connected notification while we are not even connected, ignore");
            return;
        }
        ConnectionState.Connected connected = (ConnectionState.Connected) connectionState;
        if (!(connected.getAudioState() instanceof SCOAudioState.Connecting)) {
            this.logger.w(str, "Unexpected state for BluetoothHeadset.STATE_AUDIO_CONNECTED");
        }
        updateHeadsetState$default(this, HeadsetState.Available.copy$default(available, null, ConnectionState.Connected.copy$default(connected, null, SCOAudioState.Connected.INSTANCE, 1, null), 1, null), false, 2, null);
    }

    private final void onAudioConnecting() {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "audio has started connecting, state " + this.bluetoothHeadsetState);
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            this.logger.w(str, "Weird! audio connecting notification while headset not available, ignore");
            return;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.w(str, "Weird! audio connecting notification while we are not even connected, ignore");
            return;
        }
        ConnectionState.Connected connected = (ConnectionState.Connected) connectionState;
        if (connected.getAudioState() instanceof SCOAudioState.Connecting) {
            this.logger.v(str, "Since we are in connecting state, ignore event");
        } else {
            this.logger.v(str, "Weird! our state is wrong? Reset to connecting");
            updateHeadsetState$default(this, HeadsetState.Available.copy$default(available, null, ConnectionState.Connected.copy$default(connected, null, new SCOAudioState.Connecting(0), 1, null), 1, null), false, 2, null);
        }
    }

    private final void onAudioDisconnected(boolean isInitialStickyBroadcast) {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "audio disconnected, state " + this.bluetoothHeadsetState);
        if (isInitialStickyBroadcast) {
            return;
        }
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (headsetState instanceof HeadsetState.Available) {
            updateCurrentConnectionState$default(this, ((HeadsetState.Available) headsetState).getHeadset(), false, 2, null);
        } else {
            this.logger.w(str, "Weird! Headset is not available when sco goes down");
        }
        this.logger.v(str, "audio disconnected, state after update: " + this.bluetoothHeadsetState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBroadcastReceiveImpl(Intent intent, boolean isInitialStickyBroadcast) {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "received " + intent + ", state is " + this.bluetoothHeadsetState);
        if (this.bluetoothHeadsetState instanceof HeadsetState.None) {
            this.logger.v(str, "Our headset was not initialized yet, ignore broadcast event");
        }
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1435586571) {
                if (iHashCode == 545516589 && action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                    this.logger.v(str, "intent action is ACTION_CONNECTION_STATE_CHANGED, connection state is " + intExtra);
                    if (intExtra == 0) {
                        onHeadsetDisconnected();
                        return;
                    } else {
                        if (intExtra != 2) {
                            return;
                        }
                        onHeadsetConnected();
                        return;
                    }
                }
                return;
            }
            if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
                this.logger.v(str, "intent action is ACTION_AUDIO_STATE_CHANGED, audio state is " + intExtra2);
                switch (intExtra2) {
                    case 10:
                        onAudioDisconnected(isInitialStickyBroadcast);
                        break;
                    case 11:
                        onAudioConnecting();
                        break;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        onAudioConnected();
                        break;
                }
            }
        }
    }

    private final void onHeadsetConnected() {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "BT headset connected: " + this.bluetoothHeadsetState);
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (headsetState instanceof HeadsetState.Available) {
            updateCurrentConnectionState$default(this, ((HeadsetState.Available) headsetState).getHeadset(), false, 2, null);
        } else {
            this.logger.e(str, "Unexpected state when headset connected");
        }
    }

    private final void onHeadsetDisconnected() {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "BT headset disconnected");
        stopScoAudio();
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (headsetState instanceof HeadsetState.Available) {
            updateHeadsetState$default(this, HeadsetState.Available.copy$default((HeadsetState.Available) headsetState, null, ConnectionState.Disconnected.INSTANCE, 1, null), false, 2, null);
            return;
        }
        this.logger.e(str, "BT headset disconnected came for unexpected state " + headsetState + ", ignore");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onServiceConnectedImpl(int profile, BluetoothProfile proxy) {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "connected " + profile + ", our state is " + this.bluetoothHeadsetState);
        if (profile != 1 || tpa.f(this.bluetoothHeadsetState, HeadsetState.None.INSTANCE)) {
            this.logger.v(str, "Own state or connected profile don't match to expected one, ignore event");
        } else {
            updateCurrentConnectionState$default(this, (BluetoothHeadset) proxy, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onServiceDisconnectedImpl(int profile) {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "disconnected " + profile + ", our state is " + this.bluetoothHeadsetState);
        if (profile != 1 || tpa.f(this.bluetoothHeadsetState, HeadsetState.None.INSTANCE)) {
            this.logger.v(str, "Own state or connected profile don't match to expected one, ignore event");
        } else {
            stopScoAudio();
            updateHeadsetState$default(this, HeadsetState.Unavailable.INSTANCE, false, 2, null);
        }
    }

    private final void registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
        this.logger.v(LOG_TAG, "registering receiver");
        this.context.registerReceiver(receiver, filter);
    }

    public static /* synthetic */ boolean startScoAudio$default(CallsBluetoothManager callsBluetoothManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return callsBluetoothManager.startScoAudio(i);
    }

    private final void startTimer() {
        this.logger.v(LOG_TAG, "start connection timers");
        this.callsAudioManager.getWorkerThreadHandler().postDelayed(this.bluetoothTimeoutRunnable, 2500L);
    }

    private final void unregisterReceiver(BroadcastReceiver receiver) {
        this.logger.v(LOG_TAG, "unregistering receiver");
        this.context.unregisterReceiver(receiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAudioDeviceState() {
        this.logger.v(LOG_TAG, "Calling update CAM state because of BT state change");
        this.callsAudioManager.updateAudioDeviceState$calls_audiomanager_release();
    }

    private final boolean updateCurrentConnectionState(BluetoothHeadset headset, boolean triggerDeviceUpdate) {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "BT headset check begin: " + this.bluetoothHeadsetState);
        try {
            BluetoothDevice connectedBluetoothDevice = getConnectedBluetoothDevice(headset);
            ConnectionState connected = (connectedBluetoothDevice == null || !headset.isAudioConnected(connectedBluetoothDevice)) ? connectedBluetoothDevice != null ? new ConnectionState.Connected(getBluetoothDeviceName(connectedBluetoothDevice), SCOAudioState.Disconnected.INSTANCE) : ConnectionState.Disconnected.INSTANCE : new ConnectionState.Connected(getBluetoothDeviceName(connectedBluetoothDevice), SCOAudioState.Connected.INSTANCE);
            updateHeadsetState(new HeadsetState.Available(headset, connected), triggerDeviceUpdate);
            this.logger.v(str, "BT headset check completed: " + this.bluetoothHeadsetState);
            if (connected instanceof ConnectionState.Connected) {
                return ((ConnectionState.Connected) connected).getAudioState() instanceof SCOAudioState.Connected;
            }
            return false;
        } catch (SecurityException e) {
            this.logger.d(LOG_TAG, "SecurityException: did you permit android.permission.BLUETOOTH_CONNECT?", e);
            this.closeProfileProxy(headset);
            this.stop();
            return false;
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Error detecting remote audio device", th);
            return false;
        }
    }

    public static /* synthetic */ boolean updateCurrentConnectionState$default(CallsBluetoothManager callsBluetoothManager, BluetoothHeadset bluetoothHeadset, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return callsBluetoothManager.updateCurrentConnectionState(bluetoothHeadset, z);
    }

    private final void updateHeadsetState(HeadsetState state, boolean triggerDeviceUpdate) {
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if ((headsetState instanceof HeadsetState.Available) && !(state instanceof HeadsetState.Available)) {
            closeProfileProxy(((HeadsetState.Available) headsetState).getHeadset());
        }
        this.bluetoothHeadsetState = state;
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "BT state did change to: " + state);
        if (triggerDeviceUpdate) {
            this.callsAudioManager.getWorkerThreadHandler().removeCallbacks(this.updateAudioManagerRunnable);
            this.logger.v(str, "Scheduling update CAM state because of BT state change");
            this.callsAudioManager.getWorkerThreadHandler().post(this.updateAudioManagerRunnable);
        }
    }

    public static /* synthetic */ void updateHeadsetState$default(CallsBluetoothManager callsBluetoothManager, HeadsetState headsetState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        callsBluetoothManager.updateHeadsetState(headsetState, z);
    }

    public final String getConnectedDeviceName() {
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            return "";
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        return available.getConnectionState() instanceof ConnectionState.Connected ? ((ConnectionState.Connected) available.getConnectionState()).getDeviceName() : "";
    }

    public final boolean getHasBluetoothHeadset() {
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (headsetState instanceof HeadsetState.Available) {
            return ((HeadsetState.Available) headsetState).getConnectionState() instanceof ConnectionState.Connected;
        }
        return false;
    }

    public final boolean isBluetoothOn() {
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            return false;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        return (available.getConnectionState() instanceof ConnectionState.Connected) && (((ConnectionState.Connected) available.getConnectionState()).getAudioState() instanceof SCOAudioState.Connected);
    }

    public final void start() {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "start requested");
        if (!(this.bluetoothHeadsetState instanceof HeadsetState.None)) {
            this.logger.w(str, "Unexpected start request when state is " + this.bluetoothHeadsetState);
            return;
        }
        if (!hasPermission()) {
            this.logger.e(str, "Process (pid=" + Process.myPid() + ") lacks BLUETOOTH permission");
            return;
        }
        if (!this.audioManager.isBluetoothScoAvailableOffCall()) {
            this.logger.e(str, "Bluetooth SCO audio is not available off call");
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            this.logger.w(str, "Device does not support Bluetooth");
            return;
        }
        this.bluetoothAdapter = defaultAdapter;
        updateHeadsetState(HeadsetState.Unavailable.INSTANCE, false);
        if (!getBluetoothProfileProxy(this.context, this.bluetoothServiceListener, 1)) {
            this.logger.e(str, "BluetoothAdapter.getProfileProxy(HEADSET) failed");
            return;
        }
        BroadcastReceiver broadcastReceiver = this.bluetoothHeadsetReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        registerReceiver(broadcastReceiver, intentFilter);
    }

    public final boolean startScoAudio() {
        return startScoAudio(1);
    }

    public final void stop() {
        this.logger.v(LOG_TAG, "stop requested");
        stopScoAudio();
        if (this.bluetoothHeadsetState instanceof HeadsetState.None) {
            return;
        }
        unregisterReceiver(this.bluetoothHeadsetReceiver);
        cancelTimer();
        updateHeadsetState(HeadsetState.None.INSTANCE, false);
        this.bluetoothAdapter = null;
    }

    public final void stopScoAudio() {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "stop sco requested; state: " + this.bluetoothHeadsetState);
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            this.logger.v(str, "BT SCO disconnection ignored - no headset available");
            return;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.v(str, "BT SCO disconnection ignored - no headset connected");
            return;
        }
        SCOAudioState audioState = ((ConnectionState.Connected) connectionState).getAudioState();
        if (audioState instanceof SCOAudioState.Disconnected) {
            this.logger.v(str, "BT SCO is already disconnected. Ignore stop SCO request");
            return;
        }
        if (audioState instanceof SCOAudioState.Disconnecting) {
            this.logger.v(str, "Disconnecting is in progress. Ignore stop SCO request");
            return;
        }
        cancelTimer();
        try {
            updateHeadsetState$default(this, HeadsetState.Available.copy$default((HeadsetState.Available) headsetState, null, ConnectionState.Connected.copy$default((ConnectionState.Connected) connectionState, null, SCOAudioState.Disconnecting.INSTANCE, 1, null), 1, null), false, 2, null);
            this.audioManager.stopBluetoothSco();
            this.audioManager.setBluetoothScoOn(false);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't stop bluetooth sco", th);
            updateCurrentConnectionState$default(this, available.getHeadset(), false, 2, null);
        }
    }

    private final boolean startScoAudio(int attempt) {
        Logger logger = this.logger;
        String str = LOG_TAG;
        logger.v(str, "start sco requested, state: " + this.bluetoothHeadsetState);
        HeadsetState headsetState = this.bluetoothHeadsetState;
        if (!(headsetState instanceof HeadsetState.Available)) {
            this.logger.e(str, "BT SCO connection fails - no headset available");
            return false;
        }
        HeadsetState.Available available = (HeadsetState.Available) headsetState;
        ConnectionState connectionState = available.getConnectionState();
        if (!(connectionState instanceof ConnectionState.Connected)) {
            this.logger.e(str, "BT SCO connection fails - headset is not connected yet");
            return false;
        }
        ConnectionState.Connected connected = (ConnectionState.Connected) connectionState;
        SCOAudioState audioState = connected.getAudioState();
        if (audioState instanceof SCOAudioState.Connected) {
            this.logger.v(str, "BT SCO is already connected");
            return true;
        }
        if (audioState instanceof SCOAudioState.Connecting) {
            this.logger.v(str, "BT SCO is about to connect, ignore this attempt");
            return true;
        }
        if (audioState instanceof SCOAudioState.Disconnecting) {
            this.logger.v(str, "BT SCO is about to disconnect, ignore this attempt");
            return false;
        }
        this.logger.v(str, "BT SCO connection condition satisfied, update state and request for connection");
        updateHeadsetState$default(this, HeadsetState.Available.copy$default(available, null, ConnectionState.Connected.copy$default(connected, null, new SCOAudioState.Connecting(attempt), 1, null), 1, null), false, 2, null);
        try {
            this.audioManager.startBluetoothSco();
            this.audioManager.setBluetoothScoOn(true);
            startTimer();
            return true;
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Error on startBluetoothSco()", th);
            updateCurrentConnectionState$default(this, available.getHeadset(), false, 2, null);
            return false;
        }
    }
}
