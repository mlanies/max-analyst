package ru.ok.tamtam.nano;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import defpackage.nd7;
import defpackage.py7;
import defpackage.qw8;
import defpackage.s36;
import defpackage.x43;
import defpackage.y37;
import defpackage.y43;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import org.webrtc.EglBase;

/* loaded from: classes2.dex */
public interface Protos {

    public static final class Attaches extends qw8 {
        private static volatile Attaches[] _emptyArray;
        public Attach[] attach;
        public Attach.InlineKeyboard keyboard;
        public Attach.ReplyKeyboard replyKeyboard;
        public Attach.SendAction sendAction;

        public static final class Attach extends qw8 {
            public static final int APP = 7;
            public static final int AUDIO = 4;
            public static final int CALL = 8;
            public static final int CANCELLED = 1;
            public static final int CONTACT = 11;
            public static final int CONTROL = 1;
            public static final int DAILY_MEDIA = 15;
            public static final int DEFAULT = 0;
            public static final int ERROR = 3;
            public static final int FILE = 10;
            public static final int INLINE_KEYBOARD = 13;
            public static final int LOADED = 2;
            public static final int LOADING = 4;
            public static final int LOCATION = 14;
            public static final int MUSIC = 9;
            public static final int NOT_LOADED = 0;
            public static final int PHOTO = 2;
            public static final int PRESENT = 12;
            public static final int PROCESSED = 2;
            public static final int PROCESSING = 1;
            public static final int SHARE = 6;
            public static final int STICKER = 5;
            public static final int UNKNOWN = 0;
            public static final int VIDEO = 3;
            public static final int WIDGET = 16;
            private static volatile Attach[] _emptyArray;
            public App app;
            public Audio audio;
            public long bytesDownloaded;
            public Call call;
            public Contact contact;
            public Control control;
            public File file;
            public InlineKeyboard inlineKeyboard;
            public boolean isDeleted;
            public boolean isProcessingOnServer;
            public long lastErrorTime;
            public long lastModified;
            public String localId;
            public String localPath;
            public Location location;
            public Photo photo;
            public Present present;
            public int processingOnServerStatus;
            public int progress;
            public float progressFloat;
            public boolean sensitive;
            public boolean sensitiveContentUnlocked;
            public Share share;
            public int status;
            public Sticker sticker;
            public long totalBytes;
            public int type;
            public Video video;
            public Widget widget;

            public static final class App extends qw8 {
                private static volatile App[] _emptyArray;
                public long appId;
                public String appState;
                public String icon;
                public String message;
                public String name;
                public int state;
                public long timeout;

                public App() {
                    clear();
                }

                public static App[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new App[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (App) qw8.mergeFrom(new App(), bArr);
                }

                public App clear() {
                    this.appId = 0L;
                    this.name = "";
                    this.icon = "";
                    this.message = "";
                    this.state = 0;
                    this.timeout = 0L;
                    this.appState = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    long j = this.appId;
                    int iH = j != 0 ? y43.h(1, j) : 0;
                    if (!this.name.equals("")) {
                        iH += y43.l(2, this.name);
                    }
                    if (!this.icon.equals("")) {
                        iH += y43.l(3, this.icon);
                    }
                    if (!this.message.equals("")) {
                        iH += y43.l(4, this.message);
                    }
                    int i = this.state;
                    if (i != 0) {
                        iH += y43.f(5, i);
                    }
                    long j2 = this.timeout;
                    if (j2 != 0) {
                        iH += y43.h(6, j2);
                    }
                    return !this.appState.equals("") ? iH + y43.l(7, this.appState) : iH;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    long j = this.appId;
                    if (j != 0) {
                        y43Var.x(1, j);
                    }
                    if (!this.name.equals("")) {
                        y43Var.E(2, this.name);
                    }
                    if (!this.icon.equals("")) {
                        y43Var.E(3, this.icon);
                    }
                    if (!this.message.equals("")) {
                        y43Var.E(4, this.message);
                    }
                    int i = this.state;
                    if (i != 0) {
                        y43Var.w(5, i);
                    }
                    long j2 = this.timeout;
                    if (j2 != 0) {
                        y43Var.x(6, j2);
                    }
                    if (this.appState.equals("")) {
                        return;
                    }
                    y43Var.E(7, this.appState);
                }

                public static App parseFrom(x43 x43Var) throws IOException {
                    return new App().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public App mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 8) {
                            this.appId = x43Var.q();
                        } else if (iS == 18) {
                            this.name = x43Var.r();
                        } else if (iS == 26) {
                            this.icon = x43Var.r();
                        } else if (iS == 34) {
                            this.message = x43Var.r();
                        } else if (iS == 40) {
                            this.state = x43Var.p();
                        } else if (iS == 48) {
                            this.timeout = x43Var.q();
                        } else if (iS == 58) {
                            this.appState = x43Var.r();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Audio extends qw8 {
                public static final int FAILED = 3;
                public static final int NOT_SUPPORTED = 4;
                public static final int PROCESSING = 1;
                public static final int SUCCESS = 2;
                public static final int UNKNOWN = 0;
                private static volatile Audio[] _emptyArray;
                public long audioId;
                public long duration;
                public long lastStartTimeUpdateTimestamp;
                public long startTime;
                public String token;
                public String transcription;
                public int transcriptionStatus;
                public String url;
                public byte[] wave;

                public Audio() {
                    clear();
                }

                public static Audio[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Audio[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Audio parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Audio) qw8.mergeFrom(new Audio(), bArr);
                }

                public Audio clear() {
                    this.audioId = 0L;
                    this.url = "";
                    this.duration = 0L;
                    this.wave = nd7.g;
                    this.token = "";
                    this.startTime = 0L;
                    this.lastStartTimeUpdateTimestamp = 0L;
                    this.transcription = "";
                    this.transcriptionStatus = 0;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    long j = this.audioId;
                    int iH = j != 0 ? y43.h(1, j) : 0;
                    if (!this.url.equals("")) {
                        iH += y43.l(2, this.url);
                    }
                    long j2 = this.duration;
                    if (j2 != 0) {
                        iH += y43.h(3, j2);
                    }
                    if (!Arrays.equals(this.wave, nd7.g)) {
                        iH += y43.b(4, this.wave);
                    }
                    if (!this.token.equals("")) {
                        iH += y43.l(5, this.token);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        iH += y43.h(6, j3);
                    }
                    long j4 = this.lastStartTimeUpdateTimestamp;
                    if (j4 != 0) {
                        iH += y43.h(7, j4);
                    }
                    if (!this.transcription.equals("")) {
                        iH += y43.l(8, this.transcription);
                    }
                    int i = this.transcriptionStatus;
                    return i != 0 ? iH + y43.f(9, i) : iH;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    long j = this.audioId;
                    if (j != 0) {
                        y43Var.x(1, j);
                    }
                    if (!this.url.equals("")) {
                        y43Var.E(2, this.url);
                    }
                    long j2 = this.duration;
                    if (j2 != 0) {
                        y43Var.x(3, j2);
                    }
                    if (!Arrays.equals(this.wave, nd7.g)) {
                        y43Var.s(4, this.wave);
                    }
                    if (!this.token.equals("")) {
                        y43Var.E(5, this.token);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        y43Var.x(6, j3);
                    }
                    long j4 = this.lastStartTimeUpdateTimestamp;
                    if (j4 != 0) {
                        y43Var.x(7, j4);
                    }
                    if (!this.transcription.equals("")) {
                        y43Var.E(8, this.transcription);
                    }
                    int i = this.transcriptionStatus;
                    if (i != 0) {
                        y43Var.w(9, i);
                    }
                }

                public static Audio parseFrom(x43 x43Var) throws IOException {
                    return new Audio().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Audio mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 8) {
                            this.audioId = x43Var.q();
                        } else if (iS == 18) {
                            this.url = x43Var.r();
                        } else if (iS == 24) {
                            this.duration = x43Var.q();
                        } else if (iS == 34) {
                            this.wave = x43Var.g();
                        } else if (iS == 42) {
                            this.token = x43Var.r();
                        } else if (iS == 48) {
                            this.startTime = x43Var.q();
                        } else if (iS == 56) {
                            this.lastStartTimeUpdateTimestamp = x43Var.q();
                        } else if (iS == 66) {
                            this.transcription = x43Var.r();
                        } else if (iS == 72) {
                            int iP = x43Var.p();
                            if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4) {
                                this.transcriptionStatus = iP;
                            }
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Button extends qw8 {
                public static final int CALLBACK = 0;
                public static final int CHAT = 5;
                public static final int DEFAULT = 0;
                public static final int LINK = 1;
                public static final int MESSAGE = 6;
                public static final int NEGATIVE = 2;
                public static final int OPEN_APP = 7;
                public static final int POSITIVE = 1;
                public static final int REQUEST_CONTACT = 2;
                public static final int REQUEST_GEO_LOCATION = 3;
                public static final int UNKNOWN_INTENT = 3;
                public static final int UNKNOWN_TYPE = 4;
                private static volatile Button[] _emptyArray;
                public long contactId;
                public int intent;
                public String payload;
                public boolean quickLocation;
                public boolean showLoading;
                public String title;
                public int type;
                public String url;

                public Button() {
                    clear();
                }

                public static Button[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Button[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Button parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Button) qw8.mergeFrom(new Button(), bArr);
                }

                public Button clear() {
                    this.title = "";
                    this.type = 0;
                    this.intent = 0;
                    this.url = "";
                    this.payload = "";
                    this.showLoading = false;
                    this.quickLocation = false;
                    this.contactId = 0L;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    int iL = !this.title.equals("") ? y43.l(1, this.title) : 0;
                    int i = this.type;
                    if (i != 0) {
                        iL += y43.f(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        iL += y43.f(3, i2);
                    }
                    if (!this.url.equals("")) {
                        iL += y43.l(4, this.url);
                    }
                    if (!this.payload.equals("")) {
                        iL += y43.l(5, this.payload);
                    }
                    if (this.showLoading) {
                        iL += y43.a(6);
                    }
                    if (this.quickLocation) {
                        iL += y43.a(7);
                    }
                    long j = this.contactId;
                    return j != 0 ? iL + y43.h(8, j) : iL;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    if (!this.title.equals("")) {
                        y43Var.E(1, this.title);
                    }
                    int i = this.type;
                    if (i != 0) {
                        y43Var.w(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        y43Var.w(3, i2);
                    }
                    if (!this.url.equals("")) {
                        y43Var.E(4, this.url);
                    }
                    if (!this.payload.equals("")) {
                        y43Var.E(5, this.payload);
                    }
                    boolean z = this.showLoading;
                    if (z) {
                        y43Var.r(6, z);
                    }
                    boolean z2 = this.quickLocation;
                    if (z2) {
                        y43Var.r(7, z2);
                    }
                    long j = this.contactId;
                    if (j != 0) {
                        y43Var.x(8, j);
                    }
                }

                public static Button parseFrom(x43 x43Var) throws IOException {
                    return new Button().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Button mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 10) {
                            this.title = x43Var.r();
                        } else if (iS == 16) {
                            int iP = x43Var.p();
                            switch (iP) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    this.type = iP;
                                    break;
                            }
                        } else if (iS == 24) {
                            int iP2 = x43Var.p();
                            if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3) {
                                this.intent = iP2;
                            }
                        } else if (iS == 34) {
                            this.url = x43Var.r();
                        } else if (iS == 42) {
                            this.payload = x43Var.r();
                        } else if (iS == 48) {
                            this.showLoading = x43Var.f();
                        } else if (iS == 56) {
                            this.quickLocation = x43Var.f();
                        } else if (iS == 64) {
                            this.contactId = x43Var.q();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Buttons extends qw8 {
                private static volatile Buttons[] _emptyArray;
                public Button[] button;

                public Buttons() {
                    clear();
                }

                public static Buttons[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Buttons[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Buttons parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Buttons) qw8.mergeFrom(new Buttons(), bArr);
                }

                public Buttons clear() {
                    this.button = Button.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    Button[] buttonArr = this.button;
                    int i = 0;
                    if (buttonArr == null || buttonArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        Button[] buttonArr2 = this.button;
                        if (i >= buttonArr2.length) {
                            return i2;
                        }
                        Button button = buttonArr2[i];
                        if (button != null) {
                            i2 = y43.i(1, button) + i2;
                        }
                        i++;
                    }
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    Button[] buttonArr = this.button;
                    if (buttonArr == null || buttonArr.length <= 0) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        Button[] buttonArr2 = this.button;
                        if (i >= buttonArr2.length) {
                            return;
                        }
                        Button button = buttonArr2[i];
                        if (button != null) {
                            y43Var.y(1, button);
                        }
                        i++;
                    }
                }

                public static Buttons parseFrom(x43 x43Var) throws IOException {
                    return new Buttons().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Buttons mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 10) {
                            int iW = nd7.w(x43Var, 10);
                            Button[] buttonArr = this.button;
                            int length = buttonArr == null ? 0 : buttonArr.length;
                            int i = iW + length;
                            Button[] buttonArr2 = new Button[i];
                            if (length != 0) {
                                System.arraycopy(buttonArr, 0, buttonArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Button button = new Button();
                                buttonArr2[length] = button;
                                x43Var.j(button);
                                x43Var.s();
                                length++;
                            }
                            Button button2 = new Button();
                            buttonArr2[length] = button2;
                            x43Var.j(button2);
                            this.button = buttonArr2;
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Call extends qw8 {
                public static final int AUDIO = 2;
                public static final int CANCELED = 2;
                public static final int HANGUP = 1;
                public static final int MISSED = 4;
                public static final int REJECTED = 3;
                public static final int UNKNOWN_CALL_TYPE = 0;
                public static final int UNKNOWN_HANGUP_TYPE = 0;
                public static final int VIDEO = 1;
                private static volatile Call[] _emptyArray;
                public int callType;
                public long[] contactIds;
                public String conversationId;
                public int duration;
                public long durationLong;
                public int hangupType;
                public String joinLink;

                public Call() {
                    clear();
                }

                public static Call[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Call[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Call parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Call) qw8.mergeFrom(new Call(), bArr);
                }

                public Call clear() {
                    this.conversationId = "";
                    this.callType = 0;
                    this.hangupType = 0;
                    this.duration = 0;
                    this.contactIds = nd7.d;
                    this.durationLong = 0L;
                    this.joinLink = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    long[] jArr;
                    int i = 0;
                    int iL = !this.conversationId.equals("") ? y43.l(1, this.conversationId) : 0;
                    int i2 = this.callType;
                    if (i2 != 0) {
                        iL += y43.f(2, i2);
                    }
                    int i3 = this.hangupType;
                    if (i3 != 0) {
                        iL += y43.f(3, i3);
                    }
                    int i4 = this.duration;
                    if (i4 != 0) {
                        iL += y43.f(4, i4);
                    }
                    long[] jArr2 = this.contactIds;
                    if (jArr2 != null && jArr2.length > 0) {
                        int iK = 0;
                        while (true) {
                            jArr = this.contactIds;
                            if (i >= jArr.length) {
                                break;
                            }
                            iK += y43.k(jArr[i]);
                            i++;
                        }
                        iL = iL + iK + jArr.length;
                    }
                    long j = this.durationLong;
                    if (j != 0) {
                        iL += y43.h(6, j);
                    }
                    return !this.joinLink.equals("") ? iL + y43.l(7, this.joinLink) : iL;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    if (!this.conversationId.equals("")) {
                        y43Var.E(1, this.conversationId);
                    }
                    int i = this.callType;
                    if (i != 0) {
                        y43Var.w(2, i);
                    }
                    int i2 = this.hangupType;
                    if (i2 != 0) {
                        y43Var.w(3, i2);
                    }
                    int i3 = this.duration;
                    if (i3 != 0) {
                        y43Var.w(4, i3);
                    }
                    long[] jArr = this.contactIds;
                    if (jArr != null && jArr.length > 0) {
                        int i4 = 0;
                        while (true) {
                            long[] jArr2 = this.contactIds;
                            if (i4 >= jArr2.length) {
                                break;
                            }
                            y43Var.x(5, jArr2[i4]);
                            i4++;
                        }
                    }
                    long j = this.durationLong;
                    if (j != 0) {
                        y43Var.x(6, j);
                    }
                    if (this.joinLink.equals("")) {
                        return;
                    }
                    y43Var.E(7, this.joinLink);
                }

                public static Call parseFrom(x43 x43Var) throws IOException {
                    return new Call().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Call mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 10) {
                            this.conversationId = x43Var.r();
                        } else if (iS == 16) {
                            int iP = x43Var.p();
                            if (iP == 0 || iP == 1 || iP == 2) {
                                this.callType = iP;
                            }
                        } else if (iS == 24) {
                            int iP2 = x43Var.p();
                            if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3 || iP2 == 4) {
                                this.hangupType = iP2;
                            }
                        } else if (iS == 32) {
                            this.duration = x43Var.p();
                        } else if (iS == 40) {
                            int iW = nd7.w(x43Var, 40);
                            long[] jArr = this.contactIds;
                            int length = jArr == null ? 0 : jArr.length;
                            int i = iW + length;
                            long[] jArr2 = new long[i];
                            if (length != 0) {
                                System.arraycopy(jArr, 0, jArr2, 0, length);
                            }
                            while (length < i - 1) {
                                jArr2[length] = x43Var.q();
                                x43Var.s();
                                length++;
                            }
                            jArr2[length] = x43Var.q();
                            this.contactIds = jArr2;
                        } else if (iS == 42) {
                            int iE = x43Var.e(x43Var.p());
                            int iC = x43Var.c();
                            int i2 = 0;
                            while (x43Var.b() > 0) {
                                x43Var.q();
                                i2++;
                            }
                            x43Var.t(iC);
                            long[] jArr3 = this.contactIds;
                            int length2 = jArr3 == null ? 0 : jArr3.length;
                            int i3 = i2 + length2;
                            long[] jArr4 = new long[i3];
                            if (length2 != 0) {
                                System.arraycopy(jArr3, 0, jArr4, 0, length2);
                            }
                            while (length2 < i3) {
                                jArr4[length2] = x43Var.q();
                                length2++;
                            }
                            this.contactIds = jArr4;
                            x43Var.d(iE);
                        } else if (iS == 48) {
                            this.durationLong = x43Var.q();
                        } else if (iS == 58) {
                            this.joinLink = x43Var.r();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Contact extends qw8 {
                private static volatile Contact[] _emptyArray;
                public long contactId;
                public String firstName;
                public String lastName;
                public String localPhotoUrl;
                public String name;
                public String phone;
                public String photoUrl;
                public String vcfBody;

                public Contact() {
                    clear();
                }

                public static Contact[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Contact[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Contact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Contact) qw8.mergeFrom(new Contact(), bArr);
                }

                public Contact clear() {
                    this.vcfBody = "";
                    this.contactId = 0L;
                    this.name = "";
                    this.phone = "";
                    this.photoUrl = "";
                    this.localPhotoUrl = "";
                    this.firstName = "";
                    this.lastName = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    int iL = !this.vcfBody.equals("") ? y43.l(1, this.vcfBody) : 0;
                    long j = this.contactId;
                    if (j != 0) {
                        iL += y43.h(2, j);
                    }
                    if (!this.name.equals("")) {
                        iL += y43.l(3, this.name);
                    }
                    if (!this.phone.equals("")) {
                        iL += y43.l(4, this.phone);
                    }
                    if (!this.photoUrl.equals("")) {
                        iL += y43.l(5, this.photoUrl);
                    }
                    if (!this.localPhotoUrl.equals("")) {
                        iL += y43.l(6, this.localPhotoUrl);
                    }
                    if (!this.firstName.equals("")) {
                        iL += y43.l(7, this.firstName);
                    }
                    return !this.lastName.equals("") ? iL + y43.l(8, this.lastName) : iL;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    if (!this.vcfBody.equals("")) {
                        y43Var.E(1, this.vcfBody);
                    }
                    long j = this.contactId;
                    if (j != 0) {
                        y43Var.x(2, j);
                    }
                    if (!this.name.equals("")) {
                        y43Var.E(3, this.name);
                    }
                    if (!this.phone.equals("")) {
                        y43Var.E(4, this.phone);
                    }
                    if (!this.photoUrl.equals("")) {
                        y43Var.E(5, this.photoUrl);
                    }
                    if (!this.localPhotoUrl.equals("")) {
                        y43Var.E(6, this.localPhotoUrl);
                    }
                    if (!this.firstName.equals("")) {
                        y43Var.E(7, this.firstName);
                    }
                    if (this.lastName.equals("")) {
                        return;
                    }
                    y43Var.E(8, this.lastName);
                }

                public static Contact parseFrom(x43 x43Var) throws IOException {
                    return new Contact().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Contact mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 10) {
                            this.vcfBody = x43Var.r();
                        } else if (iS == 16) {
                            this.contactId = x43Var.q();
                        } else if (iS == 26) {
                            this.name = x43Var.r();
                        } else if (iS == 34) {
                            this.phone = x43Var.r();
                        } else if (iS == 42) {
                            this.photoUrl = x43Var.r();
                        } else if (iS == 50) {
                            this.localPhotoUrl = x43Var.r();
                        } else if (iS == 58) {
                            this.firstName = x43Var.r();
                        } else if (iS == 66) {
                            this.lastName = x43Var.r();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Control extends qw8 {
                public static final int ADD = 2;
                public static final int BOT_STARTED = 11;
                public static final int CHANNEL_TYPE = 2;
                public static final int CHAT_TYPE = 1;
                public static final int DIALOG = 4;
                public static final int GROUP_CHAT_TYPE = 3;
                public static final int HELLO = 7;
                public static final int ICON = 6;
                public static final int JOIN_BY_LINK = 9;
                public static final int LEAVE = 4;
                public static final int NEW = 1;
                public static final int PIN = 10;
                public static final int REMOVE = 3;
                public static final int SYSTEM = 8;
                public static final int TITLE = 5;
                public static final int UNKNOWN = 0;
                public static final int UNKNOWN_TYPE = 0;
                private static volatile Control[] _emptyArray;
                public int chatType;
                public Rect crop;
                public int event;
                public String fullUrl;
                public String iconToken;
                public String message;
                public long pinnedMessageId;
                public long pinnedMessageServerId;
                public String shortMessage;
                public boolean showHistory;
                public String startPayload;
                public String title;
                public String url;
                public long userId;
                public long[] userIds;

                public Control() {
                    clear();
                }

                public static Control[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Control[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Control parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Control) qw8.mergeFrom(new Control(), bArr);
                }

                public Control clear() {
                    this.event = 0;
                    this.userId = 0L;
                    this.userIds = nd7.d;
                    this.title = "";
                    this.iconToken = "";
                    this.url = "";
                    this.crop = null;
                    this.message = "";
                    this.shortMessage = "";
                    this.showHistory = false;
                    this.chatType = 0;
                    this.fullUrl = "";
                    this.pinnedMessageId = 0L;
                    this.pinnedMessageServerId = 0L;
                    this.startPayload = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    long[] jArr;
                    int i = this.event;
                    int i2 = 0;
                    int iF = i != 0 ? y43.f(1, i) : 0;
                    long j = this.userId;
                    if (j != 0) {
                        iF += y43.h(2, j);
                    }
                    long[] jArr2 = this.userIds;
                    if (jArr2 != null && jArr2.length > 0) {
                        int iK = 0;
                        while (true) {
                            jArr = this.userIds;
                            if (i2 >= jArr.length) {
                                break;
                            }
                            iK += y43.k(jArr[i2]);
                            i2++;
                        }
                        iF = iF + iK + jArr.length;
                    }
                    if (!this.title.equals("")) {
                        iF += y43.l(4, this.title);
                    }
                    if (!this.iconToken.equals("")) {
                        iF += y43.l(5, this.iconToken);
                    }
                    if (!this.url.equals("")) {
                        iF += y43.l(6, this.url);
                    }
                    Rect rect = this.crop;
                    if (rect != null) {
                        iF += y43.i(7, rect);
                    }
                    if (!this.message.equals("")) {
                        iF += y43.l(8, this.message);
                    }
                    if (!this.shortMessage.equals("")) {
                        iF += y43.l(9, this.shortMessage);
                    }
                    if (this.showHistory) {
                        iF += y43.a(10);
                    }
                    int i3 = this.chatType;
                    if (i3 != 0) {
                        iF += y43.f(11, i3);
                    }
                    if (!this.fullUrl.equals("")) {
                        iF += y43.l(12, this.fullUrl);
                    }
                    long j2 = this.pinnedMessageId;
                    if (j2 != 0) {
                        iF += y43.h(13, j2);
                    }
                    long j3 = this.pinnedMessageServerId;
                    if (j3 != 0) {
                        iF += y43.h(14, j3);
                    }
                    return !this.startPayload.equals("") ? iF + y43.l(16, this.startPayload) : iF;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    int i = this.event;
                    if (i != 0) {
                        y43Var.w(1, i);
                    }
                    long j = this.userId;
                    if (j != 0) {
                        y43Var.x(2, j);
                    }
                    long[] jArr = this.userIds;
                    if (jArr != null && jArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            long[] jArr2 = this.userIds;
                            if (i2 >= jArr2.length) {
                                break;
                            }
                            y43Var.x(3, jArr2[i2]);
                            i2++;
                        }
                    }
                    if (!this.title.equals("")) {
                        y43Var.E(4, this.title);
                    }
                    if (!this.iconToken.equals("")) {
                        y43Var.E(5, this.iconToken);
                    }
                    if (!this.url.equals("")) {
                        y43Var.E(6, this.url);
                    }
                    Rect rect = this.crop;
                    if (rect != null) {
                        y43Var.y(7, rect);
                    }
                    if (!this.message.equals("")) {
                        y43Var.E(8, this.message);
                    }
                    if (!this.shortMessage.equals("")) {
                        y43Var.E(9, this.shortMessage);
                    }
                    boolean z = this.showHistory;
                    if (z) {
                        y43Var.r(10, z);
                    }
                    int i3 = this.chatType;
                    if (i3 != 0) {
                        y43Var.w(11, i3);
                    }
                    if (!this.fullUrl.equals("")) {
                        y43Var.E(12, this.fullUrl);
                    }
                    long j2 = this.pinnedMessageId;
                    if (j2 != 0) {
                        y43Var.x(13, j2);
                    }
                    long j3 = this.pinnedMessageServerId;
                    if (j3 != 0) {
                        y43Var.x(14, j3);
                    }
                    if (this.startPayload.equals("")) {
                        return;
                    }
                    y43Var.E(16, this.startPayload);
                }

                public static Control parseFrom(x43 x43Var) throws IOException {
                    return new Control().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Control mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        switch (iS) {
                            case 0:
                                return this;
                            case 8:
                                int iP = x43Var.p();
                                switch (iP) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                        this.event = iP;
                                        break;
                                }
                            case 16:
                                this.userId = x43Var.q();
                                break;
                            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                                int iW = nd7.w(x43Var, 24);
                                long[] jArr = this.userIds;
                                int length = jArr == null ? 0 : jArr.length;
                                int i = iW + length;
                                long[] jArr2 = new long[i];
                                if (length != 0) {
                                    System.arraycopy(jArr, 0, jArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    jArr2[length] = x43Var.q();
                                    x43Var.s();
                                    length++;
                                }
                                jArr2[length] = x43Var.q();
                                this.userIds = jArr2;
                                break;
                            case 26:
                                int iE = x43Var.e(x43Var.p());
                                int iC = x43Var.c();
                                int i2 = 0;
                                while (x43Var.b() > 0) {
                                    x43Var.q();
                                    i2++;
                                }
                                x43Var.t(iC);
                                long[] jArr3 = this.userIds;
                                int length2 = jArr3 == null ? 0 : jArr3.length;
                                int i3 = i2 + length2;
                                long[] jArr4 = new long[i3];
                                if (length2 != 0) {
                                    System.arraycopy(jArr3, 0, jArr4, 0, length2);
                                }
                                while (length2 < i3) {
                                    jArr4[length2] = x43Var.q();
                                    length2++;
                                }
                                this.userIds = jArr4;
                                x43Var.d(iE);
                                break;
                            case 34:
                                this.title = x43Var.r();
                                break;
                            case 42:
                                this.iconToken = x43Var.r();
                                break;
                            case 50:
                                this.url = x43Var.r();
                                break;
                            case 58:
                                if (this.crop == null) {
                                    this.crop = new Rect();
                                }
                                x43Var.j(this.crop);
                                break;
                            case 66:
                                this.message = x43Var.r();
                                break;
                            case 74:
                                this.shortMessage = x43Var.r();
                                break;
                            case 80:
                                this.showHistory = x43Var.f();
                                break;
                            case 88:
                                int iP2 = x43Var.p();
                                if (iP2 != 0 && iP2 != 1 && iP2 != 2 && iP2 != 3 && iP2 != 4) {
                                    break;
                                } else {
                                    this.chatType = iP2;
                                    break;
                                }
                                break;
                            case 98:
                                this.fullUrl = x43Var.r();
                                break;
                            case 104:
                                this.pinnedMessageId = x43Var.q();
                                break;
                            case 112:
                                this.pinnedMessageServerId = x43Var.q();
                                break;
                            case 130:
                                this.startPayload = x43Var.r();
                                break;
                            default:
                                if (!x43Var.u(iS)) {
                                    return this;
                                }
                                break;
                        }
                    }
                }
            }

            public static final class File extends qw8 {
                private static volatile File[] _emptyArray;
                public long fileId;
                public String name;
                public Attach preview;
                public long size;
                public String token;

                public File() {
                    clear();
                }

                public static File[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new File[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static File parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (File) qw8.mergeFrom(new File(), bArr);
                }

                public File clear() {
                    this.fileId = 0L;
                    this.size = 0L;
                    this.name = "";
                    this.preview = null;
                    this.token = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    long j = this.fileId;
                    int iH = j != 0 ? y43.h(1, j) : 0;
                    long j2 = this.size;
                    if (j2 != 0) {
                        iH += y43.h(2, j2);
                    }
                    if (!this.name.equals("")) {
                        iH += y43.l(3, this.name);
                    }
                    Attach attach = this.preview;
                    if (attach != null) {
                        iH += y43.i(4, attach);
                    }
                    return !this.token.equals("") ? iH + y43.l(5, this.token) : iH;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    long j = this.fileId;
                    if (j != 0) {
                        y43Var.x(1, j);
                    }
                    long j2 = this.size;
                    if (j2 != 0) {
                        y43Var.x(2, j2);
                    }
                    if (!this.name.equals("")) {
                        y43Var.E(3, this.name);
                    }
                    Attach attach = this.preview;
                    if (attach != null) {
                        y43Var.y(4, attach);
                    }
                    if (this.token.equals("")) {
                        return;
                    }
                    y43Var.E(5, this.token);
                }

                public static File parseFrom(x43 x43Var) throws IOException {
                    return new File().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public File mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 8) {
                            this.fileId = x43Var.q();
                        } else if (iS == 16) {
                            this.size = x43Var.q();
                        } else if (iS == 26) {
                            this.name = x43Var.r();
                        } else if (iS == 34) {
                            if (this.preview == null) {
                                this.preview = new Attach();
                            }
                            x43Var.j(this.preview);
                        } else if (iS == 42) {
                            this.token = x43Var.r();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class InlineKeyboard extends qw8 {
                private static volatile InlineKeyboard[] _emptyArray;
                public Buttons[] buttons;
                public String callbackId;

                public InlineKeyboard() {
                    clear();
                }

                public static InlineKeyboard[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new InlineKeyboard[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static InlineKeyboard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (InlineKeyboard) qw8.mergeFrom(new InlineKeyboard(), bArr);
                }

                public InlineKeyboard clear() {
                    this.buttons = Buttons.emptyArray();
                    this.callbackId = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    Buttons[] buttonsArr = this.buttons;
                    int i = 0;
                    if (buttonsArr != null && buttonsArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            Buttons[] buttonsArr2 = this.buttons;
                            if (i >= buttonsArr2.length) {
                                break;
                            }
                            Buttons buttons = buttonsArr2[i];
                            if (buttons != null) {
                                i2 = y43.i(1, buttons) + i2;
                            }
                            i++;
                        }
                        i = i2;
                    }
                    return !this.callbackId.equals("") ? i + y43.l(2, this.callbackId) : i;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    Buttons[] buttonsArr = this.buttons;
                    if (buttonsArr != null && buttonsArr.length > 0) {
                        int i = 0;
                        while (true) {
                            Buttons[] buttonsArr2 = this.buttons;
                            if (i >= buttonsArr2.length) {
                                break;
                            }
                            Buttons buttons = buttonsArr2[i];
                            if (buttons != null) {
                                y43Var.y(1, buttons);
                            }
                            i++;
                        }
                    }
                    if (this.callbackId.equals("")) {
                        return;
                    }
                    y43Var.E(2, this.callbackId);
                }

                public static InlineKeyboard parseFrom(x43 x43Var) throws IOException {
                    return new InlineKeyboard().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public InlineKeyboard mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 10) {
                            int iW = nd7.w(x43Var, 10);
                            Buttons[] buttonsArr = this.buttons;
                            int length = buttonsArr == null ? 0 : buttonsArr.length;
                            int i = iW + length;
                            Buttons[] buttonsArr2 = new Buttons[i];
                            if (length != 0) {
                                System.arraycopy(buttonsArr, 0, buttonsArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Buttons buttons = new Buttons();
                                buttonsArr2[length] = buttons;
                                x43Var.j(buttons);
                                x43Var.s();
                                length++;
                            }
                            Buttons buttons2 = new Buttons();
                            buttonsArr2[length] = buttons2;
                            x43Var.j(buttons2);
                            this.buttons = buttonsArr2;
                        } else if (iS == 18) {
                            this.callbackId = x43Var.r();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Location extends qw8 {
                private static volatile Location[] _emptyArray;
                public float accuracy;
                public double altitude;
                public float bearing;
                public boolean corrupted;
                public String deviceId;
                public long endTime;
                public LocationInfo lastLocation;
                public double latitude;
                public long livePeriod;
                public double longitude;
                public float speed;
                public long startTime;
                public LocationInfo[] track;
                public long ttl;
                public float zoom;

                public Location() {
                    clear();
                }

                public static Location[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Location[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Location) qw8.mergeFrom(new Location(), bArr);
                }

                public Location clear() {
                    this.latitude = 0.0d;
                    this.longitude = 0.0d;
                    this.zoom = 0.0f;
                    this.ttl = 0L;
                    this.livePeriod = 0L;
                    this.track = LocationInfo.emptyArray();
                    this.deviceId = "";
                    this.lastLocation = null;
                    this.altitude = 0.0d;
                    this.accuracy = 0.0f;
                    this.bearing = 0.0f;
                    this.speed = 0.0f;
                    this.corrupted = false;
                    this.startTime = 0L;
                    this.endTime = 0L;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    int i = 0;
                    int iC = Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d) ? y43.c(1) : 0;
                    if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                        iC += y43.c(2);
                    }
                    if (Float.floatToIntBits(this.zoom) != Float.floatToIntBits(0.0f)) {
                        iC += y43.e(3);
                    }
                    long j = this.ttl;
                    if (j != 0) {
                        iC += y43.h(4, j);
                    }
                    long j2 = this.livePeriod;
                    if (j2 != 0) {
                        iC += y43.h(5, j2);
                    }
                    LocationInfo[] locationInfoArr = this.track;
                    if (locationInfoArr != null && locationInfoArr.length > 0) {
                        while (true) {
                            LocationInfo[] locationInfoArr2 = this.track;
                            if (i >= locationInfoArr2.length) {
                                break;
                            }
                            LocationInfo locationInfo = locationInfoArr2[i];
                            if (locationInfo != null) {
                                iC = y43.i(6, locationInfo) + iC;
                            }
                            i++;
                        }
                    }
                    if (!this.deviceId.equals("")) {
                        iC += y43.l(7, this.deviceId);
                    }
                    LocationInfo locationInfo2 = this.lastLocation;
                    if (locationInfo2 != null) {
                        iC += y43.i(8, locationInfo2);
                    }
                    if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                        iC += y43.c(9);
                    }
                    if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                        iC += y43.e(10);
                    }
                    if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                        iC += y43.e(11);
                    }
                    if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f)) {
                        iC += y43.e(12);
                    }
                    if (this.corrupted) {
                        iC += y43.a(13);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        iC += y43.h(14, j3);
                    }
                    long j4 = this.endTime;
                    return j4 != 0 ? iC + y43.h(15, j4) : iC;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    if (Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d)) {
                        y43Var.t(1, this.latitude);
                    }
                    if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                        y43Var.t(2, this.longitude);
                    }
                    if (Float.floatToIntBits(this.zoom) != Float.floatToIntBits(0.0f)) {
                        y43Var.v(3, this.zoom);
                    }
                    long j = this.ttl;
                    if (j != 0) {
                        y43Var.x(4, j);
                    }
                    long j2 = this.livePeriod;
                    if (j2 != 0) {
                        y43Var.x(5, j2);
                    }
                    LocationInfo[] locationInfoArr = this.track;
                    if (locationInfoArr != null && locationInfoArr.length > 0) {
                        int i = 0;
                        while (true) {
                            LocationInfo[] locationInfoArr2 = this.track;
                            if (i >= locationInfoArr2.length) {
                                break;
                            }
                            LocationInfo locationInfo = locationInfoArr2[i];
                            if (locationInfo != null) {
                                y43Var.y(6, locationInfo);
                            }
                            i++;
                        }
                    }
                    if (!this.deviceId.equals("")) {
                        y43Var.E(7, this.deviceId);
                    }
                    LocationInfo locationInfo2 = this.lastLocation;
                    if (locationInfo2 != null) {
                        y43Var.y(8, locationInfo2);
                    }
                    if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                        y43Var.t(9, this.altitude);
                    }
                    if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                        y43Var.v(10, this.accuracy);
                    }
                    if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                        y43Var.v(11, this.bearing);
                    }
                    if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f)) {
                        y43Var.v(12, this.speed);
                    }
                    boolean z = this.corrupted;
                    if (z) {
                        y43Var.r(13, z);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        y43Var.x(14, j3);
                    }
                    long j4 = this.endTime;
                    if (j4 != 0) {
                        y43Var.x(15, j4);
                    }
                }

                public static Location parseFrom(x43 x43Var) throws IOException {
                    return new Location().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Location mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        switch (iS) {
                            case 0:
                                return this;
                            case 9:
                                this.latitude = x43Var.h();
                                break;
                            case LangUtils.HASH_SEED /* 17 */:
                                this.longitude = x43Var.h();
                                break;
                            case 29:
                                this.zoom = x43Var.i();
                                break;
                            case 32:
                                this.ttl = x43Var.q();
                                break;
                            case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                                this.livePeriod = x43Var.q();
                                break;
                            case 50:
                                int iW = nd7.w(x43Var, 50);
                                LocationInfo[] locationInfoArr = this.track;
                                int length = locationInfoArr == null ? 0 : locationInfoArr.length;
                                int i = iW + length;
                                LocationInfo[] locationInfoArr2 = new LocationInfo[i];
                                if (length != 0) {
                                    System.arraycopy(locationInfoArr, 0, locationInfoArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    LocationInfo locationInfo = new LocationInfo();
                                    locationInfoArr2[length] = locationInfo;
                                    x43Var.j(locationInfo);
                                    x43Var.s();
                                    length++;
                                }
                                LocationInfo locationInfo2 = new LocationInfo();
                                locationInfoArr2[length] = locationInfo2;
                                x43Var.j(locationInfo2);
                                this.track = locationInfoArr2;
                                break;
                            case 58:
                                this.deviceId = x43Var.r();
                                break;
                            case 66:
                                if (this.lastLocation == null) {
                                    this.lastLocation = new LocationInfo();
                                }
                                x43Var.j(this.lastLocation);
                                break;
                            case 73:
                                this.altitude = x43Var.h();
                                break;
                            case 85:
                                this.accuracy = x43Var.i();
                                break;
                            case 93:
                                this.bearing = x43Var.i();
                                break;
                            case HttpStatus.SC_SWITCHING_PROTOCOLS /* 101 */:
                                this.speed = x43Var.i();
                                break;
                            case 104:
                                this.corrupted = x43Var.f();
                                break;
                            case 112:
                                this.startTime = x43Var.q();
                                break;
                            case 120:
                                this.endTime = x43Var.q();
                                break;
                            default:
                                if (!x43Var.u(iS)) {
                                    return this;
                                }
                                break;
                        }
                    }
                }
            }

