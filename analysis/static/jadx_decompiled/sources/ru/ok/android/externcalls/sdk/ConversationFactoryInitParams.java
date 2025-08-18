package ru.ok.android.externcalls.sdk;

import android.content.Context;
import defpackage.a4c;
import defpackage.tpa;
import defpackage.z84;
import kotlin.Metadata;
import org.webrtc.NativeLibraryLoader;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams;", "", "context", "Landroid/content/Context;", "peerConnection", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;)V", "getContext", "()Landroid/content/Context;", "getPeerConnection", "()Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "Builder", "PeerConnection", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConversationFactoryInitParams {
    private final Context context;
    private final PeerConnection peerConnection;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "peerConnection", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "build", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams;", "setPeerConnection", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private final Context context;
        private PeerConnection peerConnection;

        public Builder(Context context) {
            this.context = context;
        }

        public final ConversationFactoryInitParams build() {
            Context context = this.context;
            PeerConnection peerConnectionBuild = this.peerConnection;
            if (peerConnectionBuild == null) {
                peerConnectionBuild = new PeerConnection.Builder().build();
            }
            return new ConversationFactoryInitParams(context, peerConnectionBuild);
        }

        public final Builder setPeerConnection(PeerConnection peerConnection) {
            this.peerConnection = peerConnection;
            return this;
        }
    }

    public ConversationFactoryInitParams(Context context, PeerConnection peerConnection) {
        this.context = context;
        this.peerConnection = peerConnection;
    }

    public final Context getContext() {
        return this.context;
    }

    public final PeerConnection getPeerConnection() {
        return this.peerConnection;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0003,-.B\u008d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\b\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\r\u0010 R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\u000e\u0010 R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u000f\u0010 R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u0010\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b\u0013\u0010 R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "", "", "bonusFieldTrials", "", "rttMultCapMs", "", "isREDEnabledP2P", "isREDEnabledServer", "udpMarker", "tcpMarker", "Lorg/webrtc/NativeLibraryLoader;", "libraryLoader", "isEarlyAudioPlayoutEnabled", "isEarlyAudioRecordingEnabled", "isSkipRelayToNotRelayConnectionEnabled", "isOpusDREDEnabled", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "dynamicRedundancyParams", "isOpusDREDLowBitrateEnabled", "isSharedSocketDisabledForICE", "La4c;", "logger", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Lorg/webrtc/NativeLibraryLoader;ZZZZLru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;ZZLa4c;)V", "Ljava/lang/String;", "getBonusFieldTrials", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getRttMultCapMs", "()Ljava/lang/Integer;", "Z", "()Z", "getUdpMarker", "getTcpMarker", "Lorg/webrtc/NativeLibraryLoader;", "getLibraryLoader", "()Lorg/webrtc/NativeLibraryLoader;", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "getDynamicRedundancyParams", "()Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "La4c;", "getLogger", "()La4c;", "AudioAdaptationParameters", "Builder", "DynamicRedundancyParameters", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class PeerConnection {
        private final String bonusFieldTrials;
        private final DynamicRedundancyParameters dynamicRedundancyParams;
        private final boolean isEarlyAudioPlayoutEnabled;
        private final boolean isEarlyAudioRecordingEnabled;
        private final boolean isOpusDREDEnabled;
        private final boolean isOpusDREDLowBitrateEnabled;
        private final boolean isREDEnabledP2P;
        private final boolean isREDEnabledServer;
        private final boolean isSharedSocketDisabledForICE;
        private final boolean isSkipRelayToNotRelayConnectionEnabled;
        private final NativeLibraryLoader libraryLoader;
        private final a4c logger;
        private final Integer rttMultCapMs;
        private final String tcpMarker;
        private final String udpMarker;

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u0013J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b'\u0010\u0017J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0014¢\u0006\u0004\b)\u0010\u0017J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010.R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010/R\u0016\u00100\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0018\u00103\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\u0018\u00104\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010-R\u0018\u00105\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00101R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00101R\u0016\u00109\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00101R\u0016\u0010:\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00101R\u0018\u0010;\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00101R\u0016\u0010>\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00101¨\u0006?"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "<init>", "()V", "La4c;", "log", "setLogger", "(La4c;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "Lorg/webrtc/NativeLibraryLoader;", "libraryLoader", "setNativeLibraryLoader", "(Lorg/webrtc/NativeLibraryLoader;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "rttMultCapMs", "setRttMultCapMs", "(Ljava/lang/Integer;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "bonusFieldTrials", "setBonusFieldTrials", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "isEnabled", "setP2PREDEnabled", "(Z)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "setServerREDEnabled", "setOpusDREDEnabled", "marker", "setUdpMarker", "setTcpMarker", "setEarlyAudioPlayoutEnabled", "setEarlyAudioRecordingEnabled", "setSkipRelayToNotRelayConnectionEnabled", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$AudioAdaptationParameters;", "params", "setAudioAdaptationParameters", "(Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$AudioAdaptationParameters;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "setDynamicRedundancyParameters", "(Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "setEnableOpusDREDLowBitrateMode", "isDisabled", "setSharedSocketDisabledForICE", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "build", "()Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "Ljava/lang/String;", "Ljava/lang/Integer;", "Lorg/webrtc/NativeLibraryLoader;", "isREDEnabledP2P", "Z", "isREDEnabledServer", "udpMarker", "tcpMarker", "logger", "La4c;", "isEarlyAudioPlayoutEnabled", "isEarlyAudioRecordingEnabled", "isSkipRelayToNotRelayConnectionEnabled", "isOpusDREDEnabled", "dynamicRedundancyParams", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "isOpusDREDLowBitrateEnabled", "isSharedSocketDisabledForICE", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
        public static final class Builder {
            private String bonusFieldTrials;
            private DynamicRedundancyParameters dynamicRedundancyParams;
            private boolean isEarlyAudioPlayoutEnabled;
            private boolean isEarlyAudioRecordingEnabled;
            private boolean isOpusDREDEnabled;
            private boolean isOpusDREDLowBitrateEnabled;
            private boolean isREDEnabledP2P = true;
            private boolean isREDEnabledServer = true;
            private boolean isSharedSocketDisabledForICE;
            private boolean isSkipRelayToNotRelayConnectionEnabled;
            private NativeLibraryLoader libraryLoader;
            private a4c logger;
            private Integer rttMultCapMs;
            private String tcpMarker;
            private String udpMarker;

            public final PeerConnection build() {
                return new PeerConnection(this.bonusFieldTrials, this.rttMultCapMs, this.isREDEnabledP2P, this.isREDEnabledServer, this.udpMarker, this.tcpMarker, this.libraryLoader, this.isEarlyAudioPlayoutEnabled, this.isEarlyAudioRecordingEnabled, this.isSkipRelayToNotRelayConnectionEnabled, this.isOpusDREDEnabled, this.dynamicRedundancyParams, this.isOpusDREDLowBitrateEnabled, this.isSharedSocketDisabledForICE, this.logger);
            }

            public final Builder setAudioAdaptationParameters(AudioAdaptationParameters params) {
                return this;
            }

            public final Builder setBonusFieldTrials(String bonusFieldTrials) {
                this.bonusFieldTrials = bonusFieldTrials;
                return this;
            }

            public final Builder setDynamicRedundancyParameters(DynamicRedundancyParameters params) {
                this.dynamicRedundancyParams = params;
                return this;
            }

            public final Builder setEarlyAudioPlayoutEnabled(boolean isEnabled) {
                this.isEarlyAudioPlayoutEnabled = isEnabled;
                return this;
            }

            public final Builder setEarlyAudioRecordingEnabled(boolean isEnabled) {
                this.isEarlyAudioRecordingEnabled = isEnabled;
                return this;
            }

            public final Builder setEnableOpusDREDLowBitrateMode(boolean isEnabled) {
                this.isOpusDREDLowBitrateEnabled = isEnabled;
                return this;
            }

            public final Builder setLogger(a4c log) {
                this.logger = log;
                return this;
            }

            public final Builder setNativeLibraryLoader(NativeLibraryLoader libraryLoader) {
                this.libraryLoader = libraryLoader;
                return this;
            }

            public final Builder setOpusDREDEnabled(boolean isEnabled) {
                this.isOpusDREDEnabled = isEnabled;
                return this;
            }

            public final Builder setP2PREDEnabled(boolean isEnabled) {
                this.isREDEnabledP2P = isEnabled;
                return this;
            }

            public final Builder setRttMultCapMs(Integer rttMultCapMs) {
                this.rttMultCapMs = rttMultCapMs;
                return this;
            }

            public final Builder setServerREDEnabled(boolean isEnabled) {
                this.isREDEnabledServer = isEnabled;
                return this;
            }

            public final Builder setSharedSocketDisabledForICE(boolean isDisabled) {
                this.isSharedSocketDisabledForICE = isDisabled;
                return this;
            }

            public final Builder setSkipRelayToNotRelayConnectionEnabled(boolean isEnabled) {
                this.isSkipRelayToNotRelayConnectionEnabled = isEnabled;
                return this;
            }

            public final Builder setTcpMarker(String marker) {
                this.udpMarker = marker;
                return this;
            }

            public final Builder setUdpMarker(String marker) {
                this.udpMarker = marker;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJl\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\t\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0007\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "", "isEnabled", "", "minAudioBitrateBps", "", "dREDSwitchBitrateBps", "isNoLACEEnabled", "isDREDWithFecEnabled", "isDREDLowBitrateEnabled", "pTimeMinMs", "pTimeMaxMs", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDREDSwitchBitrateBps", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getMinAudioBitrateBps", "getPTimeMaxMs", "getPTimeMinMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters;", "equals", "other", "hashCode", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DynamicRedundancyParameters {
            private final Integer dREDSwitchBitrateBps;
            private final Boolean isDREDLowBitrateEnabled;
            private final Boolean isDREDWithFecEnabled;
            private final boolean isEnabled;
            private final Boolean isNoLACEEnabled;
            private final Integer minAudioBitrateBps;
            private final Integer pTimeMaxMs;
            private final Integer pTimeMinMs;

            public DynamicRedundancyParameters() {
                this(false, null, null, null, null, null, null, null, 255, null);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getMinAudioBitrateBps() {
                return this.minAudioBitrateBps;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getDREDSwitchBitrateBps() {
                return this.dREDSwitchBitrateBps;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getIsNoLACEEnabled() {
                return this.isNoLACEEnabled;
            }

            /* renamed from: component5, reason: from getter */
            public final Boolean getIsDREDWithFecEnabled() {
                return this.isDREDWithFecEnabled;
            }

            /* renamed from: component6, reason: from getter */
            public final Boolean getIsDREDLowBitrateEnabled() {
                return this.isDREDLowBitrateEnabled;
            }

            /* renamed from: component7, reason: from getter */
            public final Integer getPTimeMinMs() {
                return this.pTimeMinMs;
            }

            /* renamed from: component8, reason: from getter */
            public final Integer getPTimeMaxMs() {
                return this.pTimeMaxMs;
            }

            public final DynamicRedundancyParameters copy(boolean isEnabled, Integer minAudioBitrateBps, Integer dREDSwitchBitrateBps, Boolean isNoLACEEnabled, Boolean isDREDWithFecEnabled, Boolean isDREDLowBitrateEnabled, Integer pTimeMinMs, Integer pTimeMaxMs) {
                return new DynamicRedundancyParameters(isEnabled, minAudioBitrateBps, dREDSwitchBitrateBps, isNoLACEEnabled, isDREDWithFecEnabled, isDREDLowBitrateEnabled, pTimeMinMs, pTimeMaxMs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DynamicRedundancyParameters)) {
                    return false;
                }
                DynamicRedundancyParameters dynamicRedundancyParameters = (DynamicRedundancyParameters) other;
                return this.isEnabled == dynamicRedundancyParameters.isEnabled && tpa.f(this.minAudioBitrateBps, dynamicRedundancyParameters.minAudioBitrateBps) && tpa.f(this.dREDSwitchBitrateBps, dynamicRedundancyParameters.dREDSwitchBitrateBps) && tpa.f(this.isNoLACEEnabled, dynamicRedundancyParameters.isNoLACEEnabled) && tpa.f(this.isDREDWithFecEnabled, dynamicRedundancyParameters.isDREDWithFecEnabled) && tpa.f(this.isDREDLowBitrateEnabled, dynamicRedundancyParameters.isDREDLowBitrateEnabled) && tpa.f(this.pTimeMinMs, dynamicRedundancyParameters.pTimeMinMs) && tpa.f(this.pTimeMaxMs, dynamicRedundancyParameters.pTimeMaxMs);
            }

            public final Integer getDREDSwitchBitrateBps() {
                return this.dREDSwitchBitrateBps;
            }

            public final Integer getMinAudioBitrateBps() {
                return this.minAudioBitrateBps;
            }

            public final Integer getPTimeMaxMs() {
                return this.pTimeMaxMs;
            }

            public final Integer getPTimeMinMs() {
                return this.pTimeMinMs;
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.isEnabled) * 31;
                Integer num = this.minAudioBitrateBps;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.dREDSwitchBitrateBps;
                int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.isNoLACEEnabled;
                int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.isDREDWithFecEnabled;
                int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.isDREDLowBitrateEnabled;
                int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num3 = this.pTimeMinMs;
                int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.pTimeMaxMs;
                return iHashCode7 + (num4 != null ? num4.hashCode() : 0);
            }

            public final Boolean isDREDLowBitrateEnabled() {
                return this.isDREDLowBitrateEnabled;
            }

            public final Boolean isDREDWithFecEnabled() {
                return this.isDREDWithFecEnabled;
            }

            public final boolean isEnabled() {
                return this.isEnabled;
            }

            public final Boolean isNoLACEEnabled() {
                return this.isNoLACEEnabled;
            }

            public String toString() {
                return "DynamicRedundancyParameters(isEnabled=" + this.isEnabled + ", minAudioBitrateBps=" + this.minAudioBitrateBps + ", dREDSwitchBitrateBps=" + this.dREDSwitchBitrateBps + ", isNoLACEEnabled=" + this.isNoLACEEnabled + ", isDREDWithFecEnabled=" + this.isDREDWithFecEnabled + ", isDREDLowBitrateEnabled=" + this.isDREDLowBitrateEnabled + ", pTimeMinMs=" + this.pTimeMinMs + ", pTimeMaxMs=" + this.pTimeMaxMs + ")";
            }

            public DynamicRedundancyParameters(boolean z, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, Integer num4) {
                this.isEnabled = z;
                this.minAudioBitrateBps = num;
                this.dREDSwitchBitrateBps = num2;
                this.isNoLACEEnabled = bool;
                this.isDREDWithFecEnabled = bool2;
                this.isDREDLowBitrateEnabled = bool3;
                this.pTimeMinMs = num3;
                this.pTimeMaxMs = num4;
            }

            public /* synthetic */ DynamicRedundancyParameters(boolean z, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, Integer num4, int i, z84 z84Var) {
                this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : num3, (i & 128) == 0 ? num4 : null);
            }
        }

        public PeerConnection(String str, Integer num, boolean z, boolean z2, String str2, String str3, NativeLibraryLoader nativeLibraryLoader, boolean z3, boolean z4, boolean z5, boolean z6, DynamicRedundancyParameters dynamicRedundancyParameters, boolean z7, boolean z8, a4c a4cVar) {
            this.bonusFieldTrials = str;
            this.rttMultCapMs = num;
            this.isREDEnabledP2P = z;
            this.isREDEnabledServer = z2;
            this.udpMarker = str2;
            this.tcpMarker = str3;
            this.libraryLoader = nativeLibraryLoader;
            this.isEarlyAudioPlayoutEnabled = z3;
            this.isEarlyAudioRecordingEnabled = z4;
            this.isSkipRelayToNotRelayConnectionEnabled = z5;
            this.isOpusDREDEnabled = z6;
            this.dynamicRedundancyParams = dynamicRedundancyParameters;
            this.isOpusDREDLowBitrateEnabled = z7;
            this.isSharedSocketDisabledForICE = z8;
            this.logger = a4cVar;
        }

        public final String getBonusFieldTrials() {
            return this.bonusFieldTrials;
        }

        public final DynamicRedundancyParameters getDynamicRedundancyParams() {
            return this.dynamicRedundancyParams;
        }

        public final NativeLibraryLoader getLibraryLoader() {
            return this.libraryLoader;
        }

        public final a4c getLogger() {
            return this.logger;
        }

        public final Integer getRttMultCapMs() {
            return this.rttMultCapMs;
        }

        public final String getTcpMarker() {
            return this.tcpMarker;
        }

        public final String getUdpMarker() {
            return this.udpMarker;
        }

        /* renamed from: isEarlyAudioPlayoutEnabled, reason: from getter */
        public final boolean getIsEarlyAudioPlayoutEnabled() {
            return this.isEarlyAudioPlayoutEnabled;
        }

        /* renamed from: isEarlyAudioRecordingEnabled, reason: from getter */
        public final boolean getIsEarlyAudioRecordingEnabled() {
            return this.isEarlyAudioRecordingEnabled;
        }

        /* renamed from: isOpusDREDEnabled, reason: from getter */
        public final boolean getIsOpusDREDEnabled() {
            return this.isOpusDREDEnabled;
        }

        /* renamed from: isOpusDREDLowBitrateEnabled, reason: from getter */
        public final boolean getIsOpusDREDLowBitrateEnabled() {
            return this.isOpusDREDLowBitrateEnabled;
        }

        /* renamed from: isREDEnabledP2P, reason: from getter */
        public final boolean getIsREDEnabledP2P() {
            return this.isREDEnabledP2P;
        }

        /* renamed from: isREDEnabledServer, reason: from getter */
        public final boolean getIsREDEnabledServer() {
            return this.isREDEnabledServer;
        }

        /* renamed from: isSharedSocketDisabledForICE, reason: from getter */
        public final boolean getIsSharedSocketDisabledForICE() {
            return this.isSharedSocketDisabledForICE;
        }

        /* renamed from: isSkipRelayToNotRelayConnectionEnabled, reason: from getter */
        public final boolean getIsSkipRelayToNotRelayConnectionEnabled() {
            return this.isSkipRelayToNotRelayConnectionEnabled;
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u000eJ`\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$AudioAdaptationParameters;", "", "isEnabled", "", "minEncoderBitrateKBps", "", "minPayloadBitrateKBps", "useSlowAdaptation", "maxBitrateConstraintBps", "minBitrateConstraintBps", "bitratePriority", "", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)V", "getBitratePriority", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Z", "getMaxBitrateConstraintBps", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinBitrateConstraintBps", "getMinEncoderBitrateKBps", "getMinPayloadBitrateKBps", "getUseSlowAdaptation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$AudioAdaptationParameters;", "equals", "other", "hashCode", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AudioAdaptationParameters {
            private final Double bitratePriority;
            private final boolean isEnabled;
            private final Integer maxBitrateConstraintBps;
            private final Integer minBitrateConstraintBps;
            private final Integer minEncoderBitrateKBps;
            private final Integer minPayloadBitrateKBps;
            private final Boolean useSlowAdaptation;

            public AudioAdaptationParameters(boolean z, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Double d) {
                this.isEnabled = z;
                this.minEncoderBitrateKBps = num;
                this.minPayloadBitrateKBps = num2;
                this.useSlowAdaptation = bool;
                this.maxBitrateConstraintBps = num3;
                this.minBitrateConstraintBps = num4;
                this.bitratePriority = d;
            }

            public static /* synthetic */ AudioAdaptationParameters copy$default(AudioAdaptationParameters audioAdaptationParameters, boolean z, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = audioAdaptationParameters.isEnabled;
                }
                if ((i & 2) != 0) {
                    num = audioAdaptationParameters.minEncoderBitrateKBps;
                }
                Integer num5 = num;
                if ((i & 4) != 0) {
                    num2 = audioAdaptationParameters.minPayloadBitrateKBps;
                }
                Integer num6 = num2;
                if ((i & 8) != 0) {
                    bool = audioAdaptationParameters.useSlowAdaptation;
                }
                Boolean bool2 = bool;
                if ((i & 16) != 0) {
                    num3 = audioAdaptationParameters.maxBitrateConstraintBps;
                }
                Integer num7 = num3;
                if ((i & 32) != 0) {
                    num4 = audioAdaptationParameters.minBitrateConstraintBps;
                }
                Integer num8 = num4;
                if ((i & 64) != 0) {
                    d = audioAdaptationParameters.bitratePriority;
                }
                return audioAdaptationParameters.copy(z, num5, num6, bool2, num7, num8, d);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getMinEncoderBitrateKBps() {
                return this.minEncoderBitrateKBps;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getMinPayloadBitrateKBps() {
                return this.minPayloadBitrateKBps;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getUseSlowAdaptation() {
                return this.useSlowAdaptation;
            }

            /* renamed from: component5, reason: from getter */
            public final Integer getMaxBitrateConstraintBps() {
                return this.maxBitrateConstraintBps;
            }

            /* renamed from: component6, reason: from getter */
            public final Integer getMinBitrateConstraintBps() {
                return this.minBitrateConstraintBps;
            }

            /* renamed from: component7, reason: from getter */
            public final Double getBitratePriority() {
                return this.bitratePriority;
            }

            public final AudioAdaptationParameters copy(boolean isEnabled, Integer minEncoderBitrateKBps, Integer minPayloadBitrateKBps, Boolean useSlowAdaptation, Integer maxBitrateConstraintBps, Integer minBitrateConstraintBps, Double bitratePriority) {
                return new AudioAdaptationParameters(isEnabled, minEncoderBitrateKBps, minPayloadBitrateKBps, useSlowAdaptation, maxBitrateConstraintBps, minBitrateConstraintBps, bitratePriority);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AudioAdaptationParameters)) {
                    return false;
                }
                AudioAdaptationParameters audioAdaptationParameters = (AudioAdaptationParameters) other;
                return this.isEnabled == audioAdaptationParameters.isEnabled && tpa.f(this.minEncoderBitrateKBps, audioAdaptationParameters.minEncoderBitrateKBps) && tpa.f(this.minPayloadBitrateKBps, audioAdaptationParameters.minPayloadBitrateKBps) && tpa.f(this.useSlowAdaptation, audioAdaptationParameters.useSlowAdaptation) && tpa.f(this.maxBitrateConstraintBps, audioAdaptationParameters.maxBitrateConstraintBps) && tpa.f(this.minBitrateConstraintBps, audioAdaptationParameters.minBitrateConstraintBps) && tpa.f(this.bitratePriority, audioAdaptationParameters.bitratePriority);
            }

            public final Double getBitratePriority() {
                return this.bitratePriority;
            }

            public final Integer getMaxBitrateConstraintBps() {
                return this.maxBitrateConstraintBps;
            }

            public final Integer getMinBitrateConstraintBps() {
                return this.minBitrateConstraintBps;
            }

            public final Integer getMinEncoderBitrateKBps() {
                return this.minEncoderBitrateKBps;
            }

            public final Integer getMinPayloadBitrateKBps() {
                return this.minPayloadBitrateKBps;
            }

            public final Boolean getUseSlowAdaptation() {
                return this.useSlowAdaptation;
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.isEnabled) * 31;
                Integer num = this.minEncoderBitrateKBps;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.minPayloadBitrateKBps;
                int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.useSlowAdaptation;
                int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Integer num3 = this.maxBitrateConstraintBps;
                int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.minBitrateConstraintBps;
                int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Double d = this.bitratePriority;
                return iHashCode6 + (d != null ? d.hashCode() : 0);
            }

            public final boolean isEnabled() {
                return this.isEnabled;
            }

            public String toString() {
                return "AudioAdaptationParameters(isEnabled=" + this.isEnabled + ", minEncoderBitrateKBps=" + this.minEncoderBitrateKBps + ", minPayloadBitrateKBps=" + this.minPayloadBitrateKBps + ", useSlowAdaptation=" + this.useSlowAdaptation + ", maxBitrateConstraintBps=" + this.maxBitrateConstraintBps + ", minBitrateConstraintBps=" + this.minBitrateConstraintBps + ", bitratePriority=" + this.bitratePriority + ")";
            }

            public /* synthetic */ AudioAdaptationParameters(boolean z, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Double d, int i, z84 z84Var) {
                this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4, (i & 64) == 0 ? d : null);
            }
        }
    }
}
