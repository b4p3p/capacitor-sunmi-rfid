declare type HandlerInfo = (myArgument: {
   key: string;
   value: string;
}) => void;

export interface SunmiRFIDPlugin {
   connect(): Promise<{ status: string, data: string }>;
   disconnect(): Promise<{ status: string, data: string }>;
   getScanModel(): Promise<{ status: string, data: string }>;
   getInfo(callback:HandlerInfo): Promise<number>;
   getBatteryRemainingPercent(callback:HandlerInfo): Promise<number>;
   onReadTag(callback:any): Promise<number>;
}