            public static final class Photo extends qw8 {
                private static volatile Photo[] _emptyArray;
                public String baseUrl;
                public String externalGifId;
                public boolean gif;
                public int height;
                public String mp4Url;
                public long photoId;
                public String photoToken;
                public String photoUrl;
                public byte[] previewData;
                public String previewUrl;
                public int width;

                public Photo() {
                    clear();
                }

                public static Photo[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Photo[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Photo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Photo) qw8.mergeFrom(new Photo(), bArr);
                }

                public Photo clear() {
                    this.photoUrl = "";
                    this.width = 0;
                    this.height = 0;
                    this.gif = false;
                    this.previewData = nd7.g;
                    this.photoToken = "";
                    this.photoId = 0L;
                    this.mp4Url = "";
                    this.baseUrl = "";
                    this.externalGifId = "";
                    this.previewUrl = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    int iL = !this.photoUrl.equals("") ? y43.l(1, this.photoUrl) : 0;
                    int i = this.width;
                    if (i != 0) {
                        iL += y43.f(2, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        iL += y43.f(3, i2);
                    }
                    if (this.gif) {
                        iL += y43.a(4);
                    }
                    if (!Arrays.equals(this.previewData, nd7.g)) {
                        iL += y43.b(5, this.previewData);
                    }
                    if (!this.photoToken.equals("")) {
                        iL += y43.l(6, this.photoToken);
                    }
                    long j = this.photoId;
                    if (j != 0) {
                        iL += y43.h(7, j);
                    }
                    if (!this.mp4Url.equals("")) {
                        iL += y43.l(8, this.mp4Url);
                    }
                    if (!this.baseUrl.equals("")) {
                        iL += y43.l(10, this.baseUrl);
                    }
                    if (!this.externalGifId.equals("")) {
                        iL += y43.l(11, this.externalGifId);
                    }
                    return !this.previewUrl.equals("") ? iL + y43.l(12, this.previewUrl) : iL;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    if (!this.photoUrl.equals("")) {
                        y43Var.E(1, this.photoUrl);
                    }
                    int i = this.width;
                    if (i != 0) {
                        y43Var.w(2, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        y43Var.w(3, i2);
                    }
                    boolean z = this.gif;
                    if (z) {
                        y43Var.r(4, z);
                    }
                    if (!Arrays.equals(this.previewData, nd7.g)) {
                        y43Var.s(5, this.previewData);
                    }
                    if (!this.photoToken.equals("")) {
                        y43Var.E(6, this.photoToken);
                    }
                    long j = this.photoId;
                    if (j != 0) {
                        y43Var.x(7, j);
                    }
                    if (!this.mp4Url.equals("")) {
                        y43Var.E(8, this.mp4Url);
                    }
                    if (!this.baseUrl.equals("")) {
                        y43Var.E(10, this.baseUrl);
                    }
                    if (!this.externalGifId.equals("")) {
                        y43Var.E(11, this.externalGifId);
                    }
                    if (this.previewUrl.equals("")) {
                        return;
                    }
                    y43Var.E(12, this.previewUrl);
                }

                public static Photo parseFrom(x43 x43Var) throws IOException {
                    return new Photo().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Photo mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        switch (iS) {
                            case 0:
                                return this;
                            case 10:
                                this.photoUrl = x43Var.r();
                                break;
                            case 16:
                                this.width = x43Var.p();
                                break;
                            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                                this.height = x43Var.p();
                                break;
                            case 32:
                                this.gif = x43Var.f();
                                break;
                            case 42:
                                this.previewData = x43Var.g();
                                break;
                            case 50:
                                this.photoToken = x43Var.r();
                                break;
                            case 56:
                                this.photoId = x43Var.q();
                                break;
                            case 66:
                                this.mp4Url = x43Var.r();
                                break;
                            case 82:
                                this.baseUrl = x43Var.r();
                                break;
                            case 90:
                                this.externalGifId = x43Var.r();
                                break;
                            case 98:
                                this.previewUrl = x43Var.r();
                                break;
                            default:
                                if (!x43Var.u(iS)) {
                                    return this;
                                }
                                break;
                        }
                    }
                }
            }

            public static final class Present extends qw8 {
                public static final int ACCEPTED = 3;
                public static final int ACCEPTING = 5;
                public static final int DECLINED = 4;
                public static final int NEW = 1;
                public static final int RECEIVED = 2;
                public static final int UNKNOWN = 0;
                private static volatile Present[] _emptyArray;
                public long metadataId;
                public long presentId;
                public String presentJson;
                public long receiverId;
                public long senderId;
                public int status;

                public Present() {
                    clear();
                }

                public static Present[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Present[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Present parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Present) qw8.mergeFrom(new Present(), bArr);
                }

                public Present clear() {
                    this.presentId = 0L;
                    this.metadataId = 0L;
                    this.senderId = 0L;
                    this.receiverId = 0L;
                    this.status = 0;
                    this.presentJson = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    long j = this.presentId;
                    int iH = j != 0 ? y43.h(1, j) : 0;
                    long j2 = this.metadataId;
                    if (j2 != 0) {
                        iH += y43.h(2, j2);
                    }
                    long j3 = this.senderId;
                    if (j3 != 0) {
                        iH += y43.h(3, j3);
                    }
                    long j4 = this.receiverId;
                    if (j4 != 0) {
                        iH += y43.h(4, j4);
                    }
                    int i = this.status;
                    if (i != 0) {
                        iH += y43.f(5, i);
                    }
                    return !this.presentJson.equals("") ? iH + y43.l(6, this.presentJson) : iH;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    long j = this.presentId;
                    if (j != 0) {
                        y43Var.x(1, j);
                    }
                    long j2 = this.metadataId;
                    if (j2 != 0) {
                        y43Var.x(2, j2);
                    }
                    long j3 = this.senderId;
                    if (j3 != 0) {
                        y43Var.x(3, j3);
                    }
                    long j4 = this.receiverId;
                    if (j4 != 0) {
                        y43Var.x(4, j4);
                    }
                    int i = this.status;
                    if (i != 0) {
                        y43Var.w(5, i);
                    }
                    if (this.presentJson.equals("")) {
                        return;
                    }
                    y43Var.E(6, this.presentJson);
                }

