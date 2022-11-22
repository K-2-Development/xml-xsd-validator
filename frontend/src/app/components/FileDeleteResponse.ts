export class FileDeleteResponse {
  id: number;
  success: boolean;
  message: string;


  constructor(id: number, success: boolean, message: string) {
    this.id = id;
    this.success = success;
    this.message = message;
  }
}
