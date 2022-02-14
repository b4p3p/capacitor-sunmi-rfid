# capacitor-sunmi-rfid

plugin sunmi rfid

## Install

```bash
npm install capacitor-sunmi-rfid
npx cap sync
```

## API

<docgen-index>

* [`connect()`](#connect)
* [`disconnect()`](#disconnect)
* [`start()`](#start)
* [`stop()`](#stop)
* [`getScanModel()`](#getscanmodel)
* [`getInfo(...)`](#getinfo)
* [`getBatteryRemainingPercent(...)`](#getbatteryremainingpercent)
* [`onReadTag(...)`](#onreadtag)
* [`setTemporaryOutputPower(...)`](#settemporaryoutputpower)
* [Type Aliases](#type-aliases)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### connect()

```typescript
connect() => Promise<{ status: string; data: string; }>
```

**Returns:** <code>Promise&lt;{ status: string; data: string; }&gt;</code>

--------------------


### disconnect()

```typescript
disconnect() => Promise<{ status: string; data: string; }>
```

**Returns:** <code>Promise&lt;{ status: string; data: string; }&gt;</code>

--------------------


### start()

```typescript
start() => Promise<{ status: string; data: string; }>
```

**Returns:** <code>Promise&lt;{ status: string; data: string; }&gt;</code>

--------------------


### stop()

```typescript
stop() => Promise<{ status: string; data: string; }>
```

**Returns:** <code>Promise&lt;{ status: string; data: string; }&gt;</code>

--------------------


### getScanModel()

```typescript
getScanModel() => Promise<{ status: string; data: string; }>
```

**Returns:** <code>Promise&lt;{ status: string; data: string; }&gt;</code>

--------------------


### getInfo(...)

```typescript
getInfo(callback: HandlerInfo) => Promise<number>
```

| Param          | Type                                                |
| -------------- | --------------------------------------------------- |
| **`callback`** | <code><a href="#handlerinfo">HandlerInfo</a></code> |

**Returns:** <code>Promise&lt;number&gt;</code>

--------------------


### getBatteryRemainingPercent(...)

```typescript
getBatteryRemainingPercent(callback: HandlerInfo) => Promise<number>
```

| Param          | Type                                                |
| -------------- | --------------------------------------------------- |
| **`callback`** | <code><a href="#handlerinfo">HandlerInfo</a></code> |

**Returns:** <code>Promise&lt;number&gt;</code>

--------------------


### onReadTag(...)

```typescript
onReadTag(callback: any) => Promise<number>
```

| Param          | Type             |
| -------------- | ---------------- |
| **`callback`** | <code>any</code> |

**Returns:** <code>Promise&lt;number&gt;</code>

--------------------


### setTemporaryOutputPower(...)

```typescript
setTemporaryOutputPower(args: { power?: number; }) => Promise<{ status: string; data: string; }>
```

| Param      | Type                             |
| ---------- | -------------------------------- |
| **`args`** | <code>{ power?: number; }</code> |

**Returns:** <code>Promise&lt;{ status: string; data: string; }&gt;</code>

--------------------


### Type Aliases


#### HandlerInfo

<code>(myArgument: { key: string; value: string; }): void</code>

</docgen-api>