                public static Present parseFrom(x43 x43Var) throws IOException {
                    return new Present().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Present mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 8) {
                            this.presentId = x43Var.q();
                        } else if (iS == 16) {
                            this.metadataId = x43Var.q();
                        } else if (iS == 24) {
                            this.senderId = x43Var.q();
                        } else if (iS == 32) {
                            this.receiverId = x43Var.q();
                        } else if (iS == 40) {
                            int iP = x43Var.p();
                            if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                                this.status = iP;
                            }
                        } else if (iS == 50) {
                            this.presentJson = x43Var.r();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Rect extends qw8 {
                private static volatile Rect[] _emptyArray;
                public float bottom;
                public float left;
                public float right;
                public float top;

                public Rect() {
                    clear();
                }

                public static Rect[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Rect[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Rect parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Rect) qw8.mergeFrom(new Rect(), bArr);
                }

                public Rect clear() {
                    this.left = 0.0f;
                    this.top = 0.0f;
                    this.right = 0.0f;
                    this.bottom = 0.0f;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    int iE = Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f) ? y43.e(1) : 0;
                    if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                        iE += y43.e(2);
                    }
                    if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                        iE += y43.e(3);
                    }
                    return Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f) ? iE + y43.e(4) : iE;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    if (Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f)) {
                        y43Var.v(1, this.left);
                    }
                    if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                        y43Var.v(2, this.top);
                    }
                    if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                        y43Var.v(3, this.right);
                    }
                    if (Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f)) {
                        y43Var.v(4, this.bottom);
                    }
                }

                public static Rect parseFrom(x43 x43Var) throws IOException {
                    return new Rect().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Rect mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 13) {
                            this.left = x43Var.i();
                        } else if (iS == 21) {
                            this.top = x43Var.i();
                        } else if (iS == 29) {
                            this.right = x43Var.i();
                        } else if (iS == 37) {
                            this.bottom = x43Var.i();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class ReplyButton extends qw8 {
                public static final int CONTACT = 2;
                public static final int DEFAULT = 0;
                public static final int IMAGE = 1;
                public static final int LOCATION = 3;
                public static final int MESSAGE = 0;
                public static final int NEGATIVE = 2;
                public static final int POSITIVE = 1;
                public static final int UNKNOWN = 4;
                public static final int UNKNOWN_INTENT = 3;
                private static volatile ReplyButton[] _emptyArray;
                public Photo image;
                public int intent;
                public long outgoingMessageId;
                public String text;
                public int type;

                public ReplyButton() {
                    clear();
                }

                public static ReplyButton[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyButton[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyButton parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (ReplyButton) qw8.mergeFrom(new ReplyButton(), bArr);
                }

                public ReplyButton clear() {
                    this.text = "";
                    this.type = 0;
                    this.intent = 0;
                    this.image = null;
                    this.outgoingMessageId = 0L;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    int iL = !this.text.equals("") ? y43.l(1, this.text) : 0;
                    int i = this.type;
                    if (i != 0) {
                        iL += y43.f(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        iL += y43.f(3, i2);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        iL += y43.i(4, photo);
                    }
                    long j = this.outgoingMessageId;
                    return j != 0 ? iL + y43.h(5, j) : iL;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    if (!this.text.equals("")) {
                        y43Var.E(1, this.text);
                    }
                    int i = this.type;
                    if (i != 0) {
                        y43Var.w(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        y43Var.w(3, i2);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        y43Var.y(4, photo);
                    }
                    long j = this.outgoingMessageId;
                    if (j != 0) {
                        y43Var.x(5, j);
                    }
                }

                public static ReplyButton parseFrom(x43 x43Var) throws IOException {
                    return new ReplyButton().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public ReplyButton mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 10) {
                            this.text = x43Var.r();
                        } else if (iS == 16) {
                            int iP = x43Var.p();
                            if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4) {
                                this.type = iP;
                            }
                        } else if (iS == 24) {
                            int iP2 = x43Var.p();
                            if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3) {
                                this.intent = iP2;
                            }
                        } else if (iS == 34) {
                            if (this.image == null) {
                                this.image = new Photo();
                            }
                            x43Var.j(this.image);
                        } else if (iS == 40) {
                            this.outgoingMessageId = x43Var.q();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class ReplyButtons extends qw8 {
                private static volatile ReplyButtons[] _emptyArray;
                public ReplyButton[] replyButton;

                public ReplyButtons() {
                    clear();
                }

                public static ReplyButtons[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyButtons[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyButtons parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (ReplyButtons) qw8.mergeFrom(new ReplyButtons(), bArr);
                }

                public ReplyButtons clear() {
                    this.replyButton = ReplyButton.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    ReplyButton[] replyButtonArr = this.replyButton;
                    int i = 0;
                    if (replyButtonArr == null || replyButtonArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        ReplyButton[] replyButtonArr2 = this.replyButton;
                        if (i >= replyButtonArr2.length) {
                            return i2;
                        }
                        ReplyButton replyButton = replyButtonArr2[i];
                        if (replyButton != null) {
                            i2 = y43.i(1, replyButton) + i2;
                        }
                        i++;
                    }
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    ReplyButton[] replyButtonArr = this.replyButton;
                    if (replyButtonArr == null || replyButtonArr.length <= 0) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        ReplyButton[] replyButtonArr2 = this.replyButton;
                        if (i >= replyButtonArr2.length) {
                            return;
                        }
                        ReplyButton replyButton = replyButtonArr2[i];
                        if (replyButton != null) {
                            y43Var.y(1, replyButton);
                        }
                        i++;
                    }
                }

                public static ReplyButtons parseFrom(x43 x43Var) throws IOException {
                    return new ReplyButtons().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public ReplyButtons mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 10) {
                            int iW = nd7.w(x43Var, 10);
                            ReplyButton[] replyButtonArr = this.replyButton;
                            int length = replyButtonArr == null ? 0 : replyButtonArr.length;
                            int i = iW + length;
                            ReplyButton[] replyButtonArr2 = new ReplyButton[i];
                            if (length != 0) {
                                System.arraycopy(replyButtonArr, 0, replyButtonArr2, 0, length);
                            }
                            while (length < i - 1) {
                                ReplyButton replyButton = new ReplyButton();
                                replyButtonArr2[length] = replyButton;
                                x43Var.j(replyButton);
                                x43Var.s();
                                length++;
                            }
                            ReplyButton replyButton2 = new ReplyButton();
                            replyButtonArr2[length] = replyButton2;
                            x43Var.j(replyButton2);
                            this.replyButton = replyButtonArr2;
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class ReplyKeyboard extends qw8 {
                private static volatile ReplyKeyboard[] _emptyArray;
                public ReplyButtons[] buttons;
                public boolean defaultInputDisabled;

                public ReplyKeyboard() {
                    clear();
                }

                public static ReplyKeyboard[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyKeyboard[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyKeyboard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (ReplyKeyboard) qw8.mergeFrom(new ReplyKeyboard(), bArr);
                }

                public ReplyKeyboard clear() {
                    this.buttons = ReplyButtons.emptyArray();
                    this.defaultInputDisabled = false;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    ReplyButtons[] replyButtonsArr = this.buttons;
                    int i = 0;
                    if (replyButtonsArr != null && replyButtonsArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            ReplyButtons[] replyButtonsArr2 = this.buttons;
                            if (i >= replyButtonsArr2.length) {
                                break;
                            }
                            ReplyButtons replyButtons = replyButtonsArr2[i];
                            if (replyButtons != null) {
                                i2 = y43.i(1, replyButtons) + i2;
                            }
                            i++;
                        }
                        i = i2;
                    }
                    return this.defaultInputDisabled ? i + y43.a(2) : i;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    ReplyButtons[] replyButtonsArr = this.buttons;
                    if (replyButtonsArr != null && replyButtonsArr.length > 0) {
                        int i = 0;
                        while (true) {
                            ReplyButtons[] replyButtonsArr2 = this.buttons;
                            if (i >= replyButtonsArr2.length) {
                                break;
                            }
                            ReplyButtons replyButtons = replyButtonsArr2[i];
                            if (replyButtons != null) {
                                y43Var.y(1, replyButtons);
                            }
                            i++;
                        }
                    }
                    boolean z = this.defaultInputDisabled;
                    if (z) {
                        y43Var.r(2, z);
                    }
                }

                public static ReplyKeyboard parseFrom(x43 x43Var) throws IOException {
                    return new ReplyKeyboard().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public ReplyKeyboard mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 10) {
                            int iW = nd7.w(x43Var, 10);
                            ReplyButtons[] replyButtonsArr = this.buttons;
                            int length = replyButtonsArr == null ? 0 : replyButtonsArr.length;
                            int i = iW + length;
                            ReplyButtons[] replyButtonsArr2 = new ReplyButtons[i];
                            if (length != 0) {
                                System.arraycopy(replyButtonsArr, 0, replyButtonsArr2, 0, length);
                            }
                            while (length < i - 1) {
                                ReplyButtons replyButtons = new ReplyButtons();
                                replyButtonsArr2[length] = replyButtons;
                                x43Var.j(replyButtons);
                                x43Var.s();
                                length++;
                            }
                            ReplyButtons replyButtons2 = new ReplyButtons();
                            replyButtonsArr2[length] = replyButtons2;
                            x43Var.j(replyButtons2);
                            this.buttons = replyButtonsArr2;
                        } else if (iS == 16) {
                            this.defaultInputDisabled = x43Var.f();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class SendAction extends qw8 {
                private static volatile SendAction[] _emptyArray;
                public String actionDestinationType;
                public String backgroundColor;
                public String contentType;
                public String context;
                public String nextContentType;
                public String textColor;
                public String title;

                public SendAction() {
                    clear();
                }

                public static SendAction[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new SendAction[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static SendAction parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (SendAction) qw8.mergeFrom(new SendAction(), bArr);
                }

                public SendAction clear() {
                    this.contentType = "";
                    this.title = "";
                    this.nextContentType = "";
                    this.textColor = "";
                    this.backgroundColor = "";
                    this.context = "";
                    this.actionDestinationType = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    int iL = !this.contentType.equals("") ? y43.l(1, this.contentType) : 0;
                    if (!this.title.equals("")) {
                        iL += y43.l(2, this.title);
                    }
                    if (!this.nextContentType.equals("")) {
                        iL += y43.l(3, this.nextContentType);
                    }
                    if (!this.textColor.equals("")) {
                        iL += y43.l(4, this.textColor);
                    }
                    if (!this.backgroundColor.equals("")) {
                        iL += y43.l(5, this.backgroundColor);
                    }
                    if (!this.context.equals("")) {
                        iL += y43.l(6, this.context);
                    }
                    return !this.actionDestinationType.equals("") ? iL + y43.l(7, this.actionDestinationType) : iL;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    if (!this.contentType.equals("")) {
                        y43Var.E(1, this.contentType);
                    }
                    if (!this.title.equals("")) {
                        y43Var.E(2, this.title);
                    }
                    if (!this.nextContentType.equals("")) {
                        y43Var.E(3, this.nextContentType);
                    }
                    if (!this.textColor.equals("")) {
                        y43Var.E(4, this.textColor);
                    }
                    if (!this.backgroundColor.equals("")) {
                        y43Var.E(5, this.backgroundColor);
                    }
                    if (!this.context.equals("")) {
                        y43Var.E(6, this.context);
                    }
                    if (this.actionDestinationType.equals("")) {
                        return;
                    }
                    y43Var.E(7, this.actionDestinationType);
                }

                public static SendAction parseFrom(x43 x43Var) throws IOException {
                    return new SendAction().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public SendAction mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 10) {
                            this.contentType = x43Var.r();
                        } else if (iS == 18) {
                            this.title = x43Var.r();
                        } else if (iS == 26) {
                            this.nextContentType = x43Var.r();
                        } else if (iS == 34) {
                            this.textColor = x43Var.r();
                        } else if (iS == 42) {
                            this.backgroundColor = x43Var.r();
                        } else if (iS == 50) {
                            this.context = x43Var.r();
                        } else if (iS == 58) {
                            this.actionDestinationType = x43Var.r();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Share extends qw8 {
                private static volatile Share[] _emptyArray;
                public boolean deleted;
                public String description;
                public String host;
                public Photo image;
                public Attach media;
                public long shareId;
                public String title;
                public String token;
                public String url;

                public Share() {
                    clear();
                }

                public static Share[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Share[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Share parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Share) qw8.mergeFrom(new Share(), bArr);
                }

                public Share clear() {
                    this.shareId = 0L;
                    this.token = "";
                    this.url = "";
                    this.title = "";
                    this.description = "";
                    this.host = "";
                    this.image = null;
                    this.media = null;
                    this.deleted = false;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    long j = this.shareId;
                    int iH = j != 0 ? y43.h(1, j) : 0;
                    if (!this.token.equals("")) {
                        iH += y43.l(2, this.token);
                    }
                    if (!this.url.equals("")) {
                        iH += y43.l(3, this.url);
                    }
                    if (!this.title.equals("")) {
                        iH += y43.l(4, this.title);
                    }
                    if (!this.description.equals("")) {
                        iH += y43.l(5, this.description);
                    }
                    if (!this.host.equals("")) {
                        iH += y43.l(6, this.host);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        iH += y43.i(7, photo);
                    }
                    Attach attach = this.media;
                    if (attach != null) {
                        iH += y43.i(8, attach);
                    }
                    return this.deleted ? iH + y43.a(9) : iH;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    long j = this.shareId;
                    if (j != 0) {
                        y43Var.x(1, j);
                    }
                    if (!this.token.equals("")) {
                        y43Var.E(2, this.token);
                    }
                    if (!this.url.equals("")) {
                        y43Var.E(3, this.url);
                    }
                    if (!this.title.equals("")) {
                        y43Var.E(4, this.title);
                    }
                    if (!this.description.equals("")) {
                        y43Var.E(5, this.description);
                    }
                    if (!this.host.equals("")) {
                        y43Var.E(6, this.host);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        y43Var.y(7, photo);
                    }
                    Attach attach = this.media;
                    if (attach != null) {
                        y43Var.y(8, attach);
                    }
                    boolean z = this.deleted;
                    if (z) {
                        y43Var.r(9, z);
                    }
                }

                public static Share parseFrom(x43 x43Var) throws IOException {
                    return new Share().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Share mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 8) {
                            this.shareId = x43Var.q();
                        } else if (iS == 18) {
                            this.token = x43Var.r();
                        } else if (iS == 26) {
                            this.url = x43Var.r();
                        } else if (iS == 34) {
                            this.title = x43Var.r();
                        } else if (iS == 42) {
                            this.description = x43Var.r();
                        } else if (iS == 50) {
                            this.host = x43Var.r();
                        } else if (iS == 58) {
                            if (this.image == null) {
                                this.image = new Photo();
                            }
                            x43Var.j(this.image);
                        } else if (iS == 66) {
                            if (this.media == null) {
                                this.media = new Attach();
                            }
                            x43Var.j(this.media);
                        } else if (iS == 72) {
                            this.deleted = x43Var.f();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Sticker extends qw8 {
                public static final int LIVE = 2;
                public static final int LOTTIE = 4;
                public static final int POSTCARD = 3;
                public static final int STATIC = 1;
                public static final int SYSTEM = 1;
                public static final int UNKNOWN = 0;
                public static final int UNKNOWN_TYPE = 0;
                public static final int USER = 2;
                private static volatile Sticker[] _emptyArray;
                public boolean audio;
                public int authorType;
                public String firstUrl;
                public int height;
                public String lottieUrl;
                public String mp4Url;
                public String previewUrl;
                public long setId;
                public long stickerId;
                public int stickerType;
                public String[] tags;
                public long updateTime;
                public String url;
                public String videoUrl;
                public int width;

                public static final class AnimationProperties extends qw8 {
                    private static volatile AnimationProperties[] _emptyArray;
                    public int duration;
                    public int fps;
                    public Map<Integer, Integer> frameRepeats;
                    public int framesCount;
                    public int replayDelay;

                    public AnimationProperties() {
                        clear();
                    }

                    public static AnimationProperties[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (y37.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new AnimationProperties[0];
                                    }
                                } finally {
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static AnimationProperties parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (AnimationProperties) qw8.mergeFrom(new AnimationProperties(), bArr);
                    }

                    public AnimationProperties clear() {
                        this.framesCount = 0;
                        this.fps = 0;
                        this.duration = 0;
                        this.replayDelay = 0;
                        this.frameRepeats = null;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.qw8
                    public int computeSerializedSize() {
                        int i = this.framesCount;
                        int iF = i != 0 ? y43.f(1, i) : 0;
                        int i2 = this.fps;
                        if (i2 != 0) {
                            iF += y43.f(2, i2);
                        }
                        int i3 = this.duration;
                        if (i3 != 0) {
                            iF += y43.f(3, i3);
                        }
                        int i4 = this.replayDelay;
                        if (i4 != 0) {
                            iF += y43.f(4, i4);
                        }
                        Map<Integer, Integer> map = this.frameRepeats;
                        return map != null ? iF + y37.a(map, 5, 5, 5) : iF;
                    }

                    @Override // defpackage.qw8
                    public AnimationProperties mergeFrom(x43 x43Var) throws IOException {
                        py7 py7Var = s36.d;
                        while (true) {
                            int iS = x43Var.s();
                            if (iS == 0) {
                                return this;
                            }
                            if (iS == 8) {
                                this.framesCount = x43Var.p();
                            } else if (iS == 16) {
                                this.fps = x43Var.p();
                            } else if (iS == 24) {
                                this.duration = x43Var.p();
                            } else if (iS == 32) {
                                this.replayDelay = x43Var.p();
                            } else if (iS == 42) {
                                this.frameRepeats = y37.b(x43Var, this.frameRepeats, py7Var, 5, 5, null, 8, 16);
                            } else if (!x43Var.u(iS)) {
                                return this;
                            }
                        }
                    }

                    @Override // defpackage.qw8
                    public void writeTo(y43 y43Var) throws IOException {
                        int i = this.framesCount;
                        if (i != 0) {
                            y43Var.w(1, i);
                        }
                        int i2 = this.fps;
                        if (i2 != 0) {
                            y43Var.w(2, i2);
                        }
                        int i3 = this.duration;
                        if (i3 != 0) {
                            y43Var.w(3, i3);
                        }
                        int i4 = this.replayDelay;
                        if (i4 != 0) {
                            y43Var.w(4, i4);
                        }
                        Map<Integer, Integer> map = this.frameRepeats;
                        if (map != null) {
                            y37.d(y43Var, map, 5, 5, 5);
                        }
                    }

                    public static AnimationProperties parseFrom(x43 x43Var) throws IOException {
                        return new AnimationProperties().mergeFrom(x43Var);
                    }
                }

                public Sticker() {
                    clear();
                }

                public static Sticker[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Sticker[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Sticker parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Sticker) qw8.mergeFrom(new Sticker(), bArr);
                }

                public Sticker clear() {
                    this.stickerId = 0L;
                    this.url = "";
                    this.width = 0;
                    this.height = 0;
                    this.mp4Url = "";
                    this.firstUrl = "";
                    this.tags = nd7.f;
                    this.previewUrl = "";
                    this.updateTime = 0L;
                    this.stickerType = 0;
                    this.setId = 0L;
                    this.lottieUrl = "";
                    this.audio = false;
                    this.authorType = 0;
                    this.videoUrl = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    long j = this.stickerId;
                    int i = 0;
                    int iH = j != 0 ? y43.h(1, j) : 0;
                    if (!this.url.equals("")) {
                        iH += y43.l(2, this.url);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        iH += y43.f(3, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        iH += y43.f(4, i3);
                    }
                    if (!this.mp4Url.equals("")) {
                        iH += y43.l(5, this.mp4Url);
                    }
                    if (!this.firstUrl.equals("")) {
                        iH += y43.l(6, this.firstUrl);
                    }
                    String[] strArr = this.tags;
                    if (strArr != null && strArr.length > 0) {
                        int iJ = 0;
                        int i4 = 0;
                        while (true) {
                            String[] strArr2 = this.tags;
                            if (i >= strArr2.length) {
                                break;
                            }
                            String str = strArr2[i];
                            if (str != null) {
                                i4++;
                                int iQ = y43.q(str);
                                iJ = y43.j(iQ) + iQ + iJ;
                            }
                            i++;
                        }
                        iH = iH + iJ + i4;
                    }
                    if (!this.previewUrl.equals("")) {
                        iH += y43.l(9, this.previewUrl);
                    }
                    long j2 = this.updateTime;
                    if (j2 != 0) {
                        iH += y43.h(10, j2);
                    }
                    int i5 = this.stickerType;
                    if (i5 != 0) {
                        iH += y43.f(13, i5);
                    }
                    long j3 = this.setId;
                    if (j3 != 0) {
                        iH += y43.h(15, j3);
                    }
                    if (!this.lottieUrl.equals("")) {
                        iH += y43.l(16, this.lottieUrl);
                    }
                    if (this.audio) {
                        iH += y43.a(17);
                    }
                    int i6 = this.authorType;
                    if (i6 != 0) {
                        iH += y43.f(18, i6);
                    }
                    return !this.videoUrl.equals("") ? iH + y43.l(20, this.videoUrl) : iH;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    long j = this.stickerId;
                    if (j != 0) {
                        y43Var.x(1, j);
                    }
                    if (!this.url.equals("")) {
                        y43Var.E(2, this.url);
                    }
                    int i = this.width;
                    if (i != 0) {
                        y43Var.w(3, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        y43Var.w(4, i2);
                    }
                    if (!this.mp4Url.equals("")) {
                        y43Var.E(5, this.mp4Url);
                    }
                    if (!this.firstUrl.equals("")) {
                        y43Var.E(6, this.firstUrl);
                    }
                    String[] strArr = this.tags;
                    if (strArr != null && strArr.length > 0) {
                        int i3 = 0;
                        while (true) {
                            String[] strArr2 = this.tags;
                            if (i3 >= strArr2.length) {
                                break;
                            }
                            String str = strArr2[i3];
                            if (str != null) {
                                y43Var.E(8, str);
                            }
                            i3++;
                        }
                    }
                    if (!this.previewUrl.equals("")) {
                        y43Var.E(9, this.previewUrl);
                    }
                    long j2 = this.updateTime;
                    if (j2 != 0) {
                        y43Var.x(10, j2);
                    }
                    int i4 = this.stickerType;
                    if (i4 != 0) {
                        y43Var.w(13, i4);
                    }
                    long j3 = this.setId;
                    if (j3 != 0) {
                        y43Var.x(15, j3);
                    }
                    if (!this.lottieUrl.equals("")) {
                        y43Var.E(16, this.lottieUrl);
                    }
                    boolean z = this.audio;
                    if (z) {
                        y43Var.r(17, z);
                    }
                    int i5 = this.authorType;
                    if (i5 != 0) {
                        y43Var.w(18, i5);
                    }
                    if (this.videoUrl.equals("")) {
                        return;
                    }
                    y43Var.E(20, this.videoUrl);
                }

                public static Sticker parseFrom(x43 x43Var) throws IOException {
                    return new Sticker().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Sticker mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        switch (iS) {
                            case 0:
                                return this;
                            case 8:
                                this.stickerId = x43Var.q();
                                break;
                            case 18:
                                this.url = x43Var.r();
                                break;
                            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                                this.width = x43Var.p();
                                break;
                            case 32:
                                this.height = x43Var.p();
                                break;
                            case 42:
                                this.mp4Url = x43Var.r();
                                break;
                            case 50:
                                this.firstUrl = x43Var.r();
                                break;
                            case 66:
                                int iW = nd7.w(x43Var, 66);
                                String[] strArr = this.tags;
                                int length = strArr == null ? 0 : strArr.length;
                                int i = iW + length;
                                String[] strArr2 = new String[i];
                                if (length != 0) {
                                    System.arraycopy(strArr, 0, strArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    strArr2[length] = x43Var.r();
                                    x43Var.s();
                                    length++;
                                }
                                strArr2[length] = x43Var.r();
                                this.tags = strArr2;
                                break;
                            case 74:
                                this.previewUrl = x43Var.r();
                                break;
                            case 80:
                                this.updateTime = x43Var.q();
                                break;
                            case 104:
                                int iP = x43Var.p();
                                if (iP != 0 && iP != 1 && iP != 2 && iP != 3 && iP != 4) {
                                    break;
                                } else {
                                    this.stickerType = iP;
                                    break;
                                }
                            case 120:
                                this.setId = x43Var.q();
                                break;
                            case 130:
                                this.lottieUrl = x43Var.r();
                                break;
                            case 136:
                                this.audio = x43Var.f();
                                break;
                            case 144:
                                int iP2 = x43Var.p();
                                if (iP2 != 0 && iP2 != 1 && iP2 != 2) {
                                    break;
                                } else {
                                    this.authorType = iP2;
                                    break;
                                }
                                break;
                            case 162:
                                this.videoUrl = x43Var.r();
                                break;
                            default:
                                if (!x43Var.u(iS)) {
                                    return this;
                                }
                                break;
                        }
                    }
                }
            }

            public static final class Video extends qw8 {
                private static volatile Video[] _emptyArray;
                public int audioGroupIndex;
                public int audioTrackIndex;
                public ConvertOptions convertOptions;
                public int duration;
                public String externalSiteName;
                public String externalUrl;
                public int height;
                public boolean ignoreAutoplay;
                public boolean isThumbnailInCache;
                public boolean live;
                public byte[] previewData;
                public long startTime;
                public String thumbnail;
                public String token;
                public VideoCollage videoCollage;
                public long videoId;
                public int videoType;
                public int width;

                public static final class ConvertOptions extends qw8 {
                    private static volatile ConvertOptions[] _emptyArray;
                    public float endTrimPosition;
                    public boolean mute;
                    public Quality quality;
                    public int qualityValue;
                    public float startTrimPosition;

                    public ConvertOptions() {
                        clear();
                    }

                    public static ConvertOptions[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (y37.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new ConvertOptions[0];
                                    }
                                } finally {
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static ConvertOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (ConvertOptions) qw8.mergeFrom(new ConvertOptions(), bArr);
                    }

                    public ConvertOptions clear() {
                        this.quality = null;
                        this.startTrimPosition = 0.0f;
                        this.endTrimPosition = 0.0f;
                        this.qualityValue = 0;
                        this.mute = false;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.qw8
                    public int computeSerializedSize() {
                        Quality quality = this.quality;
                        int i = quality != null ? y43.i(1, quality) : 0;
                        if (Float.floatToIntBits(this.startTrimPosition) != Float.floatToIntBits(0.0f)) {
                            i += y43.e(2);
                        }
                        if (Float.floatToIntBits(this.endTrimPosition) != Float.floatToIntBits(0.0f)) {
                            i += y43.e(3);
                        }
                        int i2 = this.qualityValue;
                        if (i2 != 0) {
                            i += y43.f(4, i2);
                        }
                        return this.mute ? i + y43.a(5) : i;
                    }

                    @Override // defpackage.qw8
                    public void writeTo(y43 y43Var) throws IOException {
                        Quality quality = this.quality;
                        if (quality != null) {
                            y43Var.y(1, quality);
                        }
                        if (Float.floatToIntBits(this.startTrimPosition) != Float.floatToIntBits(0.0f)) {
                            y43Var.v(2, this.startTrimPosition);
                        }
                        if (Float.floatToIntBits(this.endTrimPosition) != Float.floatToIntBits(0.0f)) {
                            y43Var.v(3, this.endTrimPosition);
                        }
                        int i = this.qualityValue;
                        if (i != 0) {
                            y43Var.w(4, i);
                        }
                        boolean z = this.mute;
                        if (z) {
                            y43Var.r(5, z);
                        }
                    }

                    public static ConvertOptions parseFrom(x43 x43Var) throws IOException {
                        return new ConvertOptions().mergeFrom(x43Var);
                    }

                    @Override // defpackage.qw8
                    public ConvertOptions mergeFrom(x43 x43Var) throws IOException {
                        while (true) {
                            int iS = x43Var.s();
                            if (iS == 0) {
                                return this;
                            }
                            if (iS == 10) {
                                if (this.quality == null) {
                                    this.quality = new Quality();
                                }
                                x43Var.j(this.quality);
                            } else if (iS == 21) {
                                this.startTrimPosition = x43Var.i();
                            } else if (iS == 29) {
                                this.endTrimPosition = x43Var.i();
                            } else if (iS == 32) {
                                this.qualityValue = x43Var.p();
                            } else if (iS == 40) {
                                this.mute = x43Var.f();
                            } else if (!x43Var.u(iS)) {
                                return this;
                            }
                        }
                    }
                }

                public static final class Quality extends qw8 {
                    private static volatile Quality[] _emptyArray;
                    public int bitrate;
                    public int height;
                    public boolean isOriginal;
                    public int ordinal;
                    public int width;

                    public Quality() {
                        clear();
                    }

                    public static Quality[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (y37.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new Quality[0];
                                    }
                                } finally {
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static Quality parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (Quality) qw8.mergeFrom(new Quality(), bArr);
                    }

                    public Quality clear() {
                        this.ordinal = 0;
                        this.width = 0;
                        this.height = 0;
                        this.isOriginal = false;
                        this.bitrate = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.qw8
                    public int computeSerializedSize() {
                        int i = this.ordinal;
                        int iF = i != 0 ? y43.f(1, i) : 0;
                        int i2 = this.width;
                        if (i2 != 0) {
                            iF += y43.f(2, i2);
                        }
                        int i3 = this.height;
                        if (i3 != 0) {
                            iF += y43.f(3, i3);
                        }
                        if (this.isOriginal) {
                            iF += y43.a(4);
                        }
                        int i4 = this.bitrate;
                        return i4 != 0 ? iF + y43.f(5, i4) : iF;
                    }

                    @Override // defpackage.qw8
                    public void writeTo(y43 y43Var) throws IOException {
                        int i = this.ordinal;
                        if (i != 0) {
                            y43Var.w(1, i);
                        }
                        int i2 = this.width;
                        if (i2 != 0) {
                            y43Var.w(2, i2);
                        }
                        int i3 = this.height;
                        if (i3 != 0) {
                            y43Var.w(3, i3);
                        }
                        boolean z = this.isOriginal;
                        if (z) {
                            y43Var.r(4, z);
                        }
                        int i4 = this.bitrate;
                        if (i4 != 0) {
                            y43Var.w(5, i4);
                        }
                    }

                    public static Quality parseFrom(x43 x43Var) throws IOException {
                        return new Quality().mergeFrom(x43Var);
                    }

                    @Override // defpackage.qw8
                    public Quality mergeFrom(x43 x43Var) throws IOException {
                        while (true) {
                            int iS = x43Var.s();
                            if (iS == 0) {
                                return this;
                            }
                            if (iS == 8) {
                                this.ordinal = x43Var.p();
                            } else if (iS == 16) {
                                this.width = x43Var.p();
                            } else if (iS == 24) {
                                this.height = x43Var.p();
                            } else if (iS == 32) {
                                this.isOriginal = x43Var.f();
                            } else if (iS == 40) {
                                this.bitrate = x43Var.p();
                            } else if (!x43Var.u(iS)) {
                                return this;
                            }
                        }
                    }
                }

                public static final class VideoCollage extends qw8 {
                    private static volatile VideoCollage[] _emptyArray;
                    public int count;
                    public int frequency;
                    public int height;
                    public String url;
                    public int width;

                    public VideoCollage() {
                        clear();
                    }

                    public static VideoCollage[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (y37.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new VideoCollage[0];
                                    }
                                } finally {
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static VideoCollage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (VideoCollage) qw8.mergeFrom(new VideoCollage(), bArr);
                    }

                    public VideoCollage clear() {
                        this.url = "";
                        this.frequency = 0;
                        this.height = 0;
                        this.width = 0;
                        this.count = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.qw8
                    public int computeSerializedSize() {
                        int iL = !this.url.equals("") ? y43.l(1, this.url) : 0;
                        int i = this.frequency;
                        if (i != 0) {
                            iL += y43.f(2, i);
                        }
                        int i2 = this.height;
                        if (i2 != 0) {
                            iL += y43.f(3, i2);
                        }
                        int i3 = this.width;
                        if (i3 != 0) {
                            iL += y43.f(4, i3);
                        }
                        int i4 = this.count;
                        return i4 != 0 ? iL + y43.f(5, i4) : iL;
                    }

                    @Override // defpackage.qw8
                    public void writeTo(y43 y43Var) throws IOException {
                        if (!this.url.equals("")) {
                            y43Var.E(1, this.url);
                        }
                        int i = this.frequency;
                        if (i != 0) {
                            y43Var.w(2, i);
                        }
                        int i2 = this.height;
                        if (i2 != 0) {
                            y43Var.w(3, i2);
                        }
                        int i3 = this.width;
                        if (i3 != 0) {
                            y43Var.w(4, i3);
                        }
                        int i4 = this.count;
                        if (i4 != 0) {
                            y43Var.w(5, i4);
                        }
                    }

                    public static VideoCollage parseFrom(x43 x43Var) throws IOException {
                        return new VideoCollage().mergeFrom(x43Var);
                    }

                    @Override // defpackage.qw8
                    public VideoCollage mergeFrom(x43 x43Var) throws IOException {
                        while (true) {
                            int iS = x43Var.s();
                            if (iS == 0) {
                                return this;
                            }
                            if (iS == 10) {
                                this.url = x43Var.r();
                            } else if (iS == 16) {
                                this.frequency = x43Var.p();
                            } else if (iS == 24) {
                                this.height = x43Var.p();
                            } else if (iS == 32) {
                                this.width = x43Var.p();
                            } else if (iS == 40) {
                                this.count = x43Var.p();
                            } else if (!x43Var.u(iS)) {
                                return this;
                            }
                        }
                    }
                }

                public Video() {
                    clear();
                }

                public static Video[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Video[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Video parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Video) qw8.mergeFrom(new Video(), bArr);
                }

                public Video clear() {
                    this.videoId = 0L;
                    this.duration = 0;
                    this.thumbnail = "";
                    this.width = 0;
                    this.height = 0;
                    this.live = false;
                    this.externalUrl = "";
                    this.previewData = nd7.g;
                    this.isThumbnailInCache = false;
                    this.startTime = 0L;
                    this.externalSiteName = "";
                    this.convertOptions = null;
                    this.token = "";
                    this.videoCollage = null;
                    this.ignoreAutoplay = false;
                    this.audioTrackIndex = 0;
                    this.audioGroupIndex = 0;
                    this.videoType = 0;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    long j = this.videoId;
                    int iH = j != 0 ? y43.h(1, j) : 0;
                    int i = this.duration;
                    if (i != 0) {
                        iH += y43.f(2, i);
                    }
                    if (!this.thumbnail.equals("")) {
                        iH += y43.l(3, this.thumbnail);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        iH += y43.f(4, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        iH += y43.f(5, i3);
                    }
                    if (this.live) {
                        iH += y43.a(6);
                    }
                    if (!this.externalUrl.equals("")) {
                        iH += y43.l(7, this.externalUrl);
                    }
                    if (!Arrays.equals(this.previewData, nd7.g)) {
                        iH += y43.b(8, this.previewData);
                    }
                    if (this.isThumbnailInCache) {
                        iH += y43.a(9);
                    }
                    long j2 = this.startTime;
                    if (j2 != 0) {
                        iH += y43.h(10, j2);
                    }
                    if (!this.externalSiteName.equals("")) {
                        iH += y43.l(11, this.externalSiteName);
                    }
                    ConvertOptions convertOptions = this.convertOptions;
                    if (convertOptions != null) {
                        iH += y43.i(12, convertOptions);
                    }
                    if (!this.token.equals("")) {
                        iH += y43.l(13, this.token);
                    }
                    VideoCollage videoCollage = this.videoCollage;
                    if (videoCollage != null) {
                        iH += y43.i(14, videoCollage);
                    }
                    if (this.ignoreAutoplay) {
                        iH += y43.a(15);
                    }
                    int i4 = this.audioTrackIndex;
                    if (i4 != 0) {
                        iH += y43.f(16, i4);
                    }
                    int i5 = this.audioGroupIndex;
                    if (i5 != 0) {
                        iH += y43.f(17, i5);
                    }
                    int i6 = this.videoType;
                    return i6 != 0 ? iH + y43.f(18, i6) : iH;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    long j = this.videoId;
                    if (j != 0) {
                        y43Var.x(1, j);
                    }
                    int i = this.duration;
                    if (i != 0) {
                        y43Var.w(2, i);
                    }
                    if (!this.thumbnail.equals("")) {
                        y43Var.E(3, this.thumbnail);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        y43Var.w(4, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        y43Var.w(5, i3);
                    }
                    boolean z = this.live;
                    if (z) {
                        y43Var.r(6, z);
                    }
                    if (!this.externalUrl.equals("")) {
                        y43Var.E(7, this.externalUrl);
                    }
                    if (!Arrays.equals(this.previewData, nd7.g)) {
                        y43Var.s(8, this.previewData);
                    }
                    boolean z2 = this.isThumbnailInCache;
                    if (z2) {
                        y43Var.r(9, z2);
                    }
                    long j2 = this.startTime;
                    if (j2 != 0) {
                        y43Var.x(10, j2);
                    }
                    if (!this.externalSiteName.equals("")) {
                        y43Var.E(11, this.externalSiteName);
                    }
                    ConvertOptions convertOptions = this.convertOptions;
                    if (convertOptions != null) {
                        y43Var.y(12, convertOptions);
                    }
                    if (!this.token.equals("")) {
                        y43Var.E(13, this.token);
                    }
                    VideoCollage videoCollage = this.videoCollage;
                    if (videoCollage != null) {
                        y43Var.y(14, videoCollage);
                    }
                    boolean z3 = this.ignoreAutoplay;
                    if (z3) {
                        y43Var.r(15, z3);
                    }
                    int i4 = this.audioTrackIndex;
                    if (i4 != 0) {
                        y43Var.w(16, i4);
                    }
                    int i5 = this.audioGroupIndex;
                    if (i5 != 0) {
                        y43Var.w(17, i5);
                    }
                    int i6 = this.videoType;
                    if (i6 != 0) {
                        y43Var.w(18, i6);
                    }
                }

                public static Video parseFrom(x43 x43Var) throws IOException {
                    return new Video().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Video mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        switch (iS) {
                            case 0:
                                return this;
                            case 8:
                                this.videoId = x43Var.q();
                                break;
                            case 16:
                                this.duration = x43Var.p();
                                break;
                            case 26:
                                this.thumbnail = x43Var.r();
                                break;
                            case 32:
                                this.width = x43Var.p();
                                break;
                            case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                                this.height = x43Var.p();
                                break;
                            case 48:
                                this.live = x43Var.f();
                                break;
                            case 58:
                                this.externalUrl = x43Var.r();
                                break;
                            case 66:
                                this.previewData = x43Var.g();
                                break;
                            case 72:
                                this.isThumbnailInCache = x43Var.f();
                                break;
                            case 80:
                                this.startTime = x43Var.q();
                                break;
                            case 90:
                                this.externalSiteName = x43Var.r();
                                break;
                            case 98:
                                if (this.convertOptions == null) {
                                    this.convertOptions = new ConvertOptions();
                                }
                                x43Var.j(this.convertOptions);
                                break;
                            case 106:
                                this.token = x43Var.r();
                                break;
                            case 114:
                                if (this.videoCollage == null) {
                                    this.videoCollage = new VideoCollage();
                                }
                                x43Var.j(this.videoCollage);
                                break;
                            case 120:
                                this.ignoreAutoplay = x43Var.f();
                                break;
                            case 128:
                                this.audioTrackIndex = x43Var.p();
                                break;
                            case 136:
                                this.audioGroupIndex = x43Var.p();
                                break;
                            case 144:
                                this.videoType = x43Var.p();
                                break;
                            default:
                                if (!x43Var.u(iS)) {
                                    return this;
                                }
                                break;
                        }
                    }
                }
            }

            public static final class Widget extends qw8 {
                private static volatile Widget[] _emptyArray;
                public Content[] contents;

                public static final class Content extends qw8 {
                    public static final int ADAPTIVE_ICON = 1;
                    public static final int DESCRIPTION = 5;
                    public static final int KEYBOARD = 6;
                    public static final int PICTURE = 2;
                    public static final int TITLE_BIG = 3;
                    public static final int TITLE_STANDARD = 4;
                    public static final int UNSUPPORTED = 0;
                    private static volatile Content[] _emptyArray;
                    public MessageElement[] elements;
                    public int iconHeight;
                    public String iconUrl;
                    public int iconWidth;
                    public InlineKeyboard keyboard;
                    public String text;
                    public int type;

                    public Content() {
                        clear();
                    }

                    public static Content[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (y37.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new Content[0];
                                    }
                                } finally {
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static Content parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (Content) qw8.mergeFrom(new Content(), bArr);
                    }

                    public Content clear() {
                        this.type = 0;
                        this.keyboard = null;
                        this.text = "";
                        this.elements = MessageElement.emptyArray();
                        this.iconUrl = "";
                        this.iconWidth = 0;
                        this.iconHeight = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.qw8
                    public int computeSerializedSize() {
                        int i = this.type;
                        int i2 = 0;
                        int iF = i != 0 ? y43.f(1, i) : 0;
                        InlineKeyboard inlineKeyboard = this.keyboard;
                        if (inlineKeyboard != null) {
                            iF += y43.i(2, inlineKeyboard);
                        }
                        if (!this.text.equals("")) {
                            iF += y43.l(3, this.text);
                        }
                        MessageElement[] messageElementArr = this.elements;
                        if (messageElementArr != null && messageElementArr.length > 0) {
                            while (true) {
                                MessageElement[] messageElementArr2 = this.elements;
                                if (i2 >= messageElementArr2.length) {
                                    break;
                                }
                                MessageElement messageElement = messageElementArr2[i2];
                                if (messageElement != null) {
                                    iF = y43.i(4, messageElement) + iF;
                                }
                                i2++;
                            }
                        }
                        if (!this.iconUrl.equals("")) {
                            iF += y43.l(5, this.iconUrl);
                        }
                        int i3 = this.iconWidth;
                        if (i3 != 0) {
                            iF += y43.f(6, i3);
                        }
                        int i4 = this.iconHeight;
                        return i4 != 0 ? iF + y43.f(7, i4) : iF;
                    }

                    @Override // defpackage.qw8
                    public void writeTo(y43 y43Var) throws IOException {
                        int i = this.type;
                        if (i != 0) {
                            y43Var.w(1, i);
                        }
                        InlineKeyboard inlineKeyboard = this.keyboard;
                        if (inlineKeyboard != null) {
                            y43Var.y(2, inlineKeyboard);
                        }
                        if (!this.text.equals("")) {
                            y43Var.E(3, this.text);
                        }
                        MessageElement[] messageElementArr = this.elements;
                        if (messageElementArr != null && messageElementArr.length > 0) {
                            int i2 = 0;
                            while (true) {
                                MessageElement[] messageElementArr2 = this.elements;
                                if (i2 >= messageElementArr2.length) {
                                    break;
                                }
                                MessageElement messageElement = messageElementArr2[i2];
                                if (messageElement != null) {
                                    y43Var.y(4, messageElement);
                                }
                                i2++;
                            }
                        }
                        if (!this.iconUrl.equals("")) {
                            y43Var.E(5, this.iconUrl);
                        }
                        int i3 = this.iconWidth;
                        if (i3 != 0) {
                            y43Var.w(6, i3);
                        }
                        int i4 = this.iconHeight;
                        if (i4 != 0) {
                            y43Var.w(7, i4);
                        }
                    }

                    public static Content parseFrom(x43 x43Var) throws IOException {
                        return new Content().mergeFrom(x43Var);
                    }

                    @Override // defpackage.qw8
                    public Content mergeFrom(x43 x43Var) throws IOException {
                        while (true) {
                            int iS = x43Var.s();
                            if (iS == 0) {
                                return this;
                            }
                            if (iS == 8) {
                                int iP = x43Var.p();
                                switch (iP) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                        this.type = iP;
                                        break;
                                }
                            } else if (iS == 18) {
                                if (this.keyboard == null) {
                                    this.keyboard = new InlineKeyboard();
                                }
                                x43Var.j(this.keyboard);
                            } else if (iS == 26) {
                                this.text = x43Var.r();
                            } else if (iS == 34) {
                                int iW = nd7.w(x43Var, 34);
                                MessageElement[] messageElementArr = this.elements;
                                int length = messageElementArr == null ? 0 : messageElementArr.length;
                                int i = iW + length;
                                MessageElement[] messageElementArr2 = new MessageElement[i];
                                if (length != 0) {
                                    System.arraycopy(messageElementArr, 0, messageElementArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    MessageElement messageElement = new MessageElement();
                                    messageElementArr2[length] = messageElement;
                                    x43Var.j(messageElement);
                                    x43Var.s();
                                    length++;
                                }
                                MessageElement messageElement2 = new MessageElement();
                                messageElementArr2[length] = messageElement2;
                                x43Var.j(messageElement2);
                                this.elements = messageElementArr2;
                            } else if (iS == 42) {
                                this.iconUrl = x43Var.r();
                            } else if (iS == 48) {
                                this.iconWidth = x43Var.p();
                            } else if (iS == 56) {
                                this.iconHeight = x43Var.p();
                            } else if (!x43Var.u(iS)) {
                                return this;
                            }
                        }
                    }
                }

                public Widget() {
                    clear();
                }

                public static Widget[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Widget[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Widget parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Widget) qw8.mergeFrom(new Widget(), bArr);
                }

                public Widget clear() {
                    this.contents = Content.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    Content[] contentArr = this.contents;
                    int i = 0;
                    if (contentArr == null || contentArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        Content[] contentArr2 = this.contents;
                        if (i >= contentArr2.length) {
                            return i2;
                        }
                        Content content = contentArr2[i];
                        if (content != null) {
                            i2 = y43.i(1, content) + i2;
                        }
                        i++;
                    }
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    Content[] contentArr = this.contents;
                    if (contentArr == null || contentArr.length <= 0) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        Content[] contentArr2 = this.contents;
                        if (i >= contentArr2.length) {
                            return;
                        }
                        Content content = contentArr2[i];
                        if (content != null) {
                            y43Var.y(1, content);
                        }
                        i++;
                    }
                }

                public static Widget parseFrom(x43 x43Var) throws IOException {
                    return new Widget().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public Widget mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 10) {
                            int iW = nd7.w(x43Var, 10);
                            Content[] contentArr = this.contents;
                            int length = contentArr == null ? 0 : contentArr.length;
                            int i = iW + length;
                            Content[] contentArr2 = new Content[i];
                            if (length != 0) {
                                System.arraycopy(contentArr, 0, contentArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Content content = new Content();
                                contentArr2[length] = content;
                                x43Var.j(content);
                                x43Var.s();
                                length++;
                            }
                            Content content2 = new Content();
                            contentArr2[length] = content2;
                            x43Var.j(content2);
                            this.contents = contentArr2;
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public Attach() {
                clear();
            }

            public static Attach[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Attach[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static Attach parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Attach) qw8.mergeFrom(new Attach(), bArr);
            }

            public Attach clear() {
                this.type = 0;
                this.photo = null;
                this.control = null;
                this.video = null;
                this.audio = null;
                this.sticker = null;
                this.share = null;
                this.app = null;
                this.call = null;
                this.status = 0;
                this.lastErrorTime = 0L;
                this.progress = 0;
                this.localId = "";
                this.localPath = "";
                this.isProcessingOnServer = false;
                this.isDeleted = false;
                this.totalBytes = 0L;
                this.bytesDownloaded = 0L;
                this.file = null;
                this.contact = null;
                this.lastModified = 0L;
                this.present = null;
                this.inlineKeyboard = null;
                this.location = null;
                this.progressFloat = 0.0f;
                this.processingOnServerStatus = 0;
                this.sensitiveContentUnlocked = false;
                this.sensitive = false;
                this.widget = null;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                int i = this.type;
                int iF = i != 0 ? y43.f(1, i) : 0;
                Photo photo = this.photo;
                if (photo != null) {
                    iF += y43.i(2, photo);
                }
                Control control = this.control;
                if (control != null) {
                    iF += y43.i(3, control);
                }
                Video video = this.video;
                if (video != null) {
                    iF += y43.i(4, video);
                }
                Audio audio = this.audio;
                if (audio != null) {
                    iF += y43.i(5, audio);
                }
                Sticker sticker = this.sticker;
                if (sticker != null) {
                    iF += y43.i(6, sticker);
                }
                Share share = this.share;
                if (share != null) {
                    iF += y43.i(7, share);
                }
                App app = this.app;
                if (app != null) {
                    iF += y43.i(8, app);
                }
                Call call = this.call;
                if (call != null) {
                    iF += y43.i(9, call);
                }
                int i2 = this.status;
                if (i2 != 0) {
                    iF += y43.f(10, i2);
                }
                long j = this.lastErrorTime;
                if (j != 0) {
                    iF += y43.h(11, j);
                }
                int i3 = this.progress;
                if (i3 != 0) {
                    iF += y43.f(12, i3);
                }
                if (!this.localId.equals("")) {
                    iF += y43.l(13, this.localId);
                }
                if (!this.localPath.equals("")) {
                    iF += y43.l(14, this.localPath);
                }
                if (this.isProcessingOnServer) {
                    iF += y43.a(15);
                }
                if (this.isDeleted) {
                    iF += y43.a(16);
                }
                long j2 = this.totalBytes;
                if (j2 != 0) {
                    iF += y43.h(17, j2);
                }
                long j3 = this.bytesDownloaded;
                if (j3 != 0) {
                    iF += y43.h(18, j3);
                }
                File file = this.file;
                if (file != null) {
                    iF += y43.i(20, file);
                }
                Contact contact = this.contact;
                if (contact != null) {
                    iF += y43.i(21, contact);
                }
                long j4 = this.lastModified;
                if (j4 != 0) {
                    iF += y43.h(22, j4);
                }
                Present present = this.present;
                if (present != null) {
                    iF += y43.i(23, present);
                }
                InlineKeyboard inlineKeyboard = this.inlineKeyboard;
                if (inlineKeyboard != null) {
                    iF += y43.i(24, inlineKeyboard);
                }
                Location location = this.location;
                if (location != null) {
                    iF += y43.i(25, location);
                }
                if (Float.floatToIntBits(this.progressFloat) != Float.floatToIntBits(0.0f)) {
                    iF += y43.e(26);
                }
                int i4 = this.processingOnServerStatus;
                if (i4 != 0) {
                    iF += y43.f(27, i4);
                }
                if (this.sensitiveContentUnlocked) {
                    iF += y43.a(28);
                }
                if (this.sensitive) {
                    iF += y43.a(29);
                }
                Widget widget = this.widget;
                return widget != null ? iF + y43.i(31, widget) : iF;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                int i = this.type;
                if (i != 0) {
                    y43Var.w(1, i);
                }
                Photo photo = this.photo;
                if (photo != null) {
                    y43Var.y(2, photo);
                }
                Control control = this.control;
                if (control != null) {
                    y43Var.y(3, control);
                }
                Video video = this.video;
                if (video != null) {
                    y43Var.y(4, video);
                }
                Audio audio = this.audio;
                if (audio != null) {
                    y43Var.y(5, audio);
                }
                Sticker sticker = this.sticker;
                if (sticker != null) {
                    y43Var.y(6, sticker);
                }
                Share share = this.share;
                if (share != null) {
                    y43Var.y(7, share);
                }
                App app = this.app;
                if (app != null) {
                    y43Var.y(8, app);
                }
                Call call = this.call;
                if (call != null) {
                    y43Var.y(9, call);
                }
                int i2 = this.status;
                if (i2 != 0) {
                    y43Var.w(10, i2);
                }
                long j = this.lastErrorTime;
                if (j != 0) {
                    y43Var.x(11, j);
                }
                int i3 = this.progress;
                if (i3 != 0) {
                    y43Var.w(12, i3);
                }
                if (!this.localId.equals("")) {
                    y43Var.E(13, this.localId);
                }
                if (!this.localPath.equals("")) {
                    y43Var.E(14, this.localPath);
                }
                boolean z = this.isProcessingOnServer;
                if (z) {
                    y43Var.r(15, z);
                }
                boolean z2 = this.isDeleted;
                if (z2) {
                    y43Var.r(16, z2);
                }
                long j2 = this.totalBytes;
                if (j2 != 0) {
                    y43Var.x(17, j2);
                }
                long j3 = this.bytesDownloaded;
                if (j3 != 0) {
                    y43Var.x(18, j3);
                }
                File file = this.file;
                if (file != null) {
                    y43Var.y(20, file);
                }
                Contact contact = this.contact;
                if (contact != null) {
                    y43Var.y(21, contact);
                }
                long j4 = this.lastModified;
                if (j4 != 0) {
                    y43Var.x(22, j4);
                }
                Present present = this.present;
                if (present != null) {
                    y43Var.y(23, present);
                }
                InlineKeyboard inlineKeyboard = this.inlineKeyboard;
                if (inlineKeyboard != null) {
                    y43Var.y(24, inlineKeyboard);
                }
                Location location = this.location;
                if (location != null) {
                    y43Var.y(25, location);
                }
                if (Float.floatToIntBits(this.progressFloat) != Float.floatToIntBits(0.0f)) {
                    y43Var.v(26, this.progressFloat);
                }
                int i4 = this.processingOnServerStatus;
                if (i4 != 0) {
                    y43Var.w(27, i4);
                }
                boolean z3 = this.sensitiveContentUnlocked;
                if (z3) {
                    y43Var.r(28, z3);
                }
                boolean z4 = this.sensitive;
                if (z4) {
                    y43Var.r(29, z4);
                }
                Widget widget = this.widget;
                if (widget != null) {
                    y43Var.y(31, widget);
                }
            }

            public static Attach parseFrom(x43 x43Var) throws IOException {
                return new Attach().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public Attach mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    switch (iS) {
                        case 0:
                            return this;
                        case 8:
                            int iP = x43Var.p();
                            switch (iP) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case PRESENT /* 12 */:
                                case 13:
                                case LOCATION /* 14 */:
                                case DAILY_MEDIA /* 15 */:
                                case 16:
                                    this.type = iP;
                                    break;
                            }
                        case 18:
                            if (this.photo == null) {
                                this.photo = new Photo();
                            }
                            x43Var.j(this.photo);
                            break;
                        case 26:
                            if (this.control == null) {
                                this.control = new Control();
                            }
                            x43Var.j(this.control);
                            break;
                        case 34:
                            if (this.video == null) {
                                this.video = new Video();
                            }
                            x43Var.j(this.video);
                            break;
                        case 42:
                            if (this.audio == null) {
                                this.audio = new Audio();
                            }
                            x43Var.j(this.audio);
                            break;
                        case 50:
                            if (this.sticker == null) {
                                this.sticker = new Sticker();
                            }
                            x43Var.j(this.sticker);
                            break;
                        case 58:
                            if (this.share == null) {
                                this.share = new Share();
                            }
                            x43Var.j(this.share);
                            break;
                        case 66:
                            if (this.app == null) {
                                this.app = new App();
                            }
                            x43Var.j(this.app);
                            break;
                        case 74:
                            if (this.call == null) {
                                this.call = new Call();
                            }
                            x43Var.j(this.call);
                            break;
                        case 80:
                            int iP2 = x43Var.p();
                            if (iP2 != 0 && iP2 != 1 && iP2 != 2 && iP2 != 3 && iP2 != 4) {
                                break;
                            } else {
                                this.status = iP2;
                                break;
                            }
                            break;
                        case 88:
                            this.lastErrorTime = x43Var.q();
                            break;
                        case 96:
                            this.progress = x43Var.p();
                            break;
                        case 106:
                            this.localId = x43Var.r();
                            break;
                        case 114:
                            this.localPath = x43Var.r();
                            break;
                        case 120:
                            this.isProcessingOnServer = x43Var.f();
                            break;
                        case 128:
                            this.isDeleted = x43Var.f();
                            break;
                        case 136:
                            this.totalBytes = x43Var.q();
                            break;
                        case 144:
                            this.bytesDownloaded = x43Var.q();
                            break;
                        case 162:
                            if (this.file == null) {
                                this.file = new File();
                            }
                            x43Var.j(this.file);
                            break;
                        case 170:
                            if (this.contact == null) {
                                this.contact = new Contact();
                            }
                            x43Var.j(this.contact);
                            break;
                        case 176:
                            this.lastModified = x43Var.q();
                            break;
                        case 186:
                            if (this.present == null) {
                                this.present = new Present();
                            }
                            x43Var.j(this.present);
                            break;
                        case 194:
                            if (this.inlineKeyboard == null) {
                                this.inlineKeyboard = new InlineKeyboard();
                            }
                            x43Var.j(this.inlineKeyboard);
                            break;
                        case HttpStatus.SC_ACCEPTED /* 202 */:
                            if (this.location == null) {
                                this.location = new Location();
                            }
                            x43Var.j(this.location);
                            break;
                        case 213:
                            this.progressFloat = x43Var.i();
                            break;
                        case 216:
                            int iP3 = x43Var.p();
                            if (iP3 != 0 && iP3 != 1 && iP3 != 2) {
                                break;
                            } else {
                                this.processingOnServerStatus = iP3;
                                break;
                            }
                            break;
                        case 224:
                            this.sensitiveContentUnlocked = x43Var.f();
                            break;
                        case 232:
                            this.sensitive = x43Var.f();
                            break;
                        case 250:
                            if (this.widget == null) {
                                this.widget = new Widget();
                            }
                            x43Var.j(this.widget);
                            break;
                        default:
                            if (!x43Var.u(iS)) {
                                return this;
                            }
                            break;
                    }
                }
            }
        }

        public static final class LocationInfo extends qw8 {
            private static volatile LocationInfo[] _emptyArray;
            public float accuracy;
            public double altitude;
            public float bearing;
            public double latitude;
            public double longitude;
            public float speed;
            public long time;

            public LocationInfo() {
                clear();
            }

            public static LocationInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LocationInfo[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static LocationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (LocationInfo) qw8.mergeFrom(new LocationInfo(), bArr);
            }

            public LocationInfo clear() {
                this.latitude = 0.0d;
                this.longitude = 0.0d;
                this.time = 0L;
                this.altitude = 0.0d;
                this.accuracy = 0.0f;
                this.bearing = 0.0f;
                this.speed = 0.0f;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                int iC = Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d) ? y43.c(1) : 0;
                if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                    iC += y43.c(2);
                }
                long j = this.time;
                if (j != 0) {
                    iC += y43.h(3, j);
                }
                if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                    iC += y43.c(4);
                }
                if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                    iC += y43.e(5);
                }
                if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                    iC += y43.e(6);
                }
                return Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f) ? iC + y43.e(7) : iC;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                if (Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d)) {
                    y43Var.t(1, this.latitude);
                }
                if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                    y43Var.t(2, this.longitude);
                }
                long j = this.time;
                if (j != 0) {
                    y43Var.x(3, j);
                }
                if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                    y43Var.t(4, this.altitude);
                }
                if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                    y43Var.v(5, this.accuracy);
                }
                if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                    y43Var.v(6, this.bearing);
                }
                if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f)) {
                    y43Var.v(7, this.speed);
                }
            }

            public static LocationInfo parseFrom(x43 x43Var) throws IOException {
                return new LocationInfo().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public LocationInfo mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 9) {
                        this.latitude = x43Var.h();
                    } else if (iS == 17) {
                        this.longitude = x43Var.h();
                    } else if (iS == 24) {
                        this.time = x43Var.q();
                    } else if (iS == 33) {
                        this.altitude = x43Var.h();
                    } else if (iS == 45) {
                        this.accuracy = x43Var.i();
                    } else if (iS == 53) {
                        this.bearing = x43Var.i();
                    } else if (iS == 61) {
                        this.speed = x43Var.i();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public Attaches() {
            clear();
        }

        public static Attaches[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Attaches[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Attaches parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Attaches) qw8.mergeFrom(new Attaches(), bArr);
        }

        public Attaches clear() {
            this.attach = Attach.emptyArray();
            this.keyboard = null;
            this.sendAction = null;
            this.replyKeyboard = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            Attach[] attachArr = this.attach;
            int i = 0;
            if (attachArr != null && attachArr.length > 0) {
                int i2 = 0;
                while (true) {
                    Attach[] attachArr2 = this.attach;
                    if (i >= attachArr2.length) {
                        break;
                    }
                    Attach attach = attachArr2[i];
                    if (attach != null) {
                        i2 = y43.i(1, attach) + i2;
                    }
                    i++;
                }
                i = i2;
            }
            Attach.InlineKeyboard inlineKeyboard = this.keyboard;
            if (inlineKeyboard != null) {
                i += y43.i(2, inlineKeyboard);
            }
            Attach.SendAction sendAction = this.sendAction;
            if (sendAction != null) {
                i += y43.i(3, sendAction);
            }
            Attach.ReplyKeyboard replyKeyboard = this.replyKeyboard;
            return replyKeyboard != null ? i + y43.i(4, replyKeyboard) : i;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            Attach[] attachArr = this.attach;
            if (attachArr != null && attachArr.length > 0) {
                int i = 0;
                while (true) {
                    Attach[] attachArr2 = this.attach;
                    if (i >= attachArr2.length) {
                        break;
                    }
                    Attach attach = attachArr2[i];
                    if (attach != null) {
                        y43Var.y(1, attach);
                    }
                    i++;
                }
            }
            Attach.InlineKeyboard inlineKeyboard = this.keyboard;
            if (inlineKeyboard != null) {
                y43Var.y(2, inlineKeyboard);
            }
            Attach.SendAction sendAction = this.sendAction;
            if (sendAction != null) {
                y43Var.y(3, sendAction);
            }
            Attach.ReplyKeyboard replyKeyboard = this.replyKeyboard;
            if (replyKeyboard != null) {
                y43Var.y(4, replyKeyboard);
            }
        }

        public static Attaches parseFrom(x43 x43Var) throws IOException {
            return new Attaches().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public Attaches mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 10) {
                    int iW = nd7.w(x43Var, 10);
                    Attach[] attachArr = this.attach;
                    int length = attachArr == null ? 0 : attachArr.length;
                    int i = iW + length;
                    Attach[] attachArr2 = new Attach[i];
                    if (length != 0) {
                        System.arraycopy(attachArr, 0, attachArr2, 0, length);
                    }
                    while (length < i - 1) {
                        Attach attach = new Attach();
                        attachArr2[length] = attach;
                        x43Var.j(attach);
                        x43Var.s();
                        length++;
                    }
                    Attach attach2 = new Attach();
                    attachArr2[length] = attach2;
                    x43Var.j(attach2);
                    this.attach = attachArr2;
                } else if (iS == 18) {
                    if (this.keyboard == null) {
                        this.keyboard = new Attach.InlineKeyboard();
                    }
                    x43Var.j(this.keyboard);
                } else if (iS == 26) {
                    if (this.sendAction == null) {
                        this.sendAction = new Attach.SendAction();
                    }
                    x43Var.j(this.sendAction);
                } else if (iS == 34) {
                    if (this.replyKeyboard == null) {
                        this.replyKeyboard = new Attach.ReplyKeyboard();
                    }
                    x43Var.j(this.replyKeyboard);
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class CallHistoryState extends qw8 {
        private static volatile CallHistoryState[] _emptyArray;
        public long backwardMarker;
        public Chat.Chunk chunk;
        public long forwardMarker;
        public boolean hasNext;
        public boolean hasPrev;
        public Map<Long, MissedMessagesItem> missedMessagesIds;

        public static final class MissedMessagesItem extends qw8 {
            private static volatile MissedMessagesItem[] _emptyArray;
            public long[] ids;

            public MissedMessagesItem() {
                clear();
            }

            public static MissedMessagesItem[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new MissedMessagesItem[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static MissedMessagesItem parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (MissedMessagesItem) qw8.mergeFrom(new MissedMessagesItem(), bArr);
            }

            public MissedMessagesItem clear() {
                this.ids = nd7.d;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                long[] jArr = this.ids;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int iK = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i >= jArr2.length) {
                        return iK + jArr2.length;
                    }
                    iK += y43.k(jArr2[i]);
                    i++;
                }
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                long[] jArr = this.ids;
                if (jArr == null || jArr.length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i >= jArr2.length) {
                        return;
                    }
                    y43Var.x(1, jArr2[i]);
                    i++;
                }
            }

            public static MissedMessagesItem parseFrom(x43 x43Var) throws IOException {
                return new MissedMessagesItem().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public MissedMessagesItem mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 8) {
                        int iW = nd7.w(x43Var, 8);
                        long[] jArr = this.ids;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iW + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = x43Var.q();
                            x43Var.s();
                            length++;
                        }
                        jArr2[length] = x43Var.q();
                        this.ids = jArr2;
                    } else if (iS == 10) {
                        int iE = x43Var.e(x43Var.p());
                        int iC = x43Var.c();
                        int i2 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.q();
                            i2++;
                        }
                        x43Var.t(iC);
                        long[] jArr3 = this.ids;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = x43Var.q();
                            length2++;
                        }
                        this.ids = jArr4;
                        x43Var.d(iE);
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public CallHistoryState() {
            clear();
        }

        public static CallHistoryState[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CallHistoryState[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static CallHistoryState parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CallHistoryState) qw8.mergeFrom(new CallHistoryState(), bArr);
        }

        public CallHistoryState clear() {
            this.chunk = null;
            this.forwardMarker = 0L;
            this.backwardMarker = 0L;
            this.hasNext = false;
            this.hasPrev = false;
            this.missedMessagesIds = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            Chat.Chunk chunk = this.chunk;
            int i = chunk != null ? y43.i(1, chunk) : 0;
            long j = this.forwardMarker;
            if (j != 0) {
                i += y43.h(2, j);
            }
            long j2 = this.backwardMarker;
            if (j2 != 0) {
                i += y43.h(3, j2);
            }
            if (this.hasNext) {
                i += y43.a(4);
            }
            if (this.hasPrev) {
                i += y43.a(5);
            }
            Map<Long, MissedMessagesItem> map = this.missedMessagesIds;
            return map != null ? i + y37.a(map, 6, 3, 11) : i;
        }

        @Override // defpackage.qw8
        public CallHistoryState mergeFrom(x43 x43Var) throws IOException {
            py7 py7Var = s36.d;
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 10) {
                    if (this.chunk == null) {
                        this.chunk = new Chat.Chunk();
                    }
                    x43Var.j(this.chunk);
                } else if (iS == 16) {
                    this.forwardMarker = x43Var.q();
                } else if (iS == 24) {
                    this.backwardMarker = x43Var.q();
                } else if (iS == 32) {
                    this.hasNext = x43Var.f();
                } else if (iS == 40) {
                    this.hasPrev = x43Var.f();
                } else if (iS == 50) {
                    this.missedMessagesIds = y37.b(x43Var, this.missedMessagesIds, py7Var, 3, 11, new MissedMessagesItem(), 8, 18);
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            Chat.Chunk chunk = this.chunk;
            if (chunk != null) {
                y43Var.y(1, chunk);
            }
            long j = this.forwardMarker;
            if (j != 0) {
                y43Var.x(2, j);
            }
            long j2 = this.backwardMarker;
            if (j2 != 0) {
                y43Var.x(3, j2);
            }
            boolean z = this.hasNext;
            if (z) {
                y43Var.r(4, z);
            }
            boolean z2 = this.hasPrev;
            if (z2) {
                y43Var.r(5, z2);
            }
            Map<Long, MissedMessagesItem> map = this.missedMessagesIds;
            if (map != null) {
                y37.d(y43Var, map, 6, 3, 11);
            }
        }

        public static CallHistoryState parseFrom(x43 x43Var) throws IOException {
            return new CallHistoryState().mergeFrom(x43Var);
        }
    }

    public static final class Chat extends qw8 {
        public static final int ACTIVE = 0;
        public static final int CHANGE_PARTICIPANT = 2;
        public static final int CHANNEL = 2;
        public static final int CHAT = 1;
        public static final int CLOSED = 5;
        public static final int DIALOG = 0;
        public static final int GROUP_CHAT = 3;
        public static final int HIDDEN = 6;
        public static final int ICON = 1;
        public static final int LEAVING = 2;
        public static final int LED = 2;
        public static final int LEFT = 1;
        public static final int PIN_MESSAGE = 3;
        public static final int PRIVATE = 1;
        public static final int PUBLIC = 0;
        public static final int REMOVED = 3;
        public static final int REMOVING = 4;
        public static final int SOUND = 0;
        public static final int TITLE = 0;
        public static final int VIBRATION = 1;
        private static volatile Chat[] _emptyArray;
        public int accessType;
        public Map<Long, AdminParticipant> adminParticipants;
        public long[] admins;
        public String baseIconUrl;
        public String baseRawIconUrl;
        public int blockedParticipantsCount;
        public BotsInfo botsInfo;
        public ChannelInfo channelInfo;
        public long[] chatFoldersIds;
        public ChatOptions chatOptions;
        public ChatSettings chatSettings;
        public ChatSubject chatSubject;
        public Chunk[] chunk;
        public long cid;
        public long created;
        public Chunk[] delayedChunk;
        public String description;
        public byte[] draft;
        public long draftUpdateTime;
        public long draftUpdateTimeForSyncLogic;
        public long firstMessageId;
        public int flagsSettings;
        public GroupChatInfo groupChatInfo;
        public boolean hidePinnedMessage;
        public long joinTime;
        public long lastDelayedUpdateTime;
        public long lastEventTime;
        public long lastFireDelayedErrorTime;
        public String lastInput;
        public long lastInputEditMessageId;
        public LastInputMedia[] lastInputMedia;
        public long lastInputReplyMessageId;
        public long lastMentionMessageId;
        public long lastMessageId;
        public long lastOpenNewMessages;
        public int lastOpenPositionOffset;
        public long lastOpenPositionTime;
        public long lastOpenReadMark;
        public PushMessage lastPushMessage;
        public long lastReactedMessageId;
        public String lastReaction;
        public long lastSearchClickTime;
        public long lastWriteTime;
        public String link;
        public Map<Long, Long> liveLocationMessageIds;
        public int[] localChanges;
        public boolean markedAsUnread;
        public ChatMedia mediaAll;
        public ChatMedia mediaAudio;
        public ChatMedia mediaFiles;
        public ChatMedia mediaLocations;
        public ChatMedia mediaMusic;
        public ChatMedia mediaPhotoVideo;
        public ChatMedia mediaShare;
        public int messagesTtlSec;
        public long modified;
        public int newMessages;
        public long owner;
        public Map<Long, Long> participants;
        public int participantsCount;
        public long pinnedMessageId;
        public int restrictions;
        public Section[] sections;
        public long serverId;
        public int status;
        public String[] stickersOrder;
        public long stickersSyncTime;
        public boolean subscribedToUpdates;
        public String title;
        public int type;
        public long unbindOkPanelCloseTime;
        public boolean unreadPin;
        public boolean unreadReply;
        public VideoConversation videoConversation;

        public static final class AdminParticipant extends qw8 {
            private static volatile AdminParticipant[] _emptyArray;
            public String alias;
            public long id;
            public long inviterId;
            public int permissions;

            public AdminParticipant() {
                clear();
            }

            public static AdminParticipant[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new AdminParticipant[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static AdminParticipant parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (AdminParticipant) qw8.mergeFrom(new AdminParticipant(), bArr);
            }

            public AdminParticipant clear() {
                this.id = 0L;
                this.permissions = 0;
                this.inviterId = 0L;
                this.alias = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                long j = this.id;
                int iH = j != 0 ? y43.h(1, j) : 0;
                int i = this.permissions;
                if (i != 0) {
                    iH += y43.f(2, i);
                }
                long j2 = this.inviterId;
                if (j2 != 0) {
                    iH += y43.h(3, j2);
                }
                return !this.alias.equals("") ? iH + y43.l(4, this.alias) : iH;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                long j = this.id;
                if (j != 0) {
                    y43Var.x(1, j);
                }
                int i = this.permissions;
                if (i != 0) {
                    y43Var.w(2, i);
                }
                long j2 = this.inviterId;
                if (j2 != 0) {
                    y43Var.x(3, j2);
                }
                if (this.alias.equals("")) {
                    return;
                }
                y43Var.E(4, this.alias);
            }

            public static AdminParticipant parseFrom(x43 x43Var) throws IOException {
                return new AdminParticipant().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public AdminParticipant mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 8) {
                        this.id = x43Var.q();
                    } else if (iS == 16) {
                        this.permissions = x43Var.p();
                    } else if (iS == 24) {
                        this.inviterId = x43Var.q();
                    } else if (iS == 34) {
                        this.alias = x43Var.r();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public static final class BotsInfo extends qw8 {
            private static volatile BotsInfo[] _emptyArray;
            public boolean hasBots;
            public boolean suspendedBot;

            public BotsInfo() {
                clear();
            }

            public static BotsInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new BotsInfo[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static BotsInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (BotsInfo) qw8.mergeFrom(new BotsInfo(), bArr);
            }

            public BotsInfo clear() {
                this.hasBots = false;
                this.suspendedBot = false;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                int iA = this.hasBots ? y43.a(1) : 0;
                return this.suspendedBot ? iA + y43.a(2) : iA;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                boolean z = this.hasBots;
                if (z) {
                    y43Var.r(1, z);
                }
                boolean z2 = this.suspendedBot;
                if (z2) {
                    y43Var.r(2, z2);
                }
            }

            public static BotsInfo parseFrom(x43 x43Var) throws IOException {
                return new BotsInfo().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public BotsInfo mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 8) {
                        this.hasBots = x43Var.f();
                    } else if (iS == 16) {
                        this.suspendedBot = x43Var.f();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChannelInfo extends qw8 {
            private static volatile ChannelInfo[] _emptyArray;
            public long[] admins;
            public String description;
            public int membersCount;
            public boolean signAdmin;

            public ChannelInfo() {
                clear();
            }

            public static ChannelInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChannelInfo[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChannelInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChannelInfo) qw8.mergeFrom(new ChannelInfo(), bArr);
            }

            public ChannelInfo clear() {
                this.membersCount = 0;
                this.description = "";
                this.admins = nd7.d;
                this.signAdmin = false;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                long[] jArr;
                int i = this.membersCount;
                int i2 = 0;
                int iF = i != 0 ? y43.f(1, i) : 0;
                if (!this.description.equals("")) {
                    iF += y43.l(2, this.description);
                }
                long[] jArr2 = this.admins;
                if (jArr2 != null && jArr2.length > 0) {
                    int iK = 0;
                    while (true) {
                        jArr = this.admins;
                        if (i2 >= jArr.length) {
                            break;
                        }
                        iK += y43.k(jArr[i2]);
                        i2++;
                    }
                    iF = iF + iK + jArr.length;
                }
                return this.signAdmin ? iF + y43.a(4) : iF;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                int i = this.membersCount;
                if (i != 0) {
                    y43Var.w(1, i);
                }
                if (!this.description.equals("")) {
                    y43Var.E(2, this.description);
                }
                long[] jArr = this.admins;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.admins;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        y43Var.x(3, jArr2[i2]);
                        i2++;
                    }
                }
                boolean z = this.signAdmin;
                if (z) {
                    y43Var.r(4, z);
                }
            }

            public static ChannelInfo parseFrom(x43 x43Var) throws IOException {
                return new ChannelInfo().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public ChannelInfo mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 8) {
                        this.membersCount = x43Var.p();
                    } else if (iS == 18) {
                        this.description = x43Var.r();
                    } else if (iS == 24) {
                        int iW = nd7.w(x43Var, 24);
                        long[] jArr = this.admins;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iW + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = x43Var.q();
                            x43Var.s();
                            length++;
                        }
                        jArr2[length] = x43Var.q();
                        this.admins = jArr2;
                    } else if (iS == 26) {
                        int iE = x43Var.e(x43Var.p());
                        int iC = x43Var.c();
                        int i2 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.q();
                            i2++;
                        }
                        x43Var.t(iC);
                        long[] jArr3 = this.admins;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = x43Var.q();
                            length2++;
                        }
                        this.admins = jArr4;
                        x43Var.d(iE);
                    } else if (iS == 32) {
                        this.signAdmin = x43Var.f();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChatMedia extends qw8 {
            private static volatile ChatMedia[] _emptyArray;
            public Chunk chunk;
            public Chunk[] chunks;
            public long firstMessageId;
            public long lastMessageId;
            public int totalCount;

            public ChatMedia() {
                clear();
            }

            public static ChatMedia[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatMedia[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatMedia parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatMedia) qw8.mergeFrom(new ChatMedia(), bArr);
            }

            public ChatMedia clear() {
                this.chunk = null;
                this.totalCount = 0;
                this.firstMessageId = 0L;
                this.lastMessageId = 0L;
                this.chunks = Chunk.emptyArray();
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                Chunk chunk = this.chunk;
                int i = 0;
                int i2 = chunk != null ? y43.i(1, chunk) : 0;
                int i3 = this.totalCount;
                if (i3 != 0) {
                    i2 += y43.f(2, i3);
                }
                long j = this.firstMessageId;
                if (j != 0) {
                    i2 += y43.h(3, j);
                }
                long j2 = this.lastMessageId;
                if (j2 != 0) {
                    i2 += y43.h(4, j2);
                }
                Chunk[] chunkArr = this.chunks;
                if (chunkArr != null && chunkArr.length > 0) {
                    while (true) {
                        Chunk[] chunkArr2 = this.chunks;
                        if (i >= chunkArr2.length) {
                            break;
                        }
                        Chunk chunk2 = chunkArr2[i];
                        if (chunk2 != null) {
                            i2 = y43.i(5, chunk2) + i2;
                        }
                        i++;
                    }
                }
                return i2;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                Chunk chunk = this.chunk;
                if (chunk != null) {
                    y43Var.y(1, chunk);
                }
                int i = this.totalCount;
                if (i != 0) {
                    y43Var.w(2, i);
                }
                long j = this.firstMessageId;
                if (j != 0) {
                    y43Var.x(3, j);
                }
                long j2 = this.lastMessageId;
                if (j2 != 0) {
                    y43Var.x(4, j2);
                }
                Chunk[] chunkArr = this.chunks;
                if (chunkArr == null || chunkArr.length <= 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    Chunk[] chunkArr2 = this.chunks;
                    if (i2 >= chunkArr2.length) {
                        return;
                    }
                    Chunk chunk2 = chunkArr2[i2];
                    if (chunk2 != null) {
                        y43Var.y(5, chunk2);
                    }
                    i2++;
                }
            }

            public static ChatMedia parseFrom(x43 x43Var) throws IOException {
                return new ChatMedia().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public ChatMedia mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 10) {
                        if (this.chunk == null) {
                            this.chunk = new Chunk();
                        }
                        x43Var.j(this.chunk);
                    } else if (iS == 16) {
                        this.totalCount = x43Var.p();
                    } else if (iS == 24) {
                        this.firstMessageId = x43Var.q();
                    } else if (iS == 32) {
                        this.lastMessageId = x43Var.q();
                    } else if (iS == 42) {
                        int iW = nd7.w(x43Var, 42);
                        Chunk[] chunkArr = this.chunks;
                        int length = chunkArr == null ? 0 : chunkArr.length;
                        int i = iW + length;
                        Chunk[] chunkArr2 = new Chunk[i];
                        if (length != 0) {
                            System.arraycopy(chunkArr, 0, chunkArr2, 0, length);
                        }
                        while (length < i - 1) {
                            Chunk chunk = new Chunk();
                            chunkArr2[length] = chunk;
                            x43Var.j(chunk);
                            x43Var.s();
                            length++;
                        }
                        Chunk chunk2 = new Chunk();
                        chunkArr2[length] = chunk2;
                        x43Var.j(chunk2);
                        this.chunks = chunkArr2;
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChatOptions extends qw8 {
            private static volatile ChatOptions[] _emptyArray;
            public boolean allCanPinMessage;
            public boolean membersCanSeePrivateLink;
            public boolean official;
            public boolean onlyAdminCanAddMember;
            public boolean onlyAdminCanCall;
            public boolean onlyOwnerCanChangeIconTitle;
            public boolean sentByPhone;
            public boolean serviceChat;
            public boolean signAdmin;

            public ChatOptions() {
                clear();
            }

            public static ChatOptions[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatOptions[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatOptions) qw8.mergeFrom(new ChatOptions(), bArr);
            }

            public ChatOptions clear() {
                this.signAdmin = false;
                this.onlyOwnerCanChangeIconTitle = false;
                this.official = false;
                this.allCanPinMessage = false;
                this.onlyAdminCanAddMember = false;
                this.onlyAdminCanCall = false;
                this.sentByPhone = false;
                this.serviceChat = false;
                this.membersCanSeePrivateLink = false;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                int iA = this.signAdmin ? y43.a(1) : 0;
                if (this.onlyOwnerCanChangeIconTitle) {
                    iA += y43.a(2);
                }
                if (this.official) {
                    iA += y43.a(3);
                }
                if (this.allCanPinMessage) {
                    iA += y43.a(4);
                }
                if (this.onlyAdminCanAddMember) {
                    iA += y43.a(5);
                }
                if (this.onlyAdminCanCall) {
                    iA += y43.a(7);
                }
                if (this.sentByPhone) {
                    iA += y43.a(8);
                }
                if (this.serviceChat) {
                    iA += y43.a(9);
                }
                return this.membersCanSeePrivateLink ? iA + y43.a(10) : iA;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                boolean z = this.signAdmin;
                if (z) {
                    y43Var.r(1, z);
                }
                boolean z2 = this.onlyOwnerCanChangeIconTitle;
                if (z2) {
                    y43Var.r(2, z2);
                }
                boolean z3 = this.official;
                if (z3) {
                    y43Var.r(3, z3);
                }
                boolean z4 = this.allCanPinMessage;
                if (z4) {
                    y43Var.r(4, z4);
                }
                boolean z5 = this.onlyAdminCanAddMember;
                if (z5) {
                    y43Var.r(5, z5);
                }
                boolean z6 = this.onlyAdminCanCall;
                if (z6) {
                    y43Var.r(7, z6);
                }
                boolean z7 = this.sentByPhone;
                if (z7) {
                    y43Var.r(8, z7);
                }
                boolean z8 = this.serviceChat;
                if (z8) {
                    y43Var.r(9, z8);
                }
                boolean z9 = this.membersCanSeePrivateLink;
                if (z9) {
                    y43Var.r(10, z9);
                }
            }

            public static ChatOptions parseFrom(x43 x43Var) throws IOException {
                return new ChatOptions().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public ChatOptions mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 8) {
                        this.signAdmin = x43Var.f();
                    } else if (iS == 16) {
                        this.onlyOwnerCanChangeIconTitle = x43Var.f();
                    } else if (iS == 24) {
                        this.official = x43Var.f();
                    } else if (iS == 32) {
                        this.allCanPinMessage = x43Var.f();
                    } else if (iS == 40) {
                        this.onlyAdminCanAddMember = x43Var.f();
                    } else if (iS == 56) {
                        this.onlyAdminCanCall = x43Var.f();
                    } else if (iS == 64) {
                        this.sentByPhone = x43Var.f();
                    } else if (iS == 72) {
                        this.serviceChat = x43Var.f();
                    } else if (iS == 80) {
                        this.membersCanSeePrivateLink = x43Var.f();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChatSettings extends qw8 {
            private static volatile ChatSettings[] _emptyArray;
            public long dontDisturbUntil;
            public long favoriteIndex;
            public boolean hideLiveLocationPanel;
            public long hideLiveLocationPanelBeforeTime;
            public long hideMyLiveLocationPanelBeforeTime;
            public long lastNotifMark;
            public long lastNotifMessageId;
            public int[] options;

            public ChatSettings() {
                clear();
            }

            public static ChatSettings[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatSettings[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatSettings) qw8.mergeFrom(new ChatSettings(), bArr);
            }

            public ChatSettings clear() {
                this.dontDisturbUntil = 0L;
                this.options = nd7.c;
                this.lastNotifMark = 0L;
                this.favoriteIndex = 0L;
                this.hideLiveLocationPanel = false;
                this.hideMyLiveLocationPanelBeforeTime = 0L;
                this.hideLiveLocationPanelBeforeTime = 0L;
                this.lastNotifMessageId = 0L;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                int[] iArr;
                long j = this.dontDisturbUntil;
                int i = 0;
                int iH = j != 0 ? y43.h(1, j) : 0;
                int[] iArr2 = this.options;
                if (iArr2 != null && iArr2.length > 0) {
                    int iG = 0;
                    while (true) {
                        iArr = this.options;
                        if (i >= iArr.length) {
                            break;
                        }
                        iG += y43.g(iArr[i]);
                        i++;
                    }
                    iH = iH + iG + iArr.length;
                }
                long j2 = this.lastNotifMark;
                if (j2 != 0) {
                    iH += y43.h(3, j2);
                }
                long j3 = this.favoriteIndex;
                if (j3 != 0) {
                    iH += y43.h(4, j3);
                }
                if (this.hideLiveLocationPanel) {
                    iH += y43.a(6);
                }
                long j4 = this.hideMyLiveLocationPanelBeforeTime;
                if (j4 != 0) {
                    iH += y43.h(7, j4);
                }
                long j5 = this.hideLiveLocationPanelBeforeTime;
                if (j5 != 0) {
                    iH += y43.h(8, j5);
                }
                long j6 = this.lastNotifMessageId;
                return j6 != 0 ? iH + y43.h(9, j6) : iH;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                long j = this.dontDisturbUntil;
                if (j != 0) {
                    y43Var.x(1, j);
                }
                int[] iArr = this.options;
                if (iArr != null && iArr.length > 0) {
                    int i = 0;
                    while (true) {
                        int[] iArr2 = this.options;
                        if (i >= iArr2.length) {
                            break;
                        }
                        y43Var.w(2, iArr2[i]);
                        i++;
                    }
                }
                long j2 = this.lastNotifMark;
                if (j2 != 0) {
                    y43Var.x(3, j2);
                }
                long j3 = this.favoriteIndex;
                if (j3 != 0) {
                    y43Var.x(4, j3);
                }
                boolean z = this.hideLiveLocationPanel;
                if (z) {
                    y43Var.r(6, z);
                }
                long j4 = this.hideMyLiveLocationPanelBeforeTime;
                if (j4 != 0) {
                    y43Var.x(7, j4);
                }
                long j5 = this.hideLiveLocationPanelBeforeTime;
                if (j5 != 0) {
                    y43Var.x(8, j5);
                }
                long j6 = this.lastNotifMessageId;
                if (j6 != 0) {
                    y43Var.x(9, j6);
                }
            }

            public static ChatSettings parseFrom(x43 x43Var) throws IOException {
                return new ChatSettings().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public ChatSettings mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 8) {
                        this.dontDisturbUntil = x43Var.q();
                    } else if (iS == 16) {
                        int iW = nd7.w(x43Var, 16);
                        int[] iArr = new int[iW];
                        int i = 0;
                        for (int i2 = 0; i2 < iW; i2++) {
                            if (i2 != 0) {
                                x43Var.s();
                            }
                            int iP = x43Var.p();
                            if (iP == 0 || iP == 1 || iP == 2) {
                                iArr[i] = iP;
                                i++;
                            }
                        }
                        if (i != 0) {
                            int[] iArr2 = this.options;
                            int length = iArr2 == null ? 0 : iArr2.length;
                            if (length == 0 && i == iW) {
                                this.options = iArr;
                            } else {
                                int[] iArr3 = new int[length + i];
                                if (length != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length);
                                }
                                System.arraycopy(iArr, 0, iArr3, length, i);
                                this.options = iArr3;
                            }
                        }
                    } else if (iS == 18) {
                        int iE = x43Var.e(x43Var.p());
                        int iC = x43Var.c();
                        int i3 = 0;
                        while (x43Var.b() > 0) {
                            int iP2 = x43Var.p();
                            if (iP2 == 0 || iP2 == 1 || iP2 == 2) {
                                i3++;
                            }
                        }
                        if (i3 != 0) {
                            x43Var.t(iC);
                            int[] iArr4 = this.options;
                            int length2 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[i3 + length2];
                            if (length2 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length2);
                            }
                            while (x43Var.b() > 0) {
                                int iP3 = x43Var.p();
                                if (iP3 == 0 || iP3 == 1 || iP3 == 2) {
                                    iArr5[length2] = iP3;
                                    length2++;
                                }
                            }
                            this.options = iArr5;
                        }
                        x43Var.d(iE);
                    } else if (iS == 24) {
                        this.lastNotifMark = x43Var.q();
                    } else if (iS == 32) {
                        this.favoriteIndex = x43Var.q();
                    } else if (iS == 48) {
                        this.hideLiveLocationPanel = x43Var.f();
                    } else if (iS == 56) {
                        this.hideMyLiveLocationPanelBeforeTime = x43Var.q();
                    } else if (iS == 64) {
                        this.hideLiveLocationPanelBeforeTime = x43Var.q();
                    } else if (iS == 72) {
                        this.lastNotifMessageId = x43Var.q();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChatSubject extends qw8 {
            private static volatile ChatSubject[] _emptyArray;
            public long[] organizationIds;

            public ChatSubject() {
                clear();
            }

            public static ChatSubject[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatSubject[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatSubject parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatSubject) qw8.mergeFrom(new ChatSubject(), bArr);
            }

            public ChatSubject clear() {
                this.organizationIds = nd7.d;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                long[] jArr = this.organizationIds;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int iK = 0;
                while (true) {
                    long[] jArr2 = this.organizationIds;
                    if (i >= jArr2.length) {
                        return iK + jArr2.length;
                    }
                    iK += y43.k(jArr2[i]);
                    i++;
                }
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                long[] jArr = this.organizationIds;
                if (jArr == null || jArr.length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    long[] jArr2 = this.organizationIds;
                    if (i >= jArr2.length) {
                        return;
                    }
                    y43Var.x(1, jArr2[i]);
                    i++;
                }
            }

            public static ChatSubject parseFrom(x43 x43Var) throws IOException {
                return new ChatSubject().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public ChatSubject mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 8) {
                        int iW = nd7.w(x43Var, 8);
                        long[] jArr = this.organizationIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iW + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = x43Var.q();
                            x43Var.s();
                            length++;
                        }
                        jArr2[length] = x43Var.q();
                        this.organizationIds = jArr2;
                    } else if (iS == 10) {
                        int iE = x43Var.e(x43Var.p());
                        int iC = x43Var.c();
                        int i2 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.q();
                            i2++;
                        }
                        x43Var.t(iC);
                        long[] jArr3 = this.organizationIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = x43Var.q();
                            length2++;
                        }
                        this.organizationIds = jArr4;
                        x43Var.d(iE);
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public static final class Chunk extends qw8 {
            private static volatile Chunk[] _emptyArray;
            public long endTime;
            public long startTime;

            public Chunk() {
                clear();
            }

            public static Chunk[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Chunk[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static Chunk parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Chunk) qw8.mergeFrom(new Chunk(), bArr);
            }

            public Chunk clear() {
                this.startTime = 0L;
                this.endTime = 0L;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                long j = this.startTime;
                int iH = j != 0 ? y43.h(1, j) : 0;
                long j2 = this.endTime;
                return j2 != 0 ? iH + y43.h(2, j2) : iH;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                long j = this.startTime;
                if (j != 0) {
                    y43Var.x(1, j);
                }
                long j2 = this.endTime;
                if (j2 != 0) {
                    y43Var.x(2, j2);
                }
            }

            public static Chunk parseFrom(x43 x43Var) throws IOException {
                return new Chunk().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public Chunk mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 8) {
                        this.startTime = x43Var.q();
                    } else if (iS == 16) {
                        this.endTime = x43Var.q();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public static final class GroupChatInfo extends qw8 {
            public static final int ALL = 2;
            public static final int DISABLED = 0;
            public static final int MEMBERS = 1;
            private static volatile GroupChatInfo[] _emptyArray;
            public String baseIconUrl;
            public long groupId;
            public GroupOptions groupOptions;
            public boolean isAnswered;
            public boolean isCustomTitle;
            public boolean isImportant;
            public boolean isMember;
            public boolean isModerator;
            public int messagingPermissions;
            public String name;

            public static final class GroupOptions extends qw8 {
                private static volatile GroupOptions[] _emptyArray;
                public boolean groupPremium;

                public GroupOptions() {
                    clear();
                }

                public static GroupOptions[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (y37.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new GroupOptions[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static GroupOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (GroupOptions) qw8.mergeFrom(new GroupOptions(), bArr);
                }

                public GroupOptions clear() {
                    this.groupPremium = false;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.qw8
                public int computeSerializedSize() {
                    if (this.groupPremium) {
                        return y43.a(1);
                    }
                    return 0;
                }

                @Override // defpackage.qw8
                public void writeTo(y43 y43Var) throws IOException {
                    boolean z = this.groupPremium;
                    if (z) {
                        y43Var.r(1, z);
                    }
                }

                public static GroupOptions parseFrom(x43 x43Var) throws IOException {
                    return new GroupOptions().mergeFrom(x43Var);
                }

                @Override // defpackage.qw8
                public GroupOptions mergeFrom(x43 x43Var) throws IOException {
                    while (true) {
                        int iS = x43Var.s();
                        if (iS == 0) {
                            return this;
                        }
                        if (iS == 8) {
                            this.groupPremium = x43Var.f();
                        } else if (!x43Var.u(iS)) {
                            return this;
                        }
                    }
                }
            }

            public GroupChatInfo() {
                clear();
            }

            public static GroupChatInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new GroupChatInfo[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static GroupChatInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (GroupChatInfo) qw8.mergeFrom(new GroupChatInfo(), bArr);
            }

            public GroupChatInfo clear() {
                this.groupId = 0L;
                this.isAnswered = false;
                this.isModerator = false;
                this.isImportant = false;
                this.name = "";
                this.baseIconUrl = "";
                this.isCustomTitle = false;
                this.isMember = false;
                this.messagingPermissions = 0;
                this.groupOptions = null;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                long j = this.groupId;
                int iH = j != 0 ? y43.h(1, j) : 0;
                if (this.isAnswered) {
                    iH += y43.a(2);
                }
                if (this.isModerator) {
                    iH += y43.a(3);
                }
                if (this.isImportant) {
                    iH += y43.a(4);
                }
                if (!this.name.equals("")) {
                    iH += y43.l(5, this.name);
                }
                if (!this.baseIconUrl.equals("")) {
                    iH += y43.l(6, this.baseIconUrl);
                }
                if (this.isCustomTitle) {
                    iH += y43.a(7);
                }
                if (this.isMember) {
                    iH += y43.a(8);
                }
                int i = this.messagingPermissions;
                if (i != 0) {
                    iH += y43.f(9, i);
                }
                GroupOptions groupOptions = this.groupOptions;
                return groupOptions != null ? iH + y43.i(10, groupOptions) : iH;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                long j = this.groupId;
                if (j != 0) {
                    y43Var.x(1, j);
                }
                boolean z = this.isAnswered;
                if (z) {
                    y43Var.r(2, z);
                }
                boolean z2 = this.isModerator;
                if (z2) {
                    y43Var.r(3, z2);
                }
                boolean z3 = this.isImportant;
                if (z3) {
                    y43Var.r(4, z3);
                }
                if (!this.name.equals("")) {
                    y43Var.E(5, this.name);
                }
                if (!this.baseIconUrl.equals("")) {
                    y43Var.E(6, this.baseIconUrl);
                }
                boolean z4 = this.isCustomTitle;
                if (z4) {
                    y43Var.r(7, z4);
                }
                boolean z5 = this.isMember;
                if (z5) {
                    y43Var.r(8, z5);
                }
                int i = this.messagingPermissions;
                if (i != 0) {
                    y43Var.w(9, i);
                }
                GroupOptions groupOptions = this.groupOptions;
                if (groupOptions != null) {
                    y43Var.y(10, groupOptions);
                }
            }

            public static GroupChatInfo parseFrom(x43 x43Var) throws IOException {
                return new GroupChatInfo().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public GroupChatInfo mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    switch (iS) {
                        case 0:
                            return this;
                        case 8:
                            this.groupId = x43Var.q();
                            break;
                        case 16:
                            this.isAnswered = x43Var.f();
                            break;
                        case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                            this.isModerator = x43Var.f();
                            break;
                        case 32:
                            this.isImportant = x43Var.f();
                            break;
                        case 42:
                            this.name = x43Var.r();
                            break;
                        case 50:
                            this.baseIconUrl = x43Var.r();
                            break;
                        case 56:
                            this.isCustomTitle = x43Var.f();
                            break;
                        case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                            this.isMember = x43Var.f();
                            break;
                        case 72:
                            int iP = x43Var.p();
                            if (iP != 0 && iP != 1 && iP != 2) {
                                break;
                            } else {
                                this.messagingPermissions = iP;
                                break;
                            }
                            break;
                        case 82:
                            if (this.groupOptions == null) {
                                this.groupOptions = new GroupOptions();
                            }
                            x43Var.j(this.groupOptions);
                            break;
                        default:
                            if (!x43Var.u(iS)) {
                                return this;
                            }
                            break;
                    }
                }
            }
        }

        public static final class LastInputMedia extends qw8 {
            private static volatile LastInputMedia[] _emptyArray;
            public String attachLocalId;
            public long dateModified;
            public String editedUri;
            public String mimeType;
            public long originalDuration;
            public long originalId;
            public int originalOrientation;
            public String originalUri;
            public String thumbnailUri;
            public int type;
            public int[] wave;

            public LastInputMedia() {
                clear();
            }

            public static LastInputMedia[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LastInputMedia[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static LastInputMedia parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (LastInputMedia) qw8.mergeFrom(new LastInputMedia(), bArr);
            }

            public LastInputMedia clear() {
                this.originalId = 0L;
                this.originalUri = "";
                this.thumbnailUri = "";
                this.originalOrientation = 0;
                this.originalDuration = 0L;
                this.mimeType = "";
                this.dateModified = 0L;
                this.editedUri = "";
                this.type = 0;
                this.wave = nd7.c;
                this.attachLocalId = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                int[] iArr;
                long j = this.originalId;
                int i = 0;
                int iH = j != 0 ? y43.h(1, j) : 0;
                if (!this.originalUri.equals("")) {
                    iH += y43.l(2, this.originalUri);
                }
                if (!this.thumbnailUri.equals("")) {
                    iH += y43.l(3, this.thumbnailUri);
                }
                int i2 = this.originalOrientation;
                if (i2 != 0) {
                    iH += y43.f(4, i2);
                }
                long j2 = this.originalDuration;
                if (j2 != 0) {
                    iH += y43.h(5, j2);
                }
                if (!this.mimeType.equals("")) {
                    iH += y43.l(6, this.mimeType);
                }
                long j3 = this.dateModified;
                if (j3 != 0) {
                    iH += y43.h(7, j3);
                }
                if (!this.editedUri.equals("")) {
                    iH += y43.l(8, this.editedUri);
                }
                int i3 = this.type;
                if (i3 != 0) {
                    iH += y43.f(9, i3);
                }
                int[] iArr2 = this.wave;
                if (iArr2 != null && iArr2.length > 0) {
                    int iG = 0;
                    while (true) {
                        iArr = this.wave;
                        if (i >= iArr.length) {
                            break;
                        }
                        iG += y43.g(iArr[i]);
                        i++;
                    }
                    iH = iH + iG + iArr.length;
                }
                return !this.attachLocalId.equals("") ? iH + y43.l(12, this.attachLocalId) : iH;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                long j = this.originalId;
                if (j != 0) {
                    y43Var.x(1, j);
                }
                if (!this.originalUri.equals("")) {
                    y43Var.E(2, this.originalUri);
                }
                if (!this.thumbnailUri.equals("")) {
                    y43Var.E(3, this.thumbnailUri);
                }
                int i = this.originalOrientation;
                if (i != 0) {
                    y43Var.w(4, i);
                }
                long j2 = this.originalDuration;
                if (j2 != 0) {
                    y43Var.x(5, j2);
                }
                if (!this.mimeType.equals("")) {
                    y43Var.E(6, this.mimeType);
                }
                long j3 = this.dateModified;
                if (j3 != 0) {
                    y43Var.x(7, j3);
                }
                if (!this.editedUri.equals("")) {
                    y43Var.E(8, this.editedUri);
                }
                int i2 = this.type;
                if (i2 != 0) {
                    y43Var.w(9, i2);
                }
                int[] iArr = this.wave;
                if (iArr != null && iArr.length > 0) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr2 = this.wave;
                        if (i3 >= iArr2.length) {
                            break;
                        }
                        y43Var.w(11, iArr2[i3]);
                        i3++;
                    }
                }
                if (this.attachLocalId.equals("")) {
                    return;
                }
                y43Var.E(12, this.attachLocalId);
            }

            public static LastInputMedia parseFrom(x43 x43Var) throws IOException {
                return new LastInputMedia().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public LastInputMedia mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    switch (iS) {
                        case 0:
                            return this;
                        case 8:
                            this.originalId = x43Var.q();
                            break;
                        case 18:
                            this.originalUri = x43Var.r();
                            break;
                        case 26:
                            this.thumbnailUri = x43Var.r();
                            break;
                        case 32:
                            this.originalOrientation = x43Var.p();
                            break;
                        case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                            this.originalDuration = x43Var.q();
                            break;
                        case 50:
                            this.mimeType = x43Var.r();
                            break;
                        case 56:
                            this.dateModified = x43Var.q();
                            break;
                        case 66:
                            this.editedUri = x43Var.r();
                            break;
                        case 72:
                            this.type = x43Var.p();
                            break;
                        case 88:
                            int iW = nd7.w(x43Var, 88);
                            int[] iArr = this.wave;
                            int length = iArr == null ? 0 : iArr.length;
                            int i = iW + length;
                            int[] iArr2 = new int[i];
                            if (length != 0) {
                                System.arraycopy(iArr, 0, iArr2, 0, length);
                            }
                            while (length < i - 1) {
                                iArr2[length] = x43Var.p();
                                x43Var.s();
                                length++;
                            }
                            iArr2[length] = x43Var.p();
                            this.wave = iArr2;
                            break;
                        case 90:
                            int iE = x43Var.e(x43Var.p());
                            int iC = x43Var.c();
                            int i2 = 0;
                            while (x43Var.b() > 0) {
                                x43Var.p();
                                i2++;
                            }
                            x43Var.t(iC);
                            int[] iArr3 = this.wave;
                            int length2 = iArr3 == null ? 0 : iArr3.length;
                            int i3 = i2 + length2;
                            int[] iArr4 = new int[i3];
                            if (length2 != 0) {
                                System.arraycopy(iArr3, 0, iArr4, 0, length2);
                            }
                            while (length2 < i3) {
                                iArr4[length2] = x43Var.p();
                                length2++;
                            }
                            this.wave = iArr4;
                            x43Var.d(iE);
                            break;
                        case 98:
                            this.attachLocalId = x43Var.r();
                            break;
                        default:
                            if (!x43Var.u(iS)) {
                                return this;
                            }
                            break;
                    }
                }
            }
        }

        public static final class PushMessage extends qw8 {
            private static volatile PushMessage[] _emptyArray;
            public long id;
            public String text;
            public long time;

            public PushMessage() {
                clear();
            }

            public static PushMessage[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new PushMessage[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static PushMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (PushMessage) qw8.mergeFrom(new PushMessage(), bArr);
            }

            public PushMessage clear() {
                this.id = 0L;
                this.time = 0L;
                this.text = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                long j = this.id;
                int iH = j != 0 ? y43.h(1, j) : 0;
                long j2 = this.time;
                if (j2 != 0) {
                    iH += y43.h(2, j2);
                }
                return !this.text.equals("") ? iH + y43.l(3, this.text) : iH;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                long j = this.id;
                if (j != 0) {
                    y43Var.x(1, j);
                }
                long j2 = this.time;
                if (j2 != 0) {
                    y43Var.x(2, j2);
                }
                if (this.text.equals("")) {
                    return;
                }
                y43Var.E(3, this.text);
            }

            public static PushMessage parseFrom(x43 x43Var) throws IOException {
                return new PushMessage().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public PushMessage mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 8) {
                        this.id = x43Var.q();
                    } else if (iS == 16) {
                        this.time = x43Var.q();
                    } else if (iS == 26) {
                        this.text = x43Var.r();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public static final class Section extends qw8 {
            private static volatile Section[] _emptyArray;
            public boolean collapsed;
            public String id;
            public long marker;
            public long[] stickerSets;
            public long[] stickers;
            public String title;
            public int totalCount;

            public Section() {
                clear();
            }

            public static Section[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Section[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static Section parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Section) qw8.mergeFrom(new Section(), bArr);
            }

            public Section clear() {
                this.id = "";
                this.title = "";
                long[] jArr = nd7.d;
                this.stickers = jArr;
                this.marker = 0L;
                this.collapsed = false;
                this.stickerSets = jArr;
                this.totalCount = 0;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                long[] jArr;
                long[] jArr2;
                int i = 0;
                int iL = !this.id.equals("") ? y43.l(1, this.id) : 0;
                if (!this.title.equals("")) {
                    iL += y43.l(2, this.title);
                }
                long[] jArr3 = this.stickers;
                if (jArr3 != null && jArr3.length > 0) {
                    int i2 = 0;
                    int iK = 0;
                    while (true) {
                        jArr2 = this.stickers;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        iK += y43.k(jArr2[i2]);
                        i2++;
                    }
                    iL = iL + iK + jArr2.length;
                }
                long j = this.marker;
                if (j != 0) {
                    iL += y43.h(4, j);
                }
                if (this.collapsed) {
                    iL += y43.a(5);
                }
                long[] jArr4 = this.stickerSets;
                if (jArr4 != null && jArr4.length > 0) {
                    int iK2 = 0;
                    while (true) {
                        jArr = this.stickerSets;
                        if (i >= jArr.length) {
                            break;
                        }
                        iK2 += y43.k(jArr[i]);
                        i++;
                    }
                    iL = iL + iK2 + jArr.length;
                }
                int i3 = this.totalCount;
                return i3 != 0 ? iL + y43.f(7, i3) : iL;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                if (!this.id.equals("")) {
                    y43Var.E(1, this.id);
                }
                if (!this.title.equals("")) {
                    y43Var.E(2, this.title);
                }
                long[] jArr = this.stickers;
                int i = 0;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.stickers;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        y43Var.x(3, jArr2[i2]);
                        i2++;
                    }
                }
                long j = this.marker;
                if (j != 0) {
                    y43Var.x(4, j);
                }
                boolean z = this.collapsed;
                if (z) {
                    y43Var.r(5, z);
                }
                long[] jArr3 = this.stickerSets;
                if (jArr3 != null && jArr3.length > 0) {
                    while (true) {
                        long[] jArr4 = this.stickerSets;
                        if (i >= jArr4.length) {
                            break;
                        }
                        y43Var.x(6, jArr4[i]);
                        i++;
                    }
                }
                int i3 = this.totalCount;
                if (i3 != 0) {
                    y43Var.w(7, i3);
                }
            }

            public static Section parseFrom(x43 x43Var) throws IOException {
                return new Section().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public Section mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 10) {
                        this.id = x43Var.r();
                    } else if (iS == 18) {
                        this.title = x43Var.r();
                    } else if (iS == 24) {
                        int iW = nd7.w(x43Var, 24);
                        long[] jArr = this.stickers;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iW + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = x43Var.q();
                            x43Var.s();
                            length++;
                        }
                        jArr2[length] = x43Var.q();
                        this.stickers = jArr2;
                    } else if (iS == 26) {
                        int iE = x43Var.e(x43Var.p());
                        int iC = x43Var.c();
                        int i2 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.q();
                            i2++;
                        }
                        x43Var.t(iC);
                        long[] jArr3 = this.stickers;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = x43Var.q();
                            length2++;
                        }
                        this.stickers = jArr4;
                        x43Var.d(iE);
                    } else if (iS == 32) {
                        this.marker = x43Var.q();
                    } else if (iS == 40) {
                        this.collapsed = x43Var.f();
                    } else if (iS == 48) {
                        int iW2 = nd7.w(x43Var, 48);
                        long[] jArr5 = this.stickerSets;
                        int length3 = jArr5 == null ? 0 : jArr5.length;
                        int i4 = iW2 + length3;
                        long[] jArr6 = new long[i4];
                        if (length3 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            jArr6[length3] = x43Var.q();
                            x43Var.s();
                            length3++;
                        }
                        jArr6[length3] = x43Var.q();
                        this.stickerSets = jArr6;
                    } else if (iS == 50) {
                        int iE2 = x43Var.e(x43Var.p());
                        int iC2 = x43Var.c();
                        int i5 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.q();
                            i5++;
                        }
                        x43Var.t(iC2);
                        long[] jArr7 = this.stickerSets;
                        int length4 = jArr7 == null ? 0 : jArr7.length;
                        int i6 = i5 + length4;
                        long[] jArr8 = new long[i6];
                        if (length4 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            jArr8[length4] = x43Var.q();
                            length4++;
                        }
                        this.stickerSets = jArr8;
                        x43Var.d(iE2);
                    } else if (iS == 56) {
                        this.totalCount = x43Var.p();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public static final class VideoConversation extends qw8 {
            public static final int BY_LINK = 1;
            public static final int FROM_CHAT = 2;
            public static final int UNKNOWN = 0;
            private static volatile VideoConversation[] _emptyArray;
            public int approxParticipantCount;
            public String conversationId;
            public String joinLink;
            public long[] previewParticipantIds;
            public long startedAt;
            public int type;

            public VideoConversation() {
                clear();
            }

            public static VideoConversation[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new VideoConversation[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static VideoConversation parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (VideoConversation) qw8.mergeFrom(new VideoConversation(), bArr);
            }

            public VideoConversation clear() {
                this.conversationId = "";
                this.startedAt = 0L;
                this.joinLink = "";
                this.approxParticipantCount = 0;
                this.previewParticipantIds = nd7.d;
                this.type = 0;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                long[] jArr;
                int i = 0;
                int iL = !this.conversationId.equals("") ? y43.l(1, this.conversationId) : 0;
                long j = this.startedAt;
                if (j != 0) {
                    iL += y43.h(2, j);
                }
                if (!this.joinLink.equals("")) {
                    iL += y43.l(3, this.joinLink);
                }
                int i2 = this.approxParticipantCount;
                if (i2 != 0) {
                    iL += y43.f(4, i2);
                }
                long[] jArr2 = this.previewParticipantIds;
                if (jArr2 != null && jArr2.length > 0) {
                    int iK = 0;
                    while (true) {
                        jArr = this.previewParticipantIds;
                        if (i >= jArr.length) {
                            break;
                        }
                        iK += y43.k(jArr[i]);
                        i++;
                    }
                    iL = iL + iK + jArr.length;
                }
                int i3 = this.type;
                return i3 != 0 ? iL + y43.f(6, i3) : iL;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                if (!this.conversationId.equals("")) {
                    y43Var.E(1, this.conversationId);
                }
                long j = this.startedAt;
                if (j != 0) {
                    y43Var.x(2, j);
                }
                if (!this.joinLink.equals("")) {
                    y43Var.E(3, this.joinLink);
                }
                int i = this.approxParticipantCount;
                if (i != 0) {
                    y43Var.w(4, i);
                }
                long[] jArr = this.previewParticipantIds;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.previewParticipantIds;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        y43Var.x(5, jArr2[i2]);
                        i2++;
                    }
                }
                int i3 = this.type;
                if (i3 != 0) {
                    y43Var.w(6, i3);
                }
            }

            public static VideoConversation parseFrom(x43 x43Var) throws IOException {
                return new VideoConversation().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public VideoConversation mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 10) {
                        this.conversationId = x43Var.r();
                    } else if (iS == 16) {
                        this.startedAt = x43Var.q();
                    } else if (iS == 26) {
                        this.joinLink = x43Var.r();
                    } else if (iS == 32) {
                        this.approxParticipantCount = x43Var.p();
                    } else if (iS == 40) {
                        int iW = nd7.w(x43Var, 40);
                        long[] jArr = this.previewParticipantIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iW + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = x43Var.q();
                            x43Var.s();
                            length++;
                        }
                        jArr2[length] = x43Var.q();
                        this.previewParticipantIds = jArr2;
                    } else if (iS == 42) {
                        int iE = x43Var.e(x43Var.p());
                        int iC = x43Var.c();
                        int i2 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.q();
                            i2++;
                        }
                        x43Var.t(iC);
                        long[] jArr3 = this.previewParticipantIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = x43Var.q();
                            length2++;
                        }
                        this.previewParticipantIds = jArr4;
                        x43Var.d(iE);
                    } else if (iS == 48) {
                        int iP = x43Var.p();
                        if (iP == 0 || iP == 1 || iP == 2) {
                            this.type = iP;
                        }
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public Chat() {
            clear();
        }

        public static Chat[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Chat[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Chat parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Chat) qw8.mergeFrom(new Chat(), bArr);
        }

        public Chat clear() {
            this.serverId = 0L;
            this.type = 0;
            this.status = 0;
            this.owner = 0L;
            this.participants = null;
            this.created = 0L;
            this.title = "";
            this.lastMessageId = 0L;
            this.lastEventTime = 0L;
            this.cid = 0L;
            this.newMessages = 0;
            this.chunk = Chunk.emptyArray();
            this.lastInput = "";
            this.chatSettings = null;
            this.mediaAll = null;
            this.firstMessageId = 0L;
            this.sections = Section.emptyArray();
            this.stickersOrder = nd7.f;
            this.stickersSyncTime = 0L;
            this.localChanges = nd7.c;
            this.channelInfo = null;
            this.accessType = 0;
            this.link = "";
            this.chatSubject = null;
            this.restrictions = 0;
            this.groupChatInfo = null;
            this.participantsCount = 0;
            this.description = "";
            long[] jArr = nd7.d;
            this.admins = jArr;
            this.blockedParticipantsCount = 0;
            this.chatOptions = null;
            this.mediaMusic = null;
            this.mediaAudio = null;
            this.pinnedMessageId = 0L;
            this.hidePinnedMessage = false;
            this.unreadReply = false;
            this.unreadPin = false;
            this.joinTime = 0L;
            this.messagesTtlSec = 0;
            this.adminParticipants = null;
            this.baseIconUrl = "";
            this.baseRawIconUrl = "";
            this.unbindOkPanelCloseTime = 0L;
            this.flagsSettings = 0;
            this.videoConversation = null;
            this.lastOpenPositionTime = 0L;
            this.lastOpenPositionOffset = 0;
            this.lastOpenReadMark = 0L;
            this.lastWriteTime = 0L;
            this.lastSearchClickTime = 0L;
            this.lastOpenNewMessages = 0L;
            this.lastInputMedia = LastInputMedia.emptyArray();
            this.mediaPhotoVideo = null;
            this.mediaShare = null;
            this.mediaFiles = null;
            this.botsInfo = null;
            this.mediaLocations = null;
            this.lastInputEditMessageId = 0L;
            this.modified = 0L;
            this.lastInputReplyMessageId = 0L;
            this.draft = nd7.g;
            this.draftUpdateTime = 0L;
            this.subscribedToUpdates = false;
            this.liveLocationMessageIds = null;
            this.lastMentionMessageId = 0L;
            this.chatFoldersIds = jArr;
            this.draftUpdateTimeForSyncLogic = 0L;
            this.markedAsUnread = false;
            this.lastPushMessage = null;
            this.lastReactedMessageId = 0L;
            this.lastReaction = "";
            this.lastFireDelayedErrorTime = 0L;
            this.lastDelayedUpdateTime = 0L;
            this.delayedChunk = Chunk.emptyArray();
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long[] jArr;
            long[] jArr2;
            int[] iArr;
            long j = this.serverId;
            int i = 0;
            int iH = j != 0 ? y43.h(1, j) : 0;
            int i2 = this.type;
            if (i2 != 0) {
                iH += y43.f(2, i2);
            }
            int i3 = this.status;
            if (i3 != 0) {
                iH += y43.f(3, i3);
            }
            long j2 = this.owner;
            if (j2 != 0) {
                iH += y43.h(4, j2);
            }
            Map<Long, Long> map = this.participants;
            if (map != null) {
                iH += y37.a(map, 5, 3, 3);
            }
            long j3 = this.created;
            if (j3 != 0) {
                iH += y43.h(6, j3);
            }
            if (!this.title.equals("")) {
                iH += y43.l(7, this.title);
            }
            long j4 = this.lastMessageId;
            if (j4 != 0) {
                iH += y43.h(10, j4);
            }
            long j5 = this.lastEventTime;
            if (j5 != 0) {
                iH += y43.h(11, j5);
            }
            long j6 = this.cid;
            if (j6 != 0) {
                iH += y43.h(12, j6);
            }
            int i4 = this.newMessages;
            if (i4 != 0) {
                iH += y43.f(13, i4);
            }
            Chunk[] chunkArr = this.chunk;
            if (chunkArr != null && chunkArr.length > 0) {
                int i5 = 0;
                while (true) {
                    Chunk[] chunkArr2 = this.chunk;
                    if (i5 >= chunkArr2.length) {
                        break;
                    }
                    Chunk chunk = chunkArr2[i5];
                    if (chunk != null) {
                        iH = y43.i(14, chunk) + iH;
                    }
                    i5++;
                }
            }
            if (!this.lastInput.equals("")) {
                iH += y43.l(15, this.lastInput);
            }
            ChatSettings chatSettings = this.chatSettings;
            if (chatSettings != null) {
                iH += y43.i(16, chatSettings);
            }
            ChatMedia chatMedia = this.mediaAll;
            if (chatMedia != null) {
                iH += y43.i(17, chatMedia);
            }
            long j7 = this.firstMessageId;
            if (j7 != 0) {
                iH += y43.h(18, j7);
            }
            Section[] sectionArr = this.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                int i6 = 0;
                while (true) {
                    Section[] sectionArr2 = this.sections;
                    if (i6 >= sectionArr2.length) {
                        break;
                    }
                    Section section = sectionArr2[i6];
                    if (section != null) {
                        iH = y43.i(19, section) + iH;
                    }
                    i6++;
                }
            }
            String[] strArr = this.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                int i7 = 0;
                int iJ = 0;
                int i8 = 0;
                while (true) {
                    String[] strArr2 = this.stickersOrder;
                    if (i7 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i7];
                    if (str != null) {
                        i8++;
                        int iQ = y43.q(str);
                        iJ += y43.j(iQ) + iQ;
                    }
                    i7++;
                }
                iH = iH + iJ + (i8 * 2);
            }
            long j8 = this.stickersSyncTime;
            if (j8 != 0) {
                iH += y43.h(21, j8);
            }
            int[] iArr2 = this.localChanges;
            if (iArr2 != null && iArr2.length > 0) {
                int i9 = 0;
                int iG = 0;
                while (true) {
                    iArr = this.localChanges;
                    if (i9 >= iArr.length) {
                        break;
                    }
                    iG += y43.g(iArr[i9]);
                    i9++;
                }
                iH = iH + iG + (iArr.length * 2);
            }
            ChannelInfo channelInfo = this.channelInfo;
            if (channelInfo != null) {
                iH += y43.i(23, channelInfo);
            }
            int i10 = this.accessType;
            if (i10 != 0) {
                iH += y43.f(24, i10);
            }
            if (!this.link.equals("")) {
                iH += y43.l(25, this.link);
            }
            ChatSubject chatSubject = this.chatSubject;
            if (chatSubject != null) {
                iH += y43.i(26, chatSubject);
            }
            int i11 = this.restrictions;
            if (i11 != 0) {
                iH += y43.f(27, i11);
            }
            GroupChatInfo groupChatInfo = this.groupChatInfo;
            if (groupChatInfo != null) {
                iH += y43.i(28, groupChatInfo);
            }
            int i12 = this.participantsCount;
            if (i12 != 0) {
                iH += y43.f(29, i12);
            }
            if (!this.description.equals("")) {
                iH += y43.l(30, this.description);
            }
            long[] jArr3 = this.admins;
            if (jArr3 != null && jArr3.length > 0) {
                int i13 = 0;
                int iK = 0;
                while (true) {
                    jArr2 = this.admins;
                    if (i13 >= jArr2.length) {
                        break;
                    }
                    iK += y43.k(jArr2[i13]);
                    i13++;
                }
                iH = iH + iK + (jArr2.length * 2);
            }
            int i14 = this.blockedParticipantsCount;
            if (i14 != 0) {
                iH += y43.f(32, i14);
            }
            ChatOptions chatOptions = this.chatOptions;
            if (chatOptions != null) {
                iH += y43.i(33, chatOptions);
            }
            ChatMedia chatMedia2 = this.mediaMusic;
            if (chatMedia2 != null) {
                iH += y43.i(34, chatMedia2);
            }
            ChatMedia chatMedia3 = this.mediaAudio;
            if (chatMedia3 != null) {
                iH += y43.i(35, chatMedia3);
            }
            long j9 = this.pinnedMessageId;
            if (j9 != 0) {
                iH += y43.h(36, j9);
            }
            if (this.hidePinnedMessage) {
                iH += y43.a(37);
            }
            if (this.unreadReply) {
                iH += y43.a(38);
            }
            if (this.unreadPin) {
                iH += y43.a(39);
            }
            long j10 = this.joinTime;
            if (j10 != 0) {
                iH += y43.h(40, j10);
            }
            int i15 = this.messagesTtlSec;
            if (i15 != 0) {
                iH += y43.f(42, i15);
            }
            Map<Long, AdminParticipant> map2 = this.adminParticipants;
            if (map2 != null) {
                iH += y37.a(map2, 43, 3, 11);
            }
            if (!this.baseIconUrl.equals("")) {
                iH += y43.l(44, this.baseIconUrl);
            }
            if (!this.baseRawIconUrl.equals("")) {
                iH += y43.l(45, this.baseRawIconUrl);
            }
            long j11 = this.unbindOkPanelCloseTime;
            if (j11 != 0) {
                iH += y43.h(46, j11);
            }
            int i16 = this.flagsSettings;
            if (i16 != 0) {
                iH += y43.f(47, i16);
            }
            VideoConversation videoConversation = this.videoConversation;
            if (videoConversation != null) {
                iH += y43.i(48, videoConversation);
            }
            long j12 = this.lastOpenPositionTime;
            if (j12 != 0) {
                iH += y43.h(49, j12);
            }
            int i17 = this.lastOpenPositionOffset;
            if (i17 != 0) {
                iH += y43.f(50, i17);
            }
            long j13 = this.lastOpenReadMark;
            if (j13 != 0) {
                iH += y43.h(51, j13);
            }
            long j14 = this.lastWriteTime;
            if (j14 != 0) {
                iH += y43.h(52, j14);
            }
            long j15 = this.lastSearchClickTime;
            if (j15 != 0) {
                iH += y43.h(53, j15);
            }
            long j16 = this.lastOpenNewMessages;
            if (j16 != 0) {
                iH += y43.h(54, j16);
            }
            LastInputMedia[] lastInputMediaArr = this.lastInputMedia;
            if (lastInputMediaArr != null && lastInputMediaArr.length > 0) {
                int i18 = 0;
                while (true) {
                    LastInputMedia[] lastInputMediaArr2 = this.lastInputMedia;
                    if (i18 >= lastInputMediaArr2.length) {
                        break;
                    }
                    LastInputMedia lastInputMedia = lastInputMediaArr2[i18];
                    if (lastInputMedia != null) {
                        iH = y43.i(55, lastInputMedia) + iH;
                    }
                    i18++;
                }
            }
            ChatMedia chatMedia4 = this.mediaPhotoVideo;
            if (chatMedia4 != null) {
                iH += y43.i(56, chatMedia4);
            }
            ChatMedia chatMedia5 = this.mediaShare;
            if (chatMedia5 != null) {
                iH += y43.i(57, chatMedia5);
            }
            ChatMedia chatMedia6 = this.mediaFiles;
            if (chatMedia6 != null) {
                iH += y43.i(58, chatMedia6);
            }
            BotsInfo botsInfo = this.botsInfo;
            if (botsInfo != null) {
                iH += y43.i(59, botsInfo);
            }
            ChatMedia chatMedia7 = this.mediaLocations;
            if (chatMedia7 != null) {
                iH += y43.i(60, chatMedia7);
            }
            long j17 = this.lastInputEditMessageId;
            if (j17 != 0) {
                iH += y43.h(61, j17);
            }
            long j18 = this.modified;
            if (j18 != 0) {
                iH += y43.h(62, j18);
            }
            long j19 = this.lastInputReplyMessageId;
            if (j19 != 0) {
                iH += y43.h(63, j19);
            }
            if (!Arrays.equals(this.draft, nd7.g)) {
                iH += y43.b(64, this.draft);
            }
            long j20 = this.draftUpdateTime;
            if (j20 != 0) {
                iH += y43.h(65, j20);
            }
            if (this.subscribedToUpdates) {
                iH += y43.a(66);
            }
            Map<Long, Long> map3 = this.liveLocationMessageIds;
            if (map3 != null) {
                iH += y37.a(map3, 67, 3, 3);
            }
            long j21 = this.lastMentionMessageId;
            if (j21 != 0) {
                iH += y43.h(68, j21);
            }
            long[] jArr4 = this.chatFoldersIds;
            if (jArr4 != null && jArr4.length > 0) {
                int i19 = 0;
                int iK2 = 0;
                while (true) {
                    jArr = this.chatFoldersIds;
                    if (i19 >= jArr.length) {
                        break;
                    }
                    iK2 += y43.k(jArr[i19]);
                    i19++;
                }
                iH = iH + iK2 + (jArr.length * 2);
            }
            long j22 = this.draftUpdateTimeForSyncLogic;
            if (j22 != 0) {
                iH += y43.h(70, j22);
            }
            if (this.markedAsUnread) {
                iH += y43.a(71);
            }
            PushMessage pushMessage = this.lastPushMessage;
            if (pushMessage != null) {
                iH += y43.i(72, pushMessage);
            }
            long j23 = this.lastReactedMessageId;
            if (j23 != 0) {
                iH += y43.h(73, j23);
            }
            if (!this.lastReaction.equals("")) {
                iH += y43.l(74, this.lastReaction);
            }
            long j24 = this.lastFireDelayedErrorTime;
            if (j24 != 0) {
                iH += y43.h(75, j24);
            }
            long j25 = this.lastDelayedUpdateTime;
            if (j25 != 0) {
                iH += y43.h(76, j25);
            }
            Chunk[] chunkArr3 = this.delayedChunk;
            if (chunkArr3 != null && chunkArr3.length > 0) {
                while (true) {
                    Chunk[] chunkArr4 = this.delayedChunk;
                    if (i >= chunkArr4.length) {
                        break;
                    }
                    Chunk chunk2 = chunkArr4[i];
                    if (chunk2 != null) {
                        iH = y43.i(77, chunk2) + iH;
                    }
                    i++;
                }
            }
            return iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            int i = this.type;
            if (i != 0) {
                y43Var.w(2, i);
            }
            int i2 = this.status;
            if (i2 != 0) {
                y43Var.w(3, i2);
            }
            long j2 = this.owner;
            if (j2 != 0) {
                y43Var.x(4, j2);
            }
            Map<Long, Long> map = this.participants;
            if (map != null) {
                y37.d(y43Var, map, 5, 3, 3);
            }
            long j3 = this.created;
            if (j3 != 0) {
                y43Var.x(6, j3);
            }
            if (!this.title.equals("")) {
                y43Var.E(7, this.title);
            }
            long j4 = this.lastMessageId;
            if (j4 != 0) {
                y43Var.x(10, j4);
            }
            long j5 = this.lastEventTime;
            if (j5 != 0) {
                y43Var.x(11, j5);
            }
            long j6 = this.cid;
            if (j6 != 0) {
                y43Var.x(12, j6);
            }
            int i3 = this.newMessages;
            if (i3 != 0) {
                y43Var.w(13, i3);
            }
            Chunk[] chunkArr = this.chunk;
            int i4 = 0;
            if (chunkArr != null && chunkArr.length > 0) {
                int i5 = 0;
                while (true) {
                    Chunk[] chunkArr2 = this.chunk;
                    if (i5 >= chunkArr2.length) {
                        break;
                    }
                    Chunk chunk = chunkArr2[i5];
                    if (chunk != null) {
                        y43Var.y(14, chunk);
                    }
                    i5++;
                }
            }
            if (!this.lastInput.equals("")) {
                y43Var.E(15, this.lastInput);
            }
            ChatSettings chatSettings = this.chatSettings;
            if (chatSettings != null) {
                y43Var.y(16, chatSettings);
            }
            ChatMedia chatMedia = this.mediaAll;
            if (chatMedia != null) {
                y43Var.y(17, chatMedia);
            }
            long j7 = this.firstMessageId;
            if (j7 != 0) {
                y43Var.x(18, j7);
            }
            Section[] sectionArr = this.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                int i6 = 0;
                while (true) {
                    Section[] sectionArr2 = this.sections;
                    if (i6 >= sectionArr2.length) {
                        break;
                    }
                    Section section = sectionArr2[i6];
                    if (section != null) {
                        y43Var.y(19, section);
                    }
                    i6++;
                }
            }
            String[] strArr = this.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                int i7 = 0;
                while (true) {
                    String[] strArr2 = this.stickersOrder;
                    if (i7 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i7];
                    if (str != null) {
                        y43Var.E(20, str);
                    }
                    i7++;
                }
            }
            long j8 = this.stickersSyncTime;
            if (j8 != 0) {
                y43Var.x(21, j8);
            }
            int[] iArr = this.localChanges;
            if (iArr != null && iArr.length > 0) {
                int i8 = 0;
                while (true) {
                    int[] iArr2 = this.localChanges;
                    if (i8 >= iArr2.length) {
                        break;
                    }
                    y43Var.w(22, iArr2[i8]);
                    i8++;
                }
            }
            ChannelInfo channelInfo = this.channelInfo;
            if (channelInfo != null) {
                y43Var.y(23, channelInfo);
            }
            int i9 = this.accessType;
            if (i9 != 0) {
                y43Var.w(24, i9);
            }
            if (!this.link.equals("")) {
                y43Var.E(25, this.link);
            }
            ChatSubject chatSubject = this.chatSubject;
            if (chatSubject != null) {
                y43Var.y(26, chatSubject);
            }
            int i10 = this.restrictions;
            if (i10 != 0) {
                y43Var.w(27, i10);
            }
            GroupChatInfo groupChatInfo = this.groupChatInfo;
            if (groupChatInfo != null) {
                y43Var.y(28, groupChatInfo);
            }
            int i11 = this.participantsCount;
            if (i11 != 0) {
                y43Var.w(29, i11);
            }
            if (!this.description.equals("")) {
                y43Var.E(30, this.description);
            }
            long[] jArr = this.admins;
            if (jArr != null && jArr.length > 0) {
                int i12 = 0;
                while (true) {
                    long[] jArr2 = this.admins;
                    if (i12 >= jArr2.length) {
                        break;
                    }
                    y43Var.x(31, jArr2[i12]);
                    i12++;
                }
            }
            int i13 = this.blockedParticipantsCount;
            if (i13 != 0) {
                y43Var.w(32, i13);
            }
            ChatOptions chatOptions = this.chatOptions;
            if (chatOptions != null) {
                y43Var.y(33, chatOptions);
            }
            ChatMedia chatMedia2 = this.mediaMusic;
            if (chatMedia2 != null) {
                y43Var.y(34, chatMedia2);
            }
            ChatMedia chatMedia3 = this.mediaAudio;
            if (chatMedia3 != null) {
                y43Var.y(35, chatMedia3);
            }
            long j9 = this.pinnedMessageId;
            if (j9 != 0) {
                y43Var.x(36, j9);
            }
            boolean z = this.hidePinnedMessage;
            if (z) {
                y43Var.r(37, z);
            }
            boolean z2 = this.unreadReply;
            if (z2) {
                y43Var.r(38, z2);
            }
            boolean z3 = this.unreadPin;
            if (z3) {
                y43Var.r(39, z3);
            }
            long j10 = this.joinTime;
            if (j10 != 0) {
                y43Var.x(40, j10);
            }
            int i14 = this.messagesTtlSec;
            if (i14 != 0) {
                y43Var.w(42, i14);
            }
            Map<Long, AdminParticipant> map2 = this.adminParticipants;
            if (map2 != null) {
                y37.d(y43Var, map2, 43, 3, 11);
            }
            if (!this.baseIconUrl.equals("")) {
                y43Var.E(44, this.baseIconUrl);
            }
            if (!this.baseRawIconUrl.equals("")) {
                y43Var.E(45, this.baseRawIconUrl);
            }
            long j11 = this.unbindOkPanelCloseTime;
            if (j11 != 0) {
                y43Var.x(46, j11);
            }
            int i15 = this.flagsSettings;
            if (i15 != 0) {
                y43Var.w(47, i15);
            }
            VideoConversation videoConversation = this.videoConversation;
            if (videoConversation != null) {
                y43Var.y(48, videoConversation);
            }
            long j12 = this.lastOpenPositionTime;
            if (j12 != 0) {
                y43Var.x(49, j12);
            }
            int i16 = this.lastOpenPositionOffset;
            if (i16 != 0) {
                y43Var.w(50, i16);
            }
            long j13 = this.lastOpenReadMark;
            if (j13 != 0) {
                y43Var.x(51, j13);
            }
            long j14 = this.lastWriteTime;
            if (j14 != 0) {
                y43Var.x(52, j14);
            }
            long j15 = this.lastSearchClickTime;
            if (j15 != 0) {
                y43Var.x(53, j15);
            }
            long j16 = this.lastOpenNewMessages;
            if (j16 != 0) {
                y43Var.x(54, j16);
            }
            LastInputMedia[] lastInputMediaArr = this.lastInputMedia;
            if (lastInputMediaArr != null && lastInputMediaArr.length > 0) {
                int i17 = 0;
                while (true) {
                    LastInputMedia[] lastInputMediaArr2 = this.lastInputMedia;
                    if (i17 >= lastInputMediaArr2.length) {
                        break;
                    }
                    LastInputMedia lastInputMedia = lastInputMediaArr2[i17];
                    if (lastInputMedia != null) {
                        y43Var.y(55, lastInputMedia);
                    }
                    i17++;
                }
            }
            ChatMedia chatMedia4 = this.mediaPhotoVideo;
            if (chatMedia4 != null) {
                y43Var.y(56, chatMedia4);
            }
            ChatMedia chatMedia5 = this.mediaShare;
            if (chatMedia5 != null) {
                y43Var.y(57, chatMedia5);
            }
            ChatMedia chatMedia6 = this.mediaFiles;
            if (chatMedia6 != null) {
                y43Var.y(58, chatMedia6);
            }
            BotsInfo botsInfo = this.botsInfo;
            if (botsInfo != null) {
                y43Var.y(59, botsInfo);
            }
            ChatMedia chatMedia7 = this.mediaLocations;
            if (chatMedia7 != null) {
                y43Var.y(60, chatMedia7);
            }
            long j17 = this.lastInputEditMessageId;
            if (j17 != 0) {
                y43Var.x(61, j17);
            }
            long j18 = this.modified;
            if (j18 != 0) {
                y43Var.x(62, j18);
            }
            long j19 = this.lastInputReplyMessageId;
            if (j19 != 0) {
                y43Var.x(63, j19);
            }
            if (!Arrays.equals(this.draft, nd7.g)) {
                y43Var.s(64, this.draft);
            }
            long j20 = this.draftUpdateTime;
            if (j20 != 0) {
                y43Var.x(65, j20);
            }
            boolean z4 = this.subscribedToUpdates;
            if (z4) {
                y43Var.r(66, z4);
            }
            Map<Long, Long> map3 = this.liveLocationMessageIds;
            if (map3 != null) {
                y37.d(y43Var, map3, 67, 3, 3);
            }
            long j21 = this.lastMentionMessageId;
            if (j21 != 0) {
                y43Var.x(68, j21);
            }
            long[] jArr3 = this.chatFoldersIds;
            if (jArr3 != null && jArr3.length > 0) {
                int i18 = 0;
                while (true) {
                    long[] jArr4 = this.chatFoldersIds;
                    if (i18 >= jArr4.length) {
                        break;
                    }
                    y43Var.x(69, jArr4[i18]);
                    i18++;
                }
            }
            long j22 = this.draftUpdateTimeForSyncLogic;
            if (j22 != 0) {
                y43Var.x(70, j22);
            }
            boolean z5 = this.markedAsUnread;
            if (z5) {
                y43Var.r(71, z5);
            }
            PushMessage pushMessage = this.lastPushMessage;
            if (pushMessage != null) {
                y43Var.y(72, pushMessage);
            }
            long j23 = this.lastReactedMessageId;
            if (j23 != 0) {
                y43Var.x(73, j23);
            }
            if (!this.lastReaction.equals("")) {
                y43Var.E(74, this.lastReaction);
            }
            long j24 = this.lastFireDelayedErrorTime;
            if (j24 != 0) {
                y43Var.x(75, j24);
            }
            long j25 = this.lastDelayedUpdateTime;
            if (j25 != 0) {
                y43Var.x(76, j25);
            }
            Chunk[] chunkArr3 = this.delayedChunk;
            if (chunkArr3 == null || chunkArr3.length <= 0) {
                return;
            }
            while (true) {
                Chunk[] chunkArr4 = this.delayedChunk;
                if (i4 >= chunkArr4.length) {
                    return;
                }
                Chunk chunk2 = chunkArr4[i4];
                if (chunk2 != null) {
                    y43Var.y(77, chunk2);
                }
                i4++;
            }
        }

        public static Chat parseFrom(x43 x43Var) throws IOException {
            return new Chat().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public Chat mergeFrom(x43 x43Var) throws IOException {
            py7 py7Var = s36.d;
            while (true) {
                int iS = x43Var.s();
                switch (iS) {
                    case 0:
                        return this;
                    case 8:
                        this.serverId = x43Var.q();
                        break;
                    case 16:
                        int iP = x43Var.p();
                        if (iP != 0 && iP != 1 && iP != 2 && iP != 3) {
                            break;
                        } else {
                            this.type = iP;
                            break;
                        }
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        int iP2 = x43Var.p();
                        switch (iP2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                this.status = iP2;
                                break;
                        }
                    case 32:
                        this.owner = x43Var.q();
                        break;
                    case 42:
                        this.participants = y37.b(x43Var, this.participants, py7Var, 3, 3, null, 8, 16);
                        break;
                    case 48:
                        this.created = x43Var.q();
                        break;
                    case 58:
                        this.title = x43Var.r();
                        break;
                    case 80:
                        this.lastMessageId = x43Var.q();
                        break;
                    case 88:
                        this.lastEventTime = x43Var.q();
                        break;
                    case 96:
                        this.cid = x43Var.q();
                        break;
                    case 104:
                        this.newMessages = x43Var.p();
                        break;
                    case 114:
                        int iW = nd7.w(x43Var, 114);
                        Chunk[] chunkArr = this.chunk;
                        int length = chunkArr == null ? 0 : chunkArr.length;
                        int i = iW + length;
                        Chunk[] chunkArr2 = new Chunk[i];
                        if (length != 0) {
                            System.arraycopy(chunkArr, 0, chunkArr2, 0, length);
                        }
                        while (length < i - 1) {
                            Chunk chunk = new Chunk();
                            chunkArr2[length] = chunk;
                            x43Var.j(chunk);
                            x43Var.s();
                            length++;
                        }
                        Chunk chunk2 = new Chunk();
                        chunkArr2[length] = chunk2;
                        x43Var.j(chunk2);
                        this.chunk = chunkArr2;
                        break;
                    case 122:
                        this.lastInput = x43Var.r();
                        break;
                    case 130:
                        if (this.chatSettings == null) {
                            this.chatSettings = new ChatSettings();
                        }
                        x43Var.j(this.chatSettings);
                        break;
                    case 138:
                        if (this.mediaAll == null) {
                            this.mediaAll = new ChatMedia();
                        }
                        x43Var.j(this.mediaAll);
                        break;
                    case 144:
                        this.firstMessageId = x43Var.q();
                        break;
                    case 154:
                        int iW2 = nd7.w(x43Var, 154);
                        Section[] sectionArr = this.sections;
                        int length2 = sectionArr == null ? 0 : sectionArr.length;
                        int i2 = iW2 + length2;
                        Section[] sectionArr2 = new Section[i2];
                        if (length2 != 0) {
                            System.arraycopy(sectionArr, 0, sectionArr2, 0, length2);
                        }
                        while (length2 < i2 - 1) {
                            Section section = new Section();
                            sectionArr2[length2] = section;
                            x43Var.j(section);
                            x43Var.s();
                            length2++;
                        }
                        Section section2 = new Section();
                        sectionArr2[length2] = section2;
                        x43Var.j(section2);
                        this.sections = sectionArr2;
                        break;
                    case 162:
                        int iW3 = nd7.w(x43Var, 162);
                        String[] strArr = this.stickersOrder;
                        int length3 = strArr == null ? 0 : strArr.length;
                        int i3 = iW3 + length3;
                        String[] strArr2 = new String[i3];
                        if (length3 != 0) {
                            System.arraycopy(strArr, 0, strArr2, 0, length3);
                        }
                        while (length3 < i3 - 1) {
                            strArr2[length3] = x43Var.r();
                            x43Var.s();
                            length3++;
                        }
                        strArr2[length3] = x43Var.r();
                        this.stickersOrder = strArr2;
                        break;
                    case 168:
                        this.stickersSyncTime = x43Var.q();
                        break;
                    case 176:
                        int iW4 = nd7.w(x43Var, 176);
                        int[] iArr = this.localChanges;
                        int length4 = iArr == null ? 0 : iArr.length;
                        int i4 = iW4 + length4;
                        int[] iArr2 = new int[i4];
                        if (length4 != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length4);
                        }
                        while (length4 < i4 - 1) {
                            iArr2[length4] = x43Var.p();
                            x43Var.s();
                            length4++;
                        }
                        iArr2[length4] = x43Var.p();
                        this.localChanges = iArr2;
                        break;
                    case 178:
                        int iE = x43Var.e(x43Var.p());
                        int iC = x43Var.c();
                        int i5 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.p();
                            i5++;
                        }
                        x43Var.t(iC);
                        int[] iArr3 = this.localChanges;
                        int length5 = iArr3 == null ? 0 : iArr3.length;
                        int i6 = i5 + length5;
                        int[] iArr4 = new int[i6];
                        if (length5 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length5);
                        }
                        while (length5 < i6) {
                            iArr4[length5] = x43Var.p();
                            length5++;
                        }
                        this.localChanges = iArr4;
                        x43Var.d(iE);
                        break;
                    case 186:
                        if (this.channelInfo == null) {
                            this.channelInfo = new ChannelInfo();
                        }
                        x43Var.j(this.channelInfo);
                        break;
                    case 192:
                        int iP3 = x43Var.p();
                        if (iP3 != 0 && iP3 != 1) {
                            break;
                        } else {
                            this.accessType = iP3;
                            break;
                        }
                        break;
                    case HttpStatus.SC_ACCEPTED /* 202 */:
                        this.link = x43Var.r();
                        break;
                    case 210:
                        if (this.chatSubject == null) {
                            this.chatSubject = new ChatSubject();
                        }
                        x43Var.j(this.chatSubject);
                        break;
                    case 216:
                        this.restrictions = x43Var.p();
                        break;
                    case 226:
                        if (this.groupChatInfo == null) {
                            this.groupChatInfo = new GroupChatInfo();
                        }
                        x43Var.j(this.groupChatInfo);
                        break;
                    case 232:
                        this.participantsCount = x43Var.p();
                        break;
                    case 242:
                        this.description = x43Var.r();
                        break;
                    case 248:
                        int iW5 = nd7.w(x43Var, 248);
                        long[] jArr = this.admins;
                        int length6 = jArr == null ? 0 : jArr.length;
                        int i7 = iW5 + length6;
                        long[] jArr2 = new long[i7];
                        if (length6 != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length6);
                        }
                        while (length6 < i7 - 1) {
                            jArr2[length6] = x43Var.q();
                            x43Var.s();
                            length6++;
                        }
                        jArr2[length6] = x43Var.q();
                        this.admins = jArr2;
                        break;
                    case 250:
                        int iE2 = x43Var.e(x43Var.p());
                        int iC2 = x43Var.c();
                        int i8 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.q();
                            i8++;
                        }
                        x43Var.t(iC2);
                        long[] jArr3 = this.admins;
                        int length7 = jArr3 == null ? 0 : jArr3.length;
                        int i9 = i8 + length7;
                        long[] jArr4 = new long[i9];
                        if (length7 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length7);
                        }
                        while (length7 < i9) {
                            jArr4[length7] = x43Var.q();
                            length7++;
                        }
                        this.admins = jArr4;
                        x43Var.d(iE2);
                        break;
                    case 256:
                        this.blockedParticipantsCount = x43Var.p();
                        break;
                    case 266:
                        if (this.chatOptions == null) {
                            this.chatOptions = new ChatOptions();
                        }
                        x43Var.j(this.chatOptions);
                        break;
                    case 274:
                        if (this.mediaMusic == null) {
                            this.mediaMusic = new ChatMedia();
                        }
                        x43Var.j(this.mediaMusic);
                        break;
                    case 282:
                        if (this.mediaAudio == null) {
                            this.mediaAudio = new ChatMedia();
                        }
                        x43Var.j(this.mediaAudio);
                        break;
                    case 288:
                        this.pinnedMessageId = x43Var.q();
                        break;
                    case 296:
                        this.hidePinnedMessage = x43Var.f();
                        break;
                    case HttpStatus.SC_NOT_MODIFIED /* 304 */:
                        this.unreadReply = x43Var.f();
                        break;
                    case 312:
                        this.unreadPin = x43Var.f();
                        break;
                    case 320:
                        this.joinTime = x43Var.q();
                        break;
                    case 336:
                        this.messagesTtlSec = x43Var.p();
                        break;
                    case 346:
                        this.adminParticipants = y37.b(x43Var, this.adminParticipants, py7Var, 3, 11, new AdminParticipant(), 8, 18);
                        break;
                    case 354:
                        this.baseIconUrl = x43Var.r();
                        break;
                    case 362:
                        this.baseRawIconUrl = x43Var.r();
                        break;
                    case 368:
                        this.unbindOkPanelCloseTime = x43Var.q();
                        break;
                    case 376:
                        this.flagsSettings = x43Var.p();
                        break;
                    case 386:
                        if (this.videoConversation == null) {
                            this.videoConversation = new VideoConversation();
                        }
                        x43Var.j(this.videoConversation);
                        break;
                    case 392:
                        this.lastOpenPositionTime = x43Var.q();
                        break;
                    case HttpStatus.SC_BAD_REQUEST /* 400 */:
                        this.lastOpenPositionOffset = x43Var.p();
                        break;
                    case HttpStatus.SC_REQUEST_TIMEOUT /* 408 */:
                        this.lastOpenReadMark = x43Var.q();
                        break;
                    case HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE /* 416 */:
                        this.lastWriteTime = x43Var.q();
                        break;
                    case HttpStatus.SC_FAILED_DEPENDENCY /* 424 */:
                        this.lastSearchClickTime = x43Var.q();
                        break;
                    case 432:
                        this.lastOpenNewMessages = x43Var.q();
                        break;
                    case 442:
                        int iW6 = nd7.w(x43Var, 442);
                        LastInputMedia[] lastInputMediaArr = this.lastInputMedia;
                        int length8 = lastInputMediaArr == null ? 0 : lastInputMediaArr.length;
                        int i10 = iW6 + length8;
                        LastInputMedia[] lastInputMediaArr2 = new LastInputMedia[i10];
                        if (length8 != 0) {
                            System.arraycopy(lastInputMediaArr, 0, lastInputMediaArr2, 0, length8);
                        }
                        while (length8 < i10 - 1) {
                            LastInputMedia lastInputMedia = new LastInputMedia();
                            lastInputMediaArr2[length8] = lastInputMedia;
                            x43Var.j(lastInputMedia);
                            x43Var.s();
                            length8++;
                        }
                        LastInputMedia lastInputMedia2 = new LastInputMedia();
                        lastInputMediaArr2[length8] = lastInputMedia2;
                        x43Var.j(lastInputMedia2);
                        this.lastInputMedia = lastInputMediaArr2;
                        break;
                    case 450:
                        if (this.mediaPhotoVideo == null) {
                            this.mediaPhotoVideo = new ChatMedia();
                        }
                        x43Var.j(this.mediaPhotoVideo);
                        break;
                    case 458:
                        if (this.mediaShare == null) {
                            this.mediaShare = new ChatMedia();
                        }
                        x43Var.j(this.mediaShare);
                        break;
                    case 466:
                        if (this.mediaFiles == null) {
                            this.mediaFiles = new ChatMedia();
                        }
                        x43Var.j(this.mediaFiles);
                        break;
                    case 474:
                        if (this.botsInfo == null) {
                            this.botsInfo = new BotsInfo();
                        }
                        x43Var.j(this.botsInfo);
                        break;
                    case 482:
                        if (this.mediaLocations == null) {
                            this.mediaLocations = new ChatMedia();
                        }
                        x43Var.j(this.mediaLocations);
                        break;
                    case 488:
                        this.lastInputEditMessageId = x43Var.q();
                        break;
                    case 496:
                        this.modified = x43Var.q();
                        break;
                    case HttpStatus.SC_GATEWAY_TIMEOUT /* 504 */:
                        this.lastInputReplyMessageId = x43Var.q();
                        break;
                    case 514:
                        this.draft = x43Var.g();
                        break;
                    case 520:
                        this.draftUpdateTime = x43Var.q();
                        break;
                    case 528:
                        this.subscribedToUpdates = x43Var.f();
                        break;
                    case 538:
                        this.liveLocationMessageIds = y37.b(x43Var, this.liveLocationMessageIds, py7Var, 3, 3, null, 8, 16);
                        break;
                    case 544:
                        this.lastMentionMessageId = x43Var.q();
                        break;
                    case 552:
                        int iW7 = nd7.w(x43Var, 552);
                        long[] jArr5 = this.chatFoldersIds;
                        int length9 = jArr5 == null ? 0 : jArr5.length;
                        int i11 = iW7 + length9;
                        long[] jArr6 = new long[i11];
                        if (length9 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length9);
                        }
                        while (length9 < i11 - 1) {
                            jArr6[length9] = x43Var.q();
                            x43Var.s();
                            length9++;
                        }
                        jArr6[length9] = x43Var.q();
                        this.chatFoldersIds = jArr6;
                        break;
                    case 554:
                        int iE3 = x43Var.e(x43Var.p());
                        int iC3 = x43Var.c();
                        int i12 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.q();
                            i12++;
                        }
                        x43Var.t(iC3);
                        long[] jArr7 = this.chatFoldersIds;
                        int length10 = jArr7 == null ? 0 : jArr7.length;
                        int i13 = i12 + length10;
                        long[] jArr8 = new long[i13];
                        if (length10 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length10);
                        }
                        while (length10 < i13) {
                            jArr8[length10] = x43Var.q();
                            length10++;
                        }
                        this.chatFoldersIds = jArr8;
                        x43Var.d(iE3);
                        break;
                    case 560:
                        this.draftUpdateTimeForSyncLogic = x43Var.q();
                        break;
                    case 568:
                        this.markedAsUnread = x43Var.f();
                        break;
                    case 578:
                        if (this.lastPushMessage == null) {
                            this.lastPushMessage = new PushMessage();
                        }
                        x43Var.j(this.lastPushMessage);
                        break;
                    case 584:
                        this.lastReactedMessageId = x43Var.q();
                        break;
                    case 594:
                        this.lastReaction = x43Var.r();
                        break;
                    case 600:
                        this.lastFireDelayedErrorTime = x43Var.q();
                        break;
                    case 608:
                        this.lastDelayedUpdateTime = x43Var.q();
                        break;
                    case 618:
                        int iW8 = nd7.w(x43Var, 618);
                        Chunk[] chunkArr3 = this.delayedChunk;
                        int length11 = chunkArr3 == null ? 0 : chunkArr3.length;
                        int i14 = iW8 + length11;
                        Chunk[] chunkArr4 = new Chunk[i14];
                        if (length11 != 0) {
                            System.arraycopy(chunkArr3, 0, chunkArr4, 0, length11);
                        }
                        while (length11 < i14 - 1) {
                            Chunk chunk3 = new Chunk();
                            chunkArr4[length11] = chunk3;
                            x43Var.j(chunk3);
                            x43Var.s();
                            length11++;
                        }
                        Chunk chunk4 = new Chunk();
                        chunkArr4[length11] = chunk4;
                        x43Var.j(chunk4);
                        this.delayedChunk = chunkArr4;
                        break;
                    default:
                        if (!x43Var.u(iS)) {
                            return this;
                        }
                        break;
                }
            }
        }
    }

    public static final class Contact extends qw8 {
        public static final int BLOCKED = 1;
        public static final int BOT = 1;
        public static final int EXTERNAL = 1;
        public static final int FEMALE = 2;
        public static final int HAS_WEBAPP = 3;
        public static final int IS_NULL = 0;
        public static final int MALE = 1;
        public static final int OFFICIAL = 0;
        public static final int PortalStatus_BLOCKED = 0;
        public static final int PortalStatus_REMOVED = 1;
        public static final int REMOVED = 2;
        public static final int SERVICE_ACCOUNT = 2;
        public static final int UNKNOWN = 0;
        public static final int USER_LIST = 0;
        private static volatile Contact[] _emptyArray;
        public String baseRawUrl;
        public String baseUrl;
        public String birthday;
        public String description;
        public String deviceAvatarUrl;
        public String deviceName;
        public int gender;
        public long lastSearchClickTime;
        public long lastShowingUnknownContactBar;
        public long lastSyncTime;
        public long lastUpdateTime;
        public String link;
        public MenuButton menuButton;
        public ContactName[] names;
        public int[] options;
        public long photoId;
        public int portalStatus;
        public int[] profileOptions;
        public long serverId;
        public long serverPhone;
        public int settings;
        public StartMessage startMessage;
        public int status;
        public int type;
        public long unbindOkPanelCloseTime;

        public static final class ContactName extends qw8 {
            public static final int CUSTOM = 1;
            public static final int DEVICE = 2;
            public static final int ONEME = 3;
            public static final int UNKNOWN = 0;
            private static volatile ContactName[] _emptyArray;
            public String lastName;
            public String name;
            public int type;

            public ContactName() {
                clear();
            }

            public static ContactName[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ContactName[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ContactName parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ContactName) qw8.mergeFrom(new ContactName(), bArr);
            }

            public ContactName clear() {
                this.name = "";
                this.type = 0;
                this.lastName = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                int iL = !this.name.equals("") ? y43.l(1, this.name) : 0;
                int i = this.type;
                if (i != 0) {
                    iL += y43.f(2, i);
                }
                return !this.lastName.equals("") ? iL + y43.l(3, this.lastName) : iL;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                if (!this.name.equals("")) {
                    y43Var.E(1, this.name);
                }
                int i = this.type;
                if (i != 0) {
                    y43Var.w(2, i);
                }
                if (this.lastName.equals("")) {
                    return;
                }
                y43Var.E(3, this.lastName);
            }

            public static ContactName parseFrom(x43 x43Var) throws IOException {
                return new ContactName().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public ContactName mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 10) {
                        this.name = x43Var.r();
                    } else if (iS == 16) {
                        int iP = x43Var.p();
                        if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                            this.type = iP;
                        }
                    } else if (iS == 26) {
                        this.lastName = x43Var.r();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public static final class MenuButton extends qw8 {
            private static volatile MenuButton[] _emptyArray;
            public String text;

            public MenuButton() {
                clear();
            }

            public static MenuButton[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new MenuButton[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static MenuButton parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (MenuButton) qw8.mergeFrom(new MenuButton(), bArr);
            }

            public MenuButton clear() {
                this.text = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                if (this.text.equals("")) {
                    return 0;
                }
                return y43.l(1, this.text);
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                if (this.text.equals("")) {
                    return;
                }
                y43Var.E(1, this.text);
            }

            public static MenuButton parseFrom(x43 x43Var) throws IOException {
                return new MenuButton().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public MenuButton mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 10) {
                        this.text = x43Var.r();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public static final class StartMessage extends qw8 {
            private static volatile StartMessage[] _emptyArray;
            public MessageElement[] elements;
            public Attaches.Attach media;
            public String text;

            public StartMessage() {
                clear();
            }

            public static StartMessage[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new StartMessage[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static StartMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (StartMessage) qw8.mergeFrom(new StartMessage(), bArr);
            }

            public StartMessage clear() {
                this.media = null;
                this.text = "";
                this.elements = MessageElement.emptyArray();
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                Attaches.Attach attach = this.media;
                int i = 0;
                int i2 = attach != null ? y43.i(1, attach) : 0;
                if (!this.text.equals("")) {
                    i2 += y43.l(2, this.text);
                }
                MessageElement[] messageElementArr = this.elements;
                if (messageElementArr != null && messageElementArr.length > 0) {
                    while (true) {
                        MessageElement[] messageElementArr2 = this.elements;
                        if (i >= messageElementArr2.length) {
                            break;
                        }
                        MessageElement messageElement = messageElementArr2[i];
                        if (messageElement != null) {
                            i2 = y43.i(3, messageElement) + i2;
                        }
                        i++;
                    }
                }
                return i2;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                Attaches.Attach attach = this.media;
                if (attach != null) {
                    y43Var.y(1, attach);
                }
                if (!this.text.equals("")) {
                    y43Var.E(2, this.text);
                }
                MessageElement[] messageElementArr = this.elements;
                if (messageElementArr == null || messageElementArr.length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    MessageElement[] messageElementArr2 = this.elements;
                    if (i >= messageElementArr2.length) {
                        return;
                    }
                    MessageElement messageElement = messageElementArr2[i];
                    if (messageElement != null) {
                        y43Var.y(3, messageElement);
                    }
                    i++;
                }
            }

            public static StartMessage parseFrom(x43 x43Var) throws IOException {
                return new StartMessage().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public StartMessage mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 10) {
                        if (this.media == null) {
                            this.media = new Attaches.Attach();
                        }
                        x43Var.j(this.media);
                    } else if (iS == 18) {
                        this.text = x43Var.r();
                    } else if (iS == 26) {
                        int iW = nd7.w(x43Var, 26);
                        MessageElement[] messageElementArr = this.elements;
                        int length = messageElementArr == null ? 0 : messageElementArr.length;
                        int i = iW + length;
                        MessageElement[] messageElementArr2 = new MessageElement[i];
                        if (length != 0) {
                            System.arraycopy(messageElementArr, 0, messageElementArr2, 0, length);
                        }
                        while (length < i - 1) {
                            MessageElement messageElement = new MessageElement();
                            messageElementArr2[length] = messageElement;
                            x43Var.j(messageElement);
                            x43Var.s();
                            length++;
                        }
                        MessageElement messageElement2 = new MessageElement();
                        messageElementArr2[length] = messageElement2;
                        x43Var.j(messageElement2);
                        this.elements = messageElementArr2;
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public Contact() {
            clear();
        }

        public static Contact[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Contact[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Contact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Contact) qw8.mergeFrom(new Contact(), bArr);
        }

        public Contact clear() {
            this.serverId = 0L;
            this.deviceAvatarUrl = "";
            this.deviceName = "";
            this.lastUpdateTime = 0L;
            this.serverPhone = 0L;
            this.status = 0;
            this.type = 0;
            this.gender = 0;
            this.settings = 0;
            this.names = ContactName.emptyArray();
            int[] iArr = nd7.c;
            this.options = iArr;
            this.description = "";
            this.link = "";
            this.birthday = "";
            this.photoId = 0L;
            this.baseUrl = "";
            this.baseRawUrl = "";
            this.unbindOkPanelCloseTime = 0L;
            this.lastSearchClickTime = 0L;
            this.lastSyncTime = 0L;
            this.lastShowingUnknownContactBar = 0L;
            this.portalStatus = 0;
            this.menuButton = null;
            this.profileOptions = iArr;
            this.startMessage = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            int[] iArr;
            int[] iArr2;
            long j = this.serverId;
            int i = 0;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.deviceAvatarUrl.equals("")) {
                iH += y43.l(4, this.deviceAvatarUrl);
            }
            if (!this.deviceName.equals("")) {
                iH += y43.l(6, this.deviceName);
            }
            long j2 = this.lastUpdateTime;
            if (j2 != 0) {
                iH += y43.h(8, j2);
            }
            long j3 = this.serverPhone;
            if (j3 != 0) {
                iH += y43.h(9, j3);
            }
            int i2 = this.status;
            if (i2 != 0) {
                iH += y43.f(10, i2);
            }
            int i3 = this.type;
            if (i3 != 0) {
                iH += y43.f(11, i3);
            }
            int i4 = this.gender;
            if (i4 != 0) {
                iH += y43.f(12, i4);
            }
            int i5 = this.settings;
            if (i5 != 0) {
                iH += y43.f(13, i5);
            }
            ContactName[] contactNameArr = this.names;
            if (contactNameArr != null && contactNameArr.length > 0) {
                int i6 = 0;
                while (true) {
                    ContactName[] contactNameArr2 = this.names;
                    if (i6 >= contactNameArr2.length) {
                        break;
                    }
                    ContactName contactName = contactNameArr2[i6];
                    if (contactName != null) {
                        iH = y43.i(14, contactName) + iH;
                    }
                    i6++;
                }
            }
            int[] iArr3 = this.options;
            if (iArr3 != null && iArr3.length > 0) {
                int i7 = 0;
                int iG = 0;
                while (true) {
                    iArr2 = this.options;
                    if (i7 >= iArr2.length) {
                        break;
                    }
                    iG += y43.g(iArr2[i7]);
                    i7++;
                }
                iH = iH + iG + iArr2.length;
            }
            if (!this.description.equals("")) {
                iH += y43.l(16, this.description);
            }
            if (!this.link.equals("")) {
                iH += y43.l(17, this.link);
            }
            if (!this.birthday.equals("")) {
                iH += y43.l(18, this.birthday);
            }
            long j4 = this.photoId;
            if (j4 != 0) {
                iH += y43.h(19, j4);
            }
            if (!this.baseUrl.equals("")) {
                iH += y43.l(20, this.baseUrl);
            }
            if (!this.baseRawUrl.equals("")) {
                iH += y43.l(21, this.baseRawUrl);
            }
            long j5 = this.unbindOkPanelCloseTime;
            if (j5 != 0) {
                iH += y43.h(22, j5);
            }
            long j6 = this.lastSearchClickTime;
            if (j6 != 0) {
                iH += y43.h(23, j6);
            }
            long j7 = this.lastSyncTime;
            if (j7 != 0) {
                iH += y43.h(24, j7);
            }
            long j8 = this.lastShowingUnknownContactBar;
            if (j8 != 0) {
                iH += y43.h(25, j8);
            }
            int i8 = this.portalStatus;
            if (i8 != 0) {
                iH += y43.f(27, i8);
            }
            MenuButton menuButton = this.menuButton;
            if (menuButton != null) {
                iH += y43.i(28, menuButton);
            }
            int[] iArr4 = this.profileOptions;
            if (iArr4 != null && iArr4.length > 0) {
                int iG2 = 0;
                while (true) {
                    iArr = this.profileOptions;
                    if (i >= iArr.length) {
                        break;
                    }
                    iG2 += y43.g(iArr[i]);
                    i++;
                }
                iH = iH + iG2 + (iArr.length * 2);
            }
            StartMessage startMessage = this.startMessage;
            return startMessage != null ? iH + y43.i(30, startMessage) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.deviceAvatarUrl.equals("")) {
                y43Var.E(4, this.deviceAvatarUrl);
            }
            if (!this.deviceName.equals("")) {
                y43Var.E(6, this.deviceName);
            }
            long j2 = this.lastUpdateTime;
            if (j2 != 0) {
                y43Var.x(8, j2);
            }
            long j3 = this.serverPhone;
            if (j3 != 0) {
                y43Var.x(9, j3);
            }
            int i = this.status;
            if (i != 0) {
                y43Var.w(10, i);
            }
            int i2 = this.type;
            if (i2 != 0) {
                y43Var.w(11, i2);
            }
            int i3 = this.gender;
            if (i3 != 0) {
                y43Var.w(12, i3);
            }
            int i4 = this.settings;
            if (i4 != 0) {
                y43Var.w(13, i4);
            }
            ContactName[] contactNameArr = this.names;
            int i5 = 0;
            if (contactNameArr != null && contactNameArr.length > 0) {
                int i6 = 0;
                while (true) {
                    ContactName[] contactNameArr2 = this.names;
                    if (i6 >= contactNameArr2.length) {
                        break;
                    }
                    ContactName contactName = contactNameArr2[i6];
                    if (contactName != null) {
                        y43Var.y(14, contactName);
                    }
                    i6++;
                }
            }
            int[] iArr = this.options;
            if (iArr != null && iArr.length > 0) {
                int i7 = 0;
                while (true) {
                    int[] iArr2 = this.options;
                    if (i7 >= iArr2.length) {
                        break;
                    }
                    y43Var.w(15, iArr2[i7]);
                    i7++;
                }
            }
            if (!this.description.equals("")) {
                y43Var.E(16, this.description);
            }
            if (!this.link.equals("")) {
                y43Var.E(17, this.link);
            }
            if (!this.birthday.equals("")) {
                y43Var.E(18, this.birthday);
            }
            long j4 = this.photoId;
            if (j4 != 0) {
                y43Var.x(19, j4);
            }
            if (!this.baseUrl.equals("")) {
                y43Var.E(20, this.baseUrl);
            }
            if (!this.baseRawUrl.equals("")) {
                y43Var.E(21, this.baseRawUrl);
            }
            long j5 = this.unbindOkPanelCloseTime;
            if (j5 != 0) {
                y43Var.x(22, j5);
            }
            long j6 = this.lastSearchClickTime;
            if (j6 != 0) {
                y43Var.x(23, j6);
            }
            long j7 = this.lastSyncTime;
            if (j7 != 0) {
                y43Var.x(24, j7);
            }
            long j8 = this.lastShowingUnknownContactBar;
            if (j8 != 0) {
                y43Var.x(25, j8);
            }
            int i8 = this.portalStatus;
            if (i8 != 0) {
                y43Var.w(27, i8);
            }
            MenuButton menuButton = this.menuButton;
            if (menuButton != null) {
                y43Var.y(28, menuButton);
            }
            int[] iArr3 = this.profileOptions;
            if (iArr3 != null && iArr3.length > 0) {
                while (true) {
                    int[] iArr4 = this.profileOptions;
                    if (i5 >= iArr4.length) {
                        break;
                    }
                    y43Var.w(29, iArr4[i5]);
                    i5++;
                }
            }
            StartMessage startMessage = this.startMessage;
            if (startMessage != null) {
                y43Var.y(30, startMessage);
            }
        }

        public static Contact parseFrom(x43 x43Var) throws IOException {
            return new Contact().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public Contact mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                switch (iS) {
                    case 0:
                        return this;
                    case 8:
                        this.serverId = x43Var.q();
                        break;
                    case 34:
                        this.deviceAvatarUrl = x43Var.r();
                        break;
                    case 50:
                        this.deviceName = x43Var.r();
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        this.lastUpdateTime = x43Var.q();
                        break;
                    case 72:
                        this.serverPhone = x43Var.q();
                        break;
                    case 80:
                        int iP = x43Var.p();
                        if (iP != 0 && iP != 1 && iP != 2) {
                            break;
                        } else {
                            this.status = iP;
                            break;
                        }
                        break;
                    case 88:
                        int iP2 = x43Var.p();
                        if (iP2 != 0 && iP2 != 1) {
                            break;
                        } else {
                            this.type = iP2;
                            break;
                        }
                    case 96:
                        int iP3 = x43Var.p();
                        if (iP3 != 0 && iP3 != 1 && iP3 != 2) {
                            break;
                        } else {
                            this.gender = iP3;
                            break;
                        }
                    case 104:
                        this.settings = x43Var.p();
                        break;
                    case 114:
                        int iW = nd7.w(x43Var, 114);
                        ContactName[] contactNameArr = this.names;
                        int length = contactNameArr == null ? 0 : contactNameArr.length;
                        int i = iW + length;
                        ContactName[] contactNameArr2 = new ContactName[i];
                        if (length != 0) {
                            System.arraycopy(contactNameArr, 0, contactNameArr2, 0, length);
                        }
                        while (length < i - 1) {
                            ContactName contactName = new ContactName();
                            contactNameArr2[length] = contactName;
                            x43Var.j(contactName);
                            x43Var.s();
                            length++;
                        }
                        ContactName contactName2 = new ContactName();
                        contactNameArr2[length] = contactName2;
                        x43Var.j(contactName2);
                        this.names = contactNameArr2;
                        break;
                    case 120:
                        int iW2 = nd7.w(x43Var, 120);
                        int[] iArr = new int[iW2];
                        int i2 = 0;
                        for (int i3 = 0; i3 < iW2; i3++) {
                            if (i3 != 0) {
                                x43Var.s();
                            }
                            int iP4 = x43Var.p();
                            if (iP4 == 0 || iP4 == 1 || iP4 == 2 || iP4 == 3) {
                                iArr[i2] = iP4;
                                i2++;
                            }
                        }
                        if (i2 == 0) {
                            break;
                        } else {
                            int[] iArr2 = this.options;
                            int length2 = iArr2 == null ? 0 : iArr2.length;
                            if (length2 != 0 || i2 != iW2) {
                                int[] iArr3 = new int[length2 + i2];
                                if (length2 != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length2);
                                }
                                System.arraycopy(iArr, 0, iArr3, length2, i2);
                                this.options = iArr3;
                                break;
                            } else {
                                this.options = iArr;
                                break;
                            }
                        }
                    case 122:
                        int iE = x43Var.e(x43Var.p());
                        int iC = x43Var.c();
                        int i4 = 0;
                        while (x43Var.b() > 0) {
                            int iP5 = x43Var.p();
                            if (iP5 == 0 || iP5 == 1 || iP5 == 2 || iP5 == 3) {
                                i4++;
                            }
                        }
                        if (i4 != 0) {
                            x43Var.t(iC);
                            int[] iArr4 = this.options;
                            int length3 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[i4 + length3];
                            if (length3 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length3);
                            }
                            while (x43Var.b() > 0) {
                                int iP6 = x43Var.p();
                                if (iP6 == 0 || iP6 == 1 || iP6 == 2 || iP6 == 3) {
                                    iArr5[length3] = iP6;
                                    length3++;
                                }
                            }
                            this.options = iArr5;
                        }
                        x43Var.d(iE);
                        break;
                    case 130:
                        this.description = x43Var.r();
                        break;
                    case 138:
                        this.link = x43Var.r();
                        break;
                    case 146:
                        this.birthday = x43Var.r();
                        break;
                    case 152:
                        this.photoId = x43Var.q();
                        break;
                    case 162:
                        this.baseUrl = x43Var.r();
                        break;
                    case 170:
                        this.baseRawUrl = x43Var.r();
                        break;
                    case 176:
                        this.unbindOkPanelCloseTime = x43Var.q();
                        break;
                    case 184:
                        this.lastSearchClickTime = x43Var.q();
                        break;
                    case 192:
                        this.lastSyncTime = x43Var.q();
                        break;
                    case 200:
                        this.lastShowingUnknownContactBar = x43Var.q();
                        break;
                    case 216:
                        int iP7 = x43Var.p();
                        if (iP7 != 0 && iP7 != 1) {
                            break;
                        } else {
                            this.portalStatus = iP7;
                            break;
                        }
                    case 226:
                        if (this.menuButton == null) {
                            this.menuButton = new MenuButton();
                        }
                        x43Var.j(this.menuButton);
                        break;
                    case 232:
                        int iW3 = nd7.w(x43Var, 232);
                        int[] iArr6 = this.profileOptions;
                        int length4 = iArr6 == null ? 0 : iArr6.length;
                        int i5 = iW3 + length4;
                        int[] iArr7 = new int[i5];
                        if (length4 != 0) {
                            System.arraycopy(iArr6, 0, iArr7, 0, length4);
                        }
                        while (length4 < i5 - 1) {
                            iArr7[length4] = x43Var.p();
                            x43Var.s();
                            length4++;
                        }
                        iArr7[length4] = x43Var.p();
                        this.profileOptions = iArr7;
                        break;
                    case 234:
                        int iE2 = x43Var.e(x43Var.p());
                        int iC2 = x43Var.c();
                        int i6 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.p();
                            i6++;
                        }
                        x43Var.t(iC2);
                        int[] iArr8 = this.profileOptions;
                        int length5 = iArr8 == null ? 0 : iArr8.length;
                        int i7 = i6 + length5;
                        int[] iArr9 = new int[i7];
                        if (length5 != 0) {
                            System.arraycopy(iArr8, 0, iArr9, 0, length5);
                        }
                        while (length5 < i7) {
                            iArr9[length5] = x43Var.p();
                            length5++;
                        }
                        this.profileOptions = iArr9;
                        x43Var.d(iE2);
                        break;
                    case 242:
                        if (this.startMessage == null) {
                            this.startMessage = new StartMessage();
                        }
                        x43Var.j(this.startMessage);
                        break;
                    default:
                        if (!x43Var.u(iS)) {
                            return this;
                        }
                        break;
                }
            }
        }
    }

    public static final class LogEvent extends qw8 {
        private static volatile LogEvent[] _emptyArray;
        public String event;
        public byte[] params;
        public long sessionId;
        public long time;
        public String type;
        public long userId;

        public LogEvent() {
            clear();
        }

        public static LogEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LogEvent[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static LogEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LogEvent) qw8.mergeFrom(new LogEvent(), bArr);
        }

        public LogEvent clear() {
            this.time = 0L;
            this.type = "";
            this.event = "";
            this.params = nd7.g;
            this.userId = 0L;
            this.sessionId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.time;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.type.equals("")) {
                iH += y43.l(2, this.type);
            }
            if (!this.event.equals("")) {
                iH += y43.l(3, this.event);
            }
            if (!Arrays.equals(this.params, nd7.g)) {
                iH += y43.b(4, this.params);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                iH += y43.h(5, j2);
            }
            long j3 = this.sessionId;
            return j3 != 0 ? iH + y43.h(6, j3) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.time;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.type.equals("")) {
                y43Var.E(2, this.type);
            }
            if (!this.event.equals("")) {
                y43Var.E(3, this.event);
            }
            if (!Arrays.equals(this.params, nd7.g)) {
                y43Var.s(4, this.params);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                y43Var.x(5, j2);
            }
            long j3 = this.sessionId;
            if (j3 != 0) {
                y43Var.x(6, j3);
            }
        }

        public static LogEvent parseFrom(x43 x43Var) throws IOException {
            return new LogEvent().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public LogEvent mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.time = x43Var.q();
                } else if (iS == 18) {
                    this.type = x43Var.r();
                } else if (iS == 26) {
                    this.event = x43Var.r();
                } else if (iS == 34) {
                    this.params = x43Var.g();
                } else if (iS == 40) {
                    this.userId = x43Var.q();
                } else if (iS == 48) {
                    this.sessionId = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class LongList extends qw8 {
        private static volatile LongList[] _emptyArray;
        public long[] value;

        public LongList() {
            clear();
        }

        public static LongList[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LongList[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static LongList parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LongList) qw8.mergeFrom(new LongList(), bArr);
        }

        public LongList clear() {
            this.value = nd7.d;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long[] jArr = this.value;
            int i = 0;
            if (jArr == null || jArr.length <= 0) {
                return 0;
            }
            int iK = 0;
            while (true) {
                long[] jArr2 = this.value;
                if (i >= jArr2.length) {
                    return iK + jArr2.length;
                }
                iK += y43.k(jArr2[i]);
                i++;
            }
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long[] jArr = this.value;
            if (jArr == null || jArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                long[] jArr2 = this.value;
                if (i >= jArr2.length) {
                    return;
                }
                y43Var.x(1, jArr2[i]);
                i++;
            }
        }

        public static LongList parseFrom(x43 x43Var) throws IOException {
            return new LongList().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public LongList mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    int iW = nd7.w(x43Var, 8);
                    long[] jArr = this.value;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iW + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = x43Var.q();
                        x43Var.s();
                        length++;
                    }
                    jArr2[length] = x43Var.q();
                    this.value = jArr2;
                } else if (iS == 10) {
                    int iE = x43Var.e(x43Var.p());
                    int iC = x43Var.c();
                    int i2 = 0;
                    while (x43Var.b() > 0) {
                        x43Var.q();
                        i2++;
                    }
                    x43Var.t(iC);
                    long[] jArr3 = this.value;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = x43Var.q();
                        length2++;
                    }
                    this.value = jArr4;
                    x43Var.d(iE);
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class MessageElement extends qw8 {
        public static final int ANIMOJI = 10;
        public static final int CODE = 9;
        public static final int EMPHASIZED = 4;
        public static final int GROUP_MENTION = 1;
        public static final int HEADING = 8;
        public static final int LINK = 5;
        public static final int MONOSPACED = 3;
        public static final int STRIKETHROUGH = 6;
        public static final int STRONG = 2;
        public static final int UNDERLINE = 7;
        public static final int USER_MENTION = 0;
        private static volatile MessageElement[] _emptyArray;
        public long entityId;
        public String entityName;
        public int from;
        public int length;
        public LinkAttributes linkAttributes;
        public int type;

        public static final class LinkAttributes extends qw8 {
            private static volatile LinkAttributes[] _emptyArray;
            public String url;

            public LinkAttributes() {
                clear();
            }

            public static LinkAttributes[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LinkAttributes[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static LinkAttributes parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (LinkAttributes) qw8.mergeFrom(new LinkAttributes(), bArr);
            }

            public LinkAttributes clear() {
                this.url = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                if (this.url.equals("")) {
                    return 0;
                }
                return y43.l(1, this.url);
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                if (this.url.equals("")) {
                    return;
                }
                y43Var.E(1, this.url);
            }

            public static LinkAttributes parseFrom(x43 x43Var) throws IOException {
                return new LinkAttributes().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public LinkAttributes mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 10) {
                        this.url = x43Var.r();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public MessageElement() {
            clear();
        }

        public static MessageElement[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageElement[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageElement parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageElement) qw8.mergeFrom(new MessageElement(), bArr);
        }

        public MessageElement clear() {
            this.entityId = 0L;
            this.entityName = "";
            this.type = 0;
            this.from = 0;
            this.length = 0;
            this.linkAttributes = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.entityId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.entityName.equals("")) {
                iH += y43.l(2, this.entityName);
            }
            int i = this.type;
            if (i != 0) {
                iH += y43.f(3, i);
            }
            int i2 = this.from;
            if (i2 != 0) {
                iH += y43.f(4, i2);
            }
            int i3 = this.length;
            if (i3 != 0) {
                iH += y43.f(5, i3);
            }
            LinkAttributes linkAttributes = this.linkAttributes;
            return linkAttributes != null ? iH + y43.i(6, linkAttributes) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.entityId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.entityName.equals("")) {
                y43Var.E(2, this.entityName);
            }
            int i = this.type;
            if (i != 0) {
                y43Var.w(3, i);
            }
            int i2 = this.from;
            if (i2 != 0) {
                y43Var.w(4, i2);
            }
            int i3 = this.length;
            if (i3 != 0) {
                y43Var.w(5, i3);
            }
            LinkAttributes linkAttributes = this.linkAttributes;
            if (linkAttributes != null) {
                y43Var.y(6, linkAttributes);
            }
        }

        public static MessageElement parseFrom(x43 x43Var) throws IOException {
            return new MessageElement().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MessageElement mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.entityId = x43Var.q();
                } else if (iS == 18) {
                    this.entityName = x43Var.r();
                } else if (iS == 24) {
                    int iP = x43Var.p();
                    switch (iP) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            this.type = iP;
                            break;
                    }
                } else if (iS == 32) {
                    this.from = x43Var.p();
                } else if (iS == 40) {
                    this.length = x43Var.p();
                } else if (iS == 50) {
                    if (this.linkAttributes == null) {
                        this.linkAttributes = new LinkAttributes();
                    }
                    x43Var.j(this.linkAttributes);
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class MessageElements extends qw8 {
        private static volatile MessageElements[] _emptyArray;
        public MessageElement[] elements;

        public MessageElements() {
            clear();
        }

        public static MessageElements[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageElements[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageElements parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageElements) qw8.mergeFrom(new MessageElements(), bArr);
        }

        public MessageElements clear() {
            this.elements = MessageElement.emptyArray();
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            MessageElement[] messageElementArr = this.elements;
            int i = 0;
            if (messageElementArr == null || messageElementArr.length <= 0) {
                return 0;
            }
            int i2 = 0;
            while (true) {
                MessageElement[] messageElementArr2 = this.elements;
                if (i >= messageElementArr2.length) {
                    return i2;
                }
                MessageElement messageElement = messageElementArr2[i];
                if (messageElement != null) {
                    i2 = y43.i(1, messageElement) + i2;
                }
                i++;
            }
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            MessageElement[] messageElementArr = this.elements;
            if (messageElementArr == null || messageElementArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                MessageElement[] messageElementArr2 = this.elements;
                if (i >= messageElementArr2.length) {
                    return;
                }
                MessageElement messageElement = messageElementArr2[i];
                if (messageElement != null) {
                    y43Var.y(1, messageElement);
                }
                i++;
            }
        }

        public static MessageElements parseFrom(x43 x43Var) throws IOException {
            return new MessageElements().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MessageElements mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 10) {
                    int iW = nd7.w(x43Var, 10);
                    MessageElement[] messageElementArr = this.elements;
                    int length = messageElementArr == null ? 0 : messageElementArr.length;
                    int i = iW + length;
                    MessageElement[] messageElementArr2 = new MessageElement[i];
                    if (length != 0) {
                        System.arraycopy(messageElementArr, 0, messageElementArr2, 0, length);
                    }
                    while (length < i - 1) {
                        MessageElement messageElement = new MessageElement();
                        messageElementArr2[length] = messageElement;
                        x43Var.j(messageElement);
                        x43Var.s();
                        length++;
                    }
                    MessageElement messageElement2 = new MessageElement();
                    messageElementArr2[length] = messageElement2;
                    x43Var.j(messageElement2);
                    this.elements = messageElementArr2;
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class MessagePreview extends qw8 {
        private static volatile MessagePreview[] _emptyArray;
        public Attaches attaches;
        public String text;

        public MessagePreview() {
            clear();
        }

        public static MessagePreview[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessagePreview[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MessagePreview parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessagePreview) qw8.mergeFrom(new MessagePreview(), bArr);
        }

        public MessagePreview clear() {
            this.text = "";
            this.attaches = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            int iL = !this.text.equals("") ? y43.l(1, this.text) : 0;
            Attaches attaches = this.attaches;
            return attaches != null ? iL + y43.i(2, attaches) : iL;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            if (!this.text.equals("")) {
                y43Var.E(1, this.text);
            }
            Attaches attaches = this.attaches;
            if (attaches != null) {
                y43Var.y(2, attaches);
            }
        }

        public static MessagePreview parseFrom(x43 x43Var) throws IOException {
            return new MessagePreview().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MessagePreview mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 10) {
                    this.text = x43Var.r();
                } else if (iS == 18) {
                    if (this.attaches == null) {
                        this.attaches = new Attaches();
                    }
                    x43Var.j(this.attaches);
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class MessageReactionWithCount extends qw8 {
        private static volatile MessageReactionWithCount[] _emptyArray;
        public int count;
        public ReactionData reaction;

        public MessageReactionWithCount() {
            clear();
        }

        public static MessageReactionWithCount[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageReactionWithCount[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageReactionWithCount parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageReactionWithCount) qw8.mergeFrom(new MessageReactionWithCount(), bArr);
        }

        public MessageReactionWithCount clear() {
            this.reaction = null;
            this.count = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            ReactionData reactionData = this.reaction;
            int i = reactionData != null ? y43.i(1, reactionData) : 0;
            int i2 = this.count;
            return i2 != 0 ? i + y43.f(2, i2) : i;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            ReactionData reactionData = this.reaction;
            if (reactionData != null) {
                y43Var.y(1, reactionData);
            }
            int i = this.count;
            if (i != 0) {
                y43Var.w(2, i);
            }
        }

        public static MessageReactionWithCount parseFrom(x43 x43Var) throws IOException {
            return new MessageReactionWithCount().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MessageReactionWithCount mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 10) {
                    if (this.reaction == null) {
                        this.reaction = new ReactionData();
                    }
                    x43Var.j(this.reaction);
                } else if (iS == 16) {
                    this.count = x43Var.p();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class MessageReactions extends qw8 {
        private static volatile MessageReactions[] _emptyArray;
        public MessageReactionWithCount[] reactions;
        public int totalCount;
        public ReactionData yourReaction;

        public MessageReactions() {
            clear();
        }

        public static MessageReactions[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageReactions[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageReactions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageReactions) qw8.mergeFrom(new MessageReactions(), bArr);
        }

        public MessageReactions clear() {
            this.reactions = MessageReactionWithCount.emptyArray();
            this.totalCount = 0;
            this.yourReaction = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
            int iF = 0;
            if (messageReactionWithCountArr != null && messageReactionWithCountArr.length > 0) {
                int i = 0;
                while (true) {
                    MessageReactionWithCount[] messageReactionWithCountArr2 = this.reactions;
                    if (iF >= messageReactionWithCountArr2.length) {
                        break;
                    }
                    MessageReactionWithCount messageReactionWithCount = messageReactionWithCountArr2[iF];
                    if (messageReactionWithCount != null) {
                        i = y43.i(1, messageReactionWithCount) + i;
                    }
                    iF++;
                }
                iF = i;
            }
            int i2 = this.totalCount;
            if (i2 != 0) {
                iF += y43.f(2, i2);
            }
            ReactionData reactionData = this.yourReaction;
            return reactionData != null ? iF + y43.i(3, reactionData) : iF;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
            if (messageReactionWithCountArr != null && messageReactionWithCountArr.length > 0) {
                int i = 0;
                while (true) {
                    MessageReactionWithCount[] messageReactionWithCountArr2 = this.reactions;
                    if (i >= messageReactionWithCountArr2.length) {
                        break;
                    }
                    MessageReactionWithCount messageReactionWithCount = messageReactionWithCountArr2[i];
                    if (messageReactionWithCount != null) {
                        y43Var.y(1, messageReactionWithCount);
                    }
                    i++;
                }
            }
            int i2 = this.totalCount;
            if (i2 != 0) {
                y43Var.w(2, i2);
            }
            ReactionData reactionData = this.yourReaction;
            if (reactionData != null) {
                y43Var.y(3, reactionData);
            }
        }

        public static MessageReactions parseFrom(x43 x43Var) throws IOException {
            return new MessageReactions().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MessageReactions mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 10) {
                    int iW = nd7.w(x43Var, 10);
                    MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
                    int length = messageReactionWithCountArr == null ? 0 : messageReactionWithCountArr.length;
                    int i = iW + length;
                    MessageReactionWithCount[] messageReactionWithCountArr2 = new MessageReactionWithCount[i];
                    if (length != 0) {
                        System.arraycopy(messageReactionWithCountArr, 0, messageReactionWithCountArr2, 0, length);
                    }
                    while (length < i - 1) {
                        MessageReactionWithCount messageReactionWithCount = new MessageReactionWithCount();
                        messageReactionWithCountArr2[length] = messageReactionWithCount;
                        x43Var.j(messageReactionWithCount);
                        x43Var.s();
                        length++;
                    }
                    MessageReactionWithCount messageReactionWithCount2 = new MessageReactionWithCount();
                    messageReactionWithCountArr2[length] = messageReactionWithCount2;
                    x43Var.j(messageReactionWithCount2);
                    this.reactions = messageReactionWithCountArr2;
                } else if (iS == 16) {
                    this.totalCount = x43Var.p();
                } else if (iS == 26) {
                    if (this.yourReaction == null) {
                        this.yourReaction = new ReactionData();
                    }
                    x43Var.j(this.yourReaction);
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class PendingUploadData extends qw8 {
        private static volatile PendingUploadData[] _emptyArray;
        public Map<Long, String> pendingMap;

        public PendingUploadData() {
            clear();
        }

        public static PendingUploadData[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new PendingUploadData[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static PendingUploadData parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (PendingUploadData) qw8.mergeFrom(new PendingUploadData(), bArr);
        }

        public PendingUploadData clear() {
            this.pendingMap = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            Map<Long, String> map = this.pendingMap;
            if (map != null) {
                return y37.a(map, 1, 3, 9);
            }
            return 0;
        }

        @Override // defpackage.qw8
        public PendingUploadData mergeFrom(x43 x43Var) throws IOException {
            py7 py7Var = s36.d;
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 10) {
                    this.pendingMap = y37.b(x43Var, this.pendingMap, py7Var, 3, 9, null, 8, 18);
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            Map<Long, String> map = this.pendingMap;
            if (map != null) {
                y37.d(y43Var, map, 1, 3, 9);
            }
        }

        public static PendingUploadData parseFrom(x43 x43Var) throws IOException {
            return new PendingUploadData().mergeFrom(x43Var);
        }
    }

    public static final class ReactionData extends qw8 {
        public static final int EMOJI = 0;
        public static final int STICKER = 1;
        private static volatile ReactionData[] _emptyArray;
        public String reaction;
        public int type;

        public ReactionData() {
            clear();
        }

        public static ReactionData[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ReactionData[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ReactionData parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ReactionData) qw8.mergeFrom(new ReactionData(), bArr);
        }

        public ReactionData clear() {
            this.type = 0;
            this.reaction = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            int i = this.type;
            int iF = i != 0 ? y43.f(1, i) : 0;
            return !this.reaction.equals("") ? iF + y43.l(2, this.reaction) : iF;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            int i = this.type;
            if (i != 0) {
                y43Var.w(1, i);
            }
            if (this.reaction.equals("")) {
                return;
            }
            y43Var.E(2, this.reaction);
        }

        public static ReactionData parseFrom(x43 x43Var) throws IOException {
            return new ReactionData().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ReactionData mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    int iP = x43Var.p();
                    if (iP == 0 || iP == 1) {
                        this.type = iP;
                    }
                } else if (iS == 18) {
                    this.reaction = x43Var.r();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class RestrictionsInfo extends qw8 {
        private static volatile RestrictionsInfo[] _emptyArray;
        public long expiration;

        public RestrictionsInfo() {
            clear();
        }

        public static RestrictionsInfo[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new RestrictionsInfo[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static RestrictionsInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (RestrictionsInfo) qw8.mergeFrom(new RestrictionsInfo(), bArr);
        }

        public RestrictionsInfo clear() {
            this.expiration = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.expiration;
            if (j != 0) {
                return y43.h(1, j);
            }
            return 0;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.expiration;
            if (j != 0) {
                y43Var.x(1, j);
            }
        }

        public static RestrictionsInfo parseFrom(x43 x43Var) throws IOException {
            return new RestrictionsInfo().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public RestrictionsInfo mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.expiration = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class SelfProfile extends qw8 {
        private static volatile SelfProfile[] _emptyArray;
        public int[] profileOptions;
        public Map<Integer, RestrictionsInfo> restrictions;
        public long serverId;

        public SelfProfile() {
            clear();
        }

        public static SelfProfile[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new SelfProfile[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static SelfProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SelfProfile) qw8.mergeFrom(new SelfProfile(), bArr);
        }

        public SelfProfile clear() {
            this.serverId = 0L;
            this.restrictions = null;
            this.profileOptions = nd7.c;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.serverId;
            int i = 0;
            int iH = j != 0 ? y43.h(1, j) : 0;
            Map<Integer, RestrictionsInfo> map = this.restrictions;
            if (map != null) {
                iH += y37.a(map, 2, 5, 11);
            }
            int[] iArr = this.profileOptions;
            if (iArr == null || iArr.length <= 0) {
                return iH;
            }
            int iG = 0;
            while (true) {
                int[] iArr2 = this.profileOptions;
                if (i >= iArr2.length) {
                    return iH + iG + iArr2.length;
                }
                iG += y43.g(iArr2[i]);
                i++;
            }
        }

        @Override // defpackage.qw8
        public SelfProfile mergeFrom(x43 x43Var) throws IOException {
            py7 py7Var = s36.d;
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.serverId = x43Var.q();
                } else if (iS == 18) {
                    this.restrictions = y37.b(x43Var, this.restrictions, py7Var, 5, 11, new RestrictionsInfo(), 8, 18);
                } else if (iS == 24) {
                    int iW = nd7.w(x43Var, 24);
                    int[] iArr = this.profileOptions;
                    int length = iArr == null ? 0 : iArr.length;
                    int i = iW + length;
                    int[] iArr2 = new int[i];
                    if (length != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length);
                    }
                    while (length < i - 1) {
                        iArr2[length] = x43Var.p();
                        x43Var.s();
                        length++;
                    }
                    iArr2[length] = x43Var.p();
                    this.profileOptions = iArr2;
                } else if (iS == 26) {
                    int iE = x43Var.e(x43Var.p());
                    int iC = x43Var.c();
                    int i2 = 0;
                    while (x43Var.b() > 0) {
                        x43Var.p();
                        i2++;
                    }
                    x43Var.t(iC);
                    int[] iArr3 = this.profileOptions;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int i3 = i2 + length2;
                    int[] iArr4 = new int[i3];
                    if (length2 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        iArr4[length2] = x43Var.p();
                        length2++;
                    }
                    this.profileOptions = iArr4;
                    x43Var.d(iE);
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            Map<Integer, RestrictionsInfo> map = this.restrictions;
            if (map != null) {
                y37.d(y43Var, map, 2, 5, 11);
            }
            int[] iArr = this.profileOptions;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int[] iArr2 = this.profileOptions;
                if (i >= iArr2.length) {
                    return;
                }
                y43Var.w(3, iArr2[i]);
                i++;
            }
        }

        public static SelfProfile parseFrom(x43 x43Var) throws IOException {
            return new SelfProfile().mergeFrom(x43Var);
        }
    }
}
